package REALPRATICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.contains("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if("pop".equals(command)){
                int result = stack.isEmpty() ? -1 : stack.pop();
                System.out.println(result);
            }else if("size".equals(command)) {
                System.out.println(stack.size());
            }else if("empty".equals(command)) {
               int result = stack.isEmpty() ? 1 : 0;
                System.out.println(result);
            }else if("top".equals(command)) {
                int result = stack.isEmpty() ? -1 : stack.peek();
                System.out.println(result);
            }
        }
    }
}
