package 해시;

public class P11_1_A {

    public static void main(String[] args) {

    }
}

class ChainHash<K,V> {
    private int size;               //해시테이블 크기
    private Node<K,V>[] table;      //해시 테이블

    public ChainHash(int capacity) {
        table = new Node[capacity];
        this.size = capacity;
    }

    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    // 키 값 key를 갖는 요소의 검색 (데이터 반환)
    public V search(K key) {
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while(p != null){
            if(p.getKey().equals(key))
                return p.getValue();
            p = p.next;
        }
        return null;
    }

    // 키 값 ,key , 데이터 data를 갖는 요소의 추가
    public int add(K key , V data) {
        int hash = hashValue(key);
        Node<K,V> p =table[hash];

        while (p != null) {
            if(p.getKey().equals(key))
                return 1;
            p = p.next;
        }

        Node<K, V> temp = new Node<K,V>(key ,data , table[hash]);
        table[hash] = temp;
        return 0;
    }

    class Node<K,V> {
        private K key ;
        private V data;
        private Node<K,V> next;

        Node(K key , V data , Node<K,V> next){
            this.key = key;
            this.data = data;
            this.next = next;
        }

        K getKey(){
            return key;
        }

        V getValue(){
            return data;
        }
        public int hashCode(){
            return key.hashCode();
        }
    }
}
