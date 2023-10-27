package camhash;

public class Tester {
	public static void main(String[] args) {
//		SimpleHashTable t1 = new SimpleHashTable(11);
//		System.out.println("2.1 - Simple Hash Table creaeted 't1' with size 11");
//		System.out.println("2.2 - Inserting '34, 29, 53, 44, 120, 39, 45, 40' into the hash table and displaying after each insertion");
//		t1.insert(34);
//		t1.print();
//		t1.insert(29);
//		t1.print();
//		t1.insert(53);
//		t1.print();
//		t1.insert(44);
//		t1.print();
//		t1.insert(120);
//		t1.print();
//		t1.insert(39);
//		t1.print();
//		t1.insert(45);
//		t1.print();
//		t1.insert(40);
//		t1.print();
//		
//		System.out.println("\n2.3 - Deleting '120' and displaying hash table | result: " + t1.delete(120));
//		t1.print();
//		
//		System.out.println("\n2.4 - Inserting '40' and displaying hash table | result: " + t1.insert(40));
//		t1.print();
//		
//		System.out.println("\n2.5 - Inserting '46' and displaying hash table | result: " + t1.insert(46));
//		t1.print();
//		
//		System.out.println("----------------------------------------------------------------------------------------------------");
//		
//		System.out.println("\n3.1");
		
		HashTable t2 = new HashTable(4);
		t2.content[1] = 5;
		t2.content[2] = 6;
		
		t2.available[1] = false;
		t2.available[2] = false;
		
		t2.occupied[1] = true;
		t2.occupied[2] = true;
		
		t2.print();
		
		System.out.println("\n" +t2.probe(9,1));
	}
	
}
