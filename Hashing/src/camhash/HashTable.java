package camhash;

import java.util.Arrays;

//Hash Table using Linear Probing

public class HashTable {
	int content[];
	boolean occupied[];
	boolean available[];
	int TS; //size of table
	
	public HashTable(int size) {
		content = new int[size];
		occupied = new boolean[size];
		available = new boolean[size];
		TS = size;
		Arrays.fill(available, true);
	}
	
	public HashTable() {
		this(20);
	}
	
	
	
	/**
	 * @param key		value to check for
	 * @param index		index to start probing at
	 * @return 			either returns an available position or the first index probed
	 * 						-1 is returned if there aren't other spots
	 * 						index is either available or a match
	 */
	int probe(int key, int index) {
		int firstIndex = index; //tracks first index
		boolean visitFirst = false; //tracks if we have visited the firstIndex yet
		while (occupied[index]) {
			System.out.println(index);
			if (available[index]) { //if the index is available, return it
				return index;
			}
			if (visitFirst && index == firstIndex) {
				System.out.println();
				//in this scenario we are revisiting the first index, and should return -1
				//as we have not found a match or available position
				return -1;
			}
			//we check here if the key is at the probed index
			if (content[index] == key) {
				return index;
			}
			index = ((index%TS)+1)%TS; //add too the table size
			visitFirst = true;
		}
		return index;
	}
	
	int probe(int key) {
		return probe(key,key%content.length);
	}
	
	/**
	 * search function for 'key'
	 * @param key
	 * @return
	 */
	int insert(int key) {
		int index = probe(key);
		//if ()
		
		
		
		if (index == -1) {
			return index;
		}
		
		return -1;
	}
	
	void print() {
		System.out.print("Index:\t\t");
		for (int i = 0; i < content.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\nContent:\t");
		for (int i : content) {
			System.out.print(i + "\t");
		}
		System.out.print("\nOccupied:\t");
		for (boolean b : occupied) {
			if (b)
				System.out.print("T" + "\t");
			else
				System.out.print("F" + "\t");
		}
		System.out.print("\nAvailable:\t");
		for (boolean b : available) {
			if (b)
				System.out.print("T" + "\t");
			else
				System.out.print("F" + "\t");
		}
		System.out.println("\n");
	}
}
