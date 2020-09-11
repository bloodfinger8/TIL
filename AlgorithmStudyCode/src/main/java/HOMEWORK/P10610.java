package HOMEWORK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10610 {

    static void permutation(int[] arr, int depth, int n, int r) {
        if(depth == r) {
            String k = "";
            for(int i=0; i<r; i++) {
                k = k + arr[i];
            }
            System.out.println();
            //30의 배수 찾기
            search(arr );


            return;
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }


    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }


    private static void search(int[] arr) {


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        //30의 배수로 떨어져라

        String [] k =num.split("");
        int [] arr = new int[k.length];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = Integer.parseInt(k[i]);
        }




    }
}
