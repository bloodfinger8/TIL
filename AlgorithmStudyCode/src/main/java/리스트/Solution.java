//package 리스트;
//
//import java.util.ArrayList;
//
//public class Solution {
//
//    public String solution(int n, int t, int m, int p) {
//        String answer = "";
//        String [] allArr = new String[t*m];
//
//        for (int i = 0; i < t*m; i++) {
//            allArr[i] = i+"";
//        }
//
//
//        for (int i = 0; i < allArr.length ; i++) {
//            answer += changeNumber(n, allArr[i]);
//        }
//
//        String[] tempArr = answer.split("");
//        String dap = "";
//
//        for (int i = p-1; i < t*m; i=i+m) {
//            dap += tempArr[i];
//        }
//
//        return dap;
//    }
//
//
//    static String changeNumber(int n , String realArrParam) {
//
//        int val = Integer.parseInt(realArrParam);
//        String tempStr = "";
//
//
//        if(val == 0){
//            tempStr = "0";
//        }else {
//            while (true) {
//                ans = val%n;
//                val = val/n;
//            }
//        }
//
//        return "";
//    }
//
//
//
//    public static void main(String[] args) {
//        //진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p
//        Solution s= new Solution();
//        s.solution(2,4,2,1);
//
//    }
//}
