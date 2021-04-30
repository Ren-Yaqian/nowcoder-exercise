package test0427;

import java.util.Scanner;

//查找输入整数二进制中1的个数
public class Main1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        System.out.println(findNumberOf1(num));

    }

    private static int findNumberOf1(int num) {
        int count=0;
        while(num!=0){
                count++;
                num=num&(num-1);
        }
        return count;
    }

    private static int findN(int num) {
        int count=0;
        while(num!=0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }

}
