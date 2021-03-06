package test0412;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i <n; i++) {
                a[i] = sc.nextInt();
            }
            int flag = 0;//用标志区分，0表示不增不减，1表示递增，-1表示递减
            int count = 1;//计算排序子序列的个数，默认为1也就是从当前序列开始，在遇到下一个是递增或者递减时，在此基础上自增加1
            for (int i = 1; i < n; i++) {
                if (a[i - 1] < a[i]) {
                    if (flag == 0) {//初值
                        flag = 1;//递增，不做任何操作
                    }
                    if (flag == -1) {//从递减序列转到递增
                        flag = 0;//重置，避免重复分组时重复利用同一个
                        //（如：{1,2,1,2}错误分为{1,2}{2,1}{1,2}三组，正确情况应是{1,2}{1,2}）
                        count++;//这个计数计的是转到的递增序列
                    }
                } else if (a[i - 1] > a[i]) {
                    if (flag == 0) {
                        flag = -1;//递减
                    }
                    if (flag == 1) {//从递增序列转到递减
                        flag = 0;//重置
                        count++;//加上该递减数列
                    }
                }
            }
            System.out.println(count);
        }
        /*Scanner 类实例化的时候需要一个InputStream流作为参数，
          Scanner 的close就是关闭InputStream流的。
          凡是属于IO流的类如果不关闭会一直占用资源。*/
        sc.close();
    }
}




