package REALPRATICE;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P2606 {
    /*
    7
    6
    1 2
    2 3
    1 5
    5 2
    5 6
    4 7
    */
    static int comNum, connNum;
    static int map[][];
    static int cnt;
    static int check[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        comNum = scan.nextInt();
        connNum = scan.nextInt();

        map = new int[connNum + 1][comNum + 1];
        check = new int[comNum + 1];

        for (int i = 0; i < connNum; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            map[a][b] = map[b][a] = 1;
        }

        System.out.println(cnt);
    }
}

