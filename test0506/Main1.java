package test0506;

import java.util.Scanner;
//杨辉三角的变形
public class Main1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        while(sca.hasNextInt()) {
            int n = sca.nextInt();
            if (n <= 2) {
                System.out.println(-1);
            } else {
                n -= 2;
                n %= 4;
                int ans = -1;
                switch (n) {
                    case 0:
                        ans = 4;
                        break;
                    case 1:
                    case 3:
                        ans = 2;
                        break;
                    case 2:
                        ans = 3;
                        break;
                }
                System.out.println(ans);
            }
        }
    }
}

//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n = in.nextInt();
//            if(n<=2)
//                System.out.println(-1);
//            else if(n%2==1){
//                System.out.println(2);
//            }else{
//                if(n%4==0)
//                    System.out.println(3);
//                else
//                    System.out.println(4);
//            }
//        }
//        in.close();
//    }
//}