package test0428;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 返回n以内完全数的个数。异常情况返回-1
 */
public class Main1 {

    public static final int MAX_NUM = 500000;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int count = 0;
        if(n > 0 && n <= MAX_NUM){
            for (int i = 1; i <= n; i++) {
                if(isPerfacet(i))
                    count++;
            }
            System.out.println(count);
        }
        else
            System.out.println("-1");
    }

    private static boolean isPerfacet(int value) {
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i < value; i++) {
            if(value % i==0)
                list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            sum+=it.next();
        }
        if(value == sum)
            return true;
        else
            return false;
    }

}
