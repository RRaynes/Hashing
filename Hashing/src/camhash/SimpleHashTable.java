package camhash;

public class SimpleHashTable {
	int[] content;
	boolean[] occupied;
	
	public SimpleHashTable(int size) {
		content = new int[size];
		occupied = new boolean[size];
	}
	
	public SimpleHashTable() {
		this(20);
	}
	
	//returns hash index given a key using key%table size
	int hash(int key) {
		return key%content.length;
	}
	
	//inserts if the position is available, returns false if it is already occupied
	boolean insert(int key) {
		int index = hash(key);
		if (occupied[index] == true)
			return false;
		content[index] = key;
		occupied[index] = true;
		return true;
	}
	
	//searches for 'key' returns index, if not there, returns -1
	int search(int key) {
		int index = hash(key);
		if (occupied[index] == true && content[index] == key) //only condition that means the key is present
			return index;
		return -1; //otherwise return -1
	}
	
	//searches for 'key' at index, if its there deletes it, if not does nothing
	boolean delete(int key) {
		int index = hash(key);
		if (occupied[index] == true && content[index] == key) { //condition where the key is found
			occupied[index] = false;
			return true;
		} 
		return false;
	}
}
