package OTHER.realPratice;

import java.util.*;

public class Main {



//            2

//            3 3

//            1 2     1 -> 2 -> 3
//            2 3
//            1 3     1 -> 3
                    //총 2가지
//            5 4

//            2 1     1 -> 2 -> 3
//            2 3
//            4 3     4 -> 3
//            4 5     4 -> 5
                    //총
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        List<Integer> list = new LinkedList<>();

        for (int i=0; i<t; i++) {
            int countyNum = scan.nextInt();
            int planeType = scan.nextInt();

            for (int j = 0; j < planeType; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("입력");

            }

        }

        System.out.println(list);

    }
}
