package test0516;
// write your code here// write your code herepackage yzl;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BigInteger m,n;
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            m=in.nextBigInteger();
            n=((m.add(new BigInteger("-1"))).mod(new BigInteger("9"))).add(new BigInteger("1"));
            System.out.println(n);
        }

    }

}