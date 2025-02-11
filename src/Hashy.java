public class Hashy {

    private Person[] hashTable;
    private int size;
    public int totalCollisions = 0;

    public Hashy(int dataSize) {
        size = dataSize * 10;
        hashTable = new Person[size]; // 10 000

    }


    public int hash(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret += (int) (str.charAt(i) * 9.8);
        }
        return ret % size;
    }

    public Person search(String name) {
        int idx = hash(name);
        int ops = 0;
        while (!hashTable[idx].getName().equals(name)) {

            idx++;
            idx %= size;
            ops++;


            if (ops > size) {
                System.out.println(name + " not found: ");
                return null; // Så att de inte blir en never ending loop
            }

        }
        System.out.println("HashTable search  O(1) opeartions: " + ops);
        return hashTable[idx];

    }

    public void add(Person person) {
        int idx = hash(person.getName());

        while (hashTable[idx] != null) {

            System.out.println(person.getName() + " collision on index: " + idx + " with " + hashTable[idx].getName());
            idx++;
            idx %= size; //gå till början vid behov
            totalCollisions++;
        }
        hashTable[idx] = person;
        System.out.println(person.getName() + " saved wiht index " + idx);

    }

}
