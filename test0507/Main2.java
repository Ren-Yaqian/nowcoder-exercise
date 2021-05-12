package test0507;

import java.util.Scanner;

//字符串通配符
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            int[][]dp=new int[str1.length()+1][str2.length()+1];
            for(int i=1;i<str1.length()+1;i++){
                for (int j=1;j<str2.length()+1; j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            if(str1.replaceAll("[?*]","").length()==dp[str1.length()][str2.length()]){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}