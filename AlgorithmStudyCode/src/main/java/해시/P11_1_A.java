package 해시;

public class P11_1_A {

    public static void main(String[] args) {

    }
}

class ChainHash<K,V> {
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
