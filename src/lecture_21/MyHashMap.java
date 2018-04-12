package lecture_21;

import java.util.ArrayList;

public class MyHashMap<K,V> {

	ArrayList<HashNode<K, V>> data;
	int tableSize = 11;
	int count=0;
	
	public MyHashMap() {
		data = new ArrayList<HashNode<K, V>>();
		for(int i = 0 ; i < tableSize ; i ++){
			data.add(null);
		}
	}

	public void insert(K key,V value){
		int index = Math.abs(key.hashCode()%tableSize);
		
		HashNode<K, V> head = data.get(index);
		HashNode<K, V> temp = head;
		while(head!=null){
			if(head.key.equals(key)){
				head.value=value;
				return;
			}
			head=head.next;
		}
		head = temp;
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		newNode.next=head;
		head = newNode;
		data.set(index, head);
		count++;
		
		double loadFactor = (double)(count)/tableSize;
		
		/*if(loadFactor>0.7){
			rehashing();
		}*/
	}

	/*private void rehashing() {
		ArrayList<HashNode<K, V>> temp = data;
		data = new ArrayList<HashNode<K, V>>();
		int newTableSize = 2*tableSize;
		for(int i = 0 ;i<newTableSize;i++){
			data.add(null);
		}
		
		for(HashNode<K,V> current : temp){
			
		}
		
		
	}*/

	public void remove(K key){
		int index = Math.abs(key.hashCode()%tableSize);
		HashNode<K, V> head = data.get(index);
		HashNode<K, V> prev = null;

		while(head!=null){
			if(head.key.equals(key)){
				if(prev==null){
					head=head.next;
					data.set(index, head);
				}
				else{
					prev.next=head.next;
				}
				count--;
				return;
			}
			prev=head;
			head=head.next;
		}
	}

	public V search(K key){
		int index = Math.abs(key.hashCode()%tableSize);
		HashNode<K, V> head = data.get(index);
		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	

}
