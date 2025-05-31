public class MyHashMap {

    private static class Pair {
        int key;
        int value;
        boolean deleted;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }

    private final int TABLE_SIZE = 20011;
    private Pair[] hashTable;

    public MyHashMap() {
        hashTable = new Pair[TABLE_SIZE];
    }

    private int getIndex(int key) {
        return key % TABLE_SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        while (hashTable[index] != null) {
            if (!hashTable[index].deleted && hashTable[index].key == key) {
                hashTable[index].value = value;
                return;
            }
            index = (index + 1) % TABLE_SIZE;
        }
        hashTable[index] = new Pair(key, value);
    }

    public int get(int key) {
        int index = getIndex(key);
        while (hashTable[index] != null) {
            if (!hashTable[index].deleted && hashTable[index].key == key) {
                return hashTable[index].value;
            }
            index = (index + 1) % TABLE_SIZE;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        while (hashTable[index] != null) {
            if (!hashTable[index].deleted && hashTable[index].key == key) {
                hashTable[index].deleted = true;
                return;
            }
            index = (index + 1) % TABLE_SIZE;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2, 30);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
    }
}
