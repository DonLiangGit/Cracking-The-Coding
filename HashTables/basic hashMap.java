
// ** Note

Benefits: O(1) insertions, deletions & lookups
Disadvantage: 
1. Require a good hash function
Integer as input: 
a. Key mod Tablesize(if the integer ends 0 and tablesize is 10 it is bad), to solve it make sure tablesize is a prime number?.
String as input:
// ** Note
a. ASCII code
	Example:
	– Add ASCII codes for characters mod, 255 will give values in [ 0, 256 ) or [ 0, 255 ]
	– Replace + by xor
b. Honer formula
reference：http://www.cs.princeton.edu/~rs/AlgsDS07/10Hashing.pdf
// ** Note
Object as input:
2. Need for resizing(because of collision)
a. Separte chaining (Using hashfunction to decide scan which linked list to retrieve data)
	Disadvantage: kind of slow and need to implement linked list data structure.
	// ** Note
b. 開放定址法
If the usage of hashtable is high, we need to rehash the table.
To rehash the table, there are three situation:
a. When a hashtable reaches half full;
b. When a insertion could not be fulfilled;
c. When a hashtable reaches to some point;( we call it middle-of-the-road, the best one.)

In standart library,
to implement a HashTable, there are two methods.
// ** Note
a. HashSet Class( equals() & hashCode() );
Every string better has its own hashcode inside.
//Below is a implementation for hashcode method in a string.
//"Caching the hash code"
public fina class String{
	public int hashCode(){
		if (hash != 0 ){
			return hash;
		}
		for ( int i = 0; i < length(); i++ ){
			hash  = hash * 31 + (int) charAt(i);
		}
	}
}

In database, we use extendible hashing.

//Below is a basic example to implement a HashMap in Java
HashMap <String, String> map = new HashMap<String, String>();
map.put("Duoling","Graduate Student");
map.put("Java", "Expert");
System.out.println(map.get("Duoling"));
