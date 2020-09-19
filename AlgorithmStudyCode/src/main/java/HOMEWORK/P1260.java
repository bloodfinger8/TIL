package HOMEWORK;

import java.util.*;

public class P1260 {
    /*
4 5 1
1 2
1 3
1 4
2 4
3 4
     */
    public static void main(String[] args) {
        Graph l = new Graph(4);
        l.addEdge(1, 2);
        l.addEdge(1, 3);
        l.addEdge(1, 4);
        l.addEdge(2, 4);
        l.addEdge(3, 4);

        l.dfs(0);
//        l.bfs(0);
    }
}
class Graph {
    public Node[] nodes;

    class Node {
         int data;
         boolean check;
         LinkedList<Node> list;

        public Node(int data) {
            this.data = data;
            this.check = false;
            this.list = new LinkedList<Node>();
        }
    }

    public Graph(int size) {
        this.nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i+1);
            System.out.println(i + "번째 노드 : " + nodes[i].data);
        }
    }

    public void addEdge(int val_1  , int val_2 ) {
        Node node_1 = nodes[val_1-1];
        Node node_2 = nodes[val_2-1];
        if(!node_1.list.contains(node_2)){
            node_1.list.add(node_2);
        }
        if(!node_2.list.contains(node_1)){
            node_2.list.add(node_1);
        }
    }

    //stack 을 이용한 풀이
    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.check = true;

        while (!stack.isEmpty()) {
            Node r = stack.pop();

            int siz = r.list.size();
            for (int i=siz-1; i>=0; i--) {
                if(r.list.get(i).check == false){
                    r.list.get(i).check = true;
                    stack.push(r.list.get(i));
                }
            }
            System.out.println(r.data);
        }
    }

    //queue 를 이용한 풀이
    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        root.check = true;

        while (!que.isEmpty()){
            Node r = que.poll();
            System.out.println(r.data);
            for(Node node : r.list) {
                if(node.check == false){
                    node.check = true;
                    que.add(node);
                }
            }
        }
    }


}

