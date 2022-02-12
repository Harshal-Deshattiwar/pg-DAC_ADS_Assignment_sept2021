package _25.HashTableChaning;
public class HashTable {
	SListNode[] hashTable;
	int size;

	public HashTable(int n) {
		size = n;
		// Create array of references to SListNode, each set to null.
		hashTable = new SListNode[size];
	}

	private int hashFunctionModN(int key) {
		return key % size;
	}


	
	private void chaining(int key, int bucketId) {
		
		SListNode node= hashTable[bucketId];
//--------------------------------------------------------------
		//if the key is already present
		/*
		 * SListNode firstPos = hashTable[bucketId];
		while(node.getNext() !=null && node.getKey()!=key) 
			node=node.getNext();
		if(node.getKey()==key) {
			System.out.println("Key:" +key+" already present");
			return;
			}
		else {
		SListNode firstNode= new SListNode(key);
		firstNode.setNext(node);
		hashTable[bucketId]=firstNode;
		}
			*/
//----------------------------------------------------------------------------		
		SListNode firstNode= new SListNode(key);
		firstNode.setNext(node);
		hashTable[bucketId]=firstNode;
//--------------------------------------------------------------------
	}

	public void Add(int key) {
		int bucketId = hashFunctionModN(key);

		if (hashTable[bucketId] == null) {
			// Bucket is empty. Create a new Bucket object.
			hashTable[bucketId]=new SListNode(key);
			return;
		}

		// Bucket is full.
		System.out.println("Key with same bucket id found");
		chaining(key,bucketId);
		System.out.println("Element stored using chaining");
	}

	public boolean Search(int key) {
		int bucketId = hashFunctionModN(key);
		if(hashTable[bucketId]==null)
			return false;
		
		SListNode node= hashTable[bucketId];
		
		while(node!=null && node.getKey()!=key)
			node=node.getNext();
		if(node==null)
			return false;
		else return true;
	}
}
