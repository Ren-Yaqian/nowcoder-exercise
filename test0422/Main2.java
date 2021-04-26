package test0422;

import java.util.Scanner;

//最大连续比特数
public class Main2 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        String s=Integer.toBinaryString(n);
        int max=0;
        int num=0;
        char temp=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&&(s.charAt(i)==temp||num==0))
                num++;
                else{
                    num=0;}
                temp=s.charAt(i);
                if(num>max){
                    max=num;
                }
        }System.out.println(max);
    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n=in.nextInt();
//            String s=Integer.toBinaryString(n);
//            int max=0;
//            int num=0;
//            char temp=s.charAt(0);
//            for (int i = 0; i < s.length(); i++) {
//                if(s.charAt(i)=='1'&&(s.charAt(i)==temp||num==0))
//                    num++;
//                else
//                    num=0;
//                temp=s.charAt(i);
//                if(num>max)
//                    max=num;
//            }
//            System.out.println(max);
//        }
//        in.close();
//    }

}
