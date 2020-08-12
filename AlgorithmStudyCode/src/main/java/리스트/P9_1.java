package 리스트;

public class P9_1<E> {

    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data , Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> crnt;


    public P9_1() {
        head = crnt = null;
    }

}
