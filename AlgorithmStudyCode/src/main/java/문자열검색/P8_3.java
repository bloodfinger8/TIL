package 문자열검색;

public class P8_3 {
    public int kmpMath(String txt , String pat){
        //txt 커서
        int pt = 1;
        //pat 커서
        int pp = 0;
        // 건너뛰기 표 배열
        int [] skip = new int[pat.length() + 1];

        //건너뛰기 표 생성
        skip[pt] = 0;
        while(pt != pat.length()) {
            if(pat.charAt(pt) == pat.charAt(pp)){
                skip[++pt] = ++pp;
            }else if(pp == 0){
                skip[++pt] = pp;
            }else{
                pp = skip[pp];
            }
        }

        //검색
        pt = pp = 0;
        while(pt != txt.length() && pp != pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }else if(pp == 0){
                pt++;
            }else {
                pp = skip[pp];
            }
        }


        if(pp == pat.length()){
            return pt-pp;
        }

        return -1; //검색 실패
    }

    public static void main(String[] args) {
        P8_3 p = new P8_3();
        System.out.println(p.kmpMath("ABCABD" , "ABCABD"));
    }
}
