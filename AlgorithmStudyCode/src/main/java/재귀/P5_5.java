package 재귀;


import java.util.Stack;

public class P5_5 {

    static void recur(int n) {
        Stack<Integer> stack = new Stack<>();

        while(true) {
            if(n>0) {
                stack.push(n);
                n = n -1;
                continue;
            }

            if(!stack.isEmpty()){
                n = stack.pop();
                System.out.println(n);
                n=n-2;
                continue;
            }
            break;

        }
    }

    public static void main(String[] args) {
        recur(4);
    }
}
