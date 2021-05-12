package test0507;

import sun.security.mscapi.CPublicKey;
//统计每个月兔子的总数
import java.util.Scanner;

public class Main1 {
    public static int getTotalCount(int monthCount){
        if(monthCount==0){
            return 0;
        }
        if(monthCount==1||monthCount==2){
            return 1;
        }else return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        while(sca.hasNextInt()){
            int monthCount=sca.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}
