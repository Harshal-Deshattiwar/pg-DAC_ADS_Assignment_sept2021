public class HashTable {
	Bucket[] hashTable;
	int size;

	public HashTable(int n) {
		size = n;
		// Create array of references to Bucket, each set to null.
		hashTable = new Bucket[size];
	}

	private int hashFunctionModN(int key) {
		return key % size;
	}

	private int FindNextBucketUsingLinearProbing(int bucketId) {
		for (int i = 1; i < size; ++i) {
			int t = (bucketId + i) % size;
			// Is t'th bucket empty?
			if (hashTable[t] == null) {
				// Found an empty bucket.
				return t;
			}
		}
		return -1;
	}

	public void Add(int key) {
		int bucketId = hashFunctionModN(key);

		if (hashTable[bucketId] == null) {
			// Bucket is empty. Create a new Bucket object.
			hashTable[bucketId] = new Bucket();
			hashTable[bucketId].key = key;
			return;
		}

		// Bucket is full.
		System.out.println("Collision: Key = " + key + " bucketId = " + bucketId);
		hashTable[bucketId].isCollision = true;

		bucketId = FindNextBucketUsingLinearProbing(bucketId);
		System.out.println("For Key = " + key + " bucketId via linear probing = " + bucketId);
		// Create a new Bucket and store key.
		hashTable[bucketId] = new Bucket();
		hashTable[bucketId].key = key;
	}

	public boolean Search(int key) {
		int bucketId = hashFunctionModN(key);

		if (hashTable[bucketId] == null) {
			// Bucket empty => Key not found.
			return false;
		}

		// Bucket exists, check if it has the key.
		if (hashTable[bucketId].key == key) {
			// Found
			System.out.println("Key = " + key + " found in bucketId = " + bucketId);
			return true;
		}
		
		// Bucket exists and key not present. Was there a collision?
		if (hashTable[bucketId].isCollision == false) {
			// No collision => Not Found
			return false;
		}

		// There was collision => Do Linear probing to find.
		for (int i = 1; i < size; ++i) {
			int t = (bucketId + i) % size;
			// Is t'th bucket empty => Key should have been here.
			if (hashTable[t] == null) {
				// Not found
				return false;
			}
			if (hashTable[t].key == key) {
				// Found
				System.out.println("Via Linear Probing Key = " + key + " found in bucketId = " + t);
				return true;
			}
		}
		return false;
	}
}
