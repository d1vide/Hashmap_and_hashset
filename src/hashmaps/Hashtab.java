package hashmaps;

import java.util.Hashtable;

public class Hashtab {
    Hashtable<String, String> hashTable;

    //hashtabHash, hashtabInit, hashtabAdd, hashtabLookup, hashtabDelete

    public int hashtabHash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % hashTable.size();
    }

    public void hashtabInit(int size) {
        hashTable = new Hashtable<String, String>(size);
    }

    public void hashtabAdd(String key, String value) {
        hashTable.put(key, value);
    }

    public String hashtabLookup(String key) {
        return hashTable.get(key);
    }

    public void hashtabDelete(String key) {
        hashTable.remove(key);
    }

}
