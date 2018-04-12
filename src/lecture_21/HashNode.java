package lecture_21;

public class HashNode<K, V> {
	
	public K key;
	public V value;
	HashNode<K, V> next;
	
	public HashNode(K key,V value) {
		this.key=key;
		this.value=value;
		next=null;
	}

}
