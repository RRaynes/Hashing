package camhash;

//Hash Table using Linear Probing

public class HashTable {
	int content[];
	boolean occupied[]; //
	boolean marked[];
	
	public HashTable(int size) {
		content = new int[size];
		occupied = new boolean[size];
		marked = new boolean[size];
	}
	
	public HashTable() {
		this(20);
	}
	
	int hash(int key, int i) {
		return (key % content.length + i) % content.length;
	}
}
