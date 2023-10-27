package camhash;

import java.util.Arrays;

//Hash Table using Linear Probing

public class HashTable {
	int content[];
	boolean occupied[]; //
	boolean available[];
	
	public HashTable(int size) {
		content = new int[size];
		occupied = new boolean[size];
		available = new boolean[size];
		Arrays.fill(available, true);
	}
	
	public HashTable() {
		this(20);
	}
	
	
	
	/**
	 * 
	 * @param key
	 * @param index
	 * @return 			either returns an available position or the first index probed
	 */
	int probe(int key, int index) {
		boolean found = false; //if true this means we have found the key
					
		
		return 1;
	}
	
	int probe(int key) {
		return probe(key,0);
	}
	
	int hash(int key,int i) {
		return (key%content.length + i)%content.length; //this seems the same as '(key+1)%content.length'? 
														//I just used the function outlined in the assignment
	}
	
	/**
	 * search function for 'key'
	 * @param key
	 * @return
	 */
	int insert(int key) {
		int index = probe(key,0);
		
		return -1;
	}
	
	
}
