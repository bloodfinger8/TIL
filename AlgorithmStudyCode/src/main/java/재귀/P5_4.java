package 재귀;

public class P5_4 {

    static void recur(int a) {
        if( a > 0) {
            recur(a - 1 );
            System.out.println(a);
            a = a - 2;
        }
    }

    public static void main(String[] args) {
        recur(5);
    }
}
