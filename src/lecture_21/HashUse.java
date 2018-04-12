package lecture_21;

public class HashUse {

	public static void main(String[] args) {
		MyHashMap<String, Integer> data = new MyHashMap<String,Integer>();
		
		System.out.println(data.data.size());
		
		
		
		data.insert("krishna", 123);
		System.out.println(data.search("krishna"));
		data.insert("kra", 1234);
		data.insert("krna", 12345);
		data.insert("krishna", 123456);
		
		System.out.println(data.search("krishna"));
		data.remove("krishna");
		System.out.println(data.search("krishna"));
		System.out.println(data.count);

	}

}
