package camhash;

public class Tester {
	public static void main(String[] args) {
		SimpleHashTable t1 = new SimpleHashTable(11);
		System.out.println("2.1 - Simple Hash Table created 't1' with size 11");
		System.out.println("2.2 - Inserting '34, 29, 53, 44, 120, 39, 45, 40' into the hash table and displaying after each insertion");
		t1.insert(34);
		t1.print();
		t1.insert(29);
		t1.print();
		t1.insert(53);
		t1.print();
		t1.insert(44);
		t1.print();
		t1.insert(120);
		t1.print();
		t1.insert(39);
		t1.print();
		t1.insert(45);
		t1.print();
		t1.insert(40);
		t1.print();
		
		System.out.println("\n2.3 - Deleting '120' and displaying hash table | result: " + t1.delete(120));
		t1.print();
		
		System.out.println("\n2.4 - Searching for '40' and displaying hash table | result: " + t1.search(40));
		t1.print();
		
		System.out.println("\n2.5 - Inserting '46' and displaying hash table | result: " + t1.insert(46));
		t1.print();
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		HashTable t2 = new HashTable(11);
		System.out.println("3.1 - Linear Probing table 't1' created with size 11");
		System.out.println("3.2 - Inserting '34, 29, 53, 44, 120, 39, 45, 40' into the hash table and displaying after each insertion");
		t2.insert(34);
		t2.print();
		t2.insert(29);
		t2.print();
		t2.insert(53);
		t2.print();
		t2.insert(44);
		t2.print();
		t2.insert(120);
		t2.print();
		t2.insert(39);
		t2.print();
		t2.insert(45);
		t2.print();
		t2.insert(40);
		t2.print();
		
		System.out.println("\n3.3 - Deleting '120' and displaying hash table | result: " + t2.delete(120));
		t2.print();
		
		System.out.println("\n3.4 - Searching for '40' and displaying hash table | result: " + t2.search(40));
		t2.print();
		
		System.out.println("\n2.5 - Inserting '46' and displaying hash table | result: " + t2.insert(46));
		t2.print();
		
		//additional testing 
		//t2.insert(50); //inserting to show we can reinsert at index 10
		//t2.print();
		//System.out.println("deleting a number thats not in the table" + t2.delete(66));
		
	}
	
}
