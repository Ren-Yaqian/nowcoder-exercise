package test0421;

import java.util.Scanner;
public class Main2 {
    //机器人走方格问题
    static int rec(int m,int n)//递归
    {
        if(m==1||n==1) return 1;//递归出口
        return rec(m-1,n)+rec(m,n-1);//递归公式
    }
    static int diedai(int m,int n)//迭代法
    {
        int [][]a=new int[m+1][n+1];
        for(int i=1;i<=n;i++)//初始化数组，即当只有一行或者一列时，只有一种走法
            a[1][i]=1;
        for(int i=1;i<=m;i++)
            a[i][1]=1;
        for(int i=2;i<=m;i++)
            for(int j=2;j<=n;j++)
                a[i][j]=a[i-1][j]+a[i][j-1];
        return a[m][n];
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);//输入m和n的值
        int m=a.nextInt();
        int n=a.nextInt();
        long now1=System.currentTimeMillis();
        int b=rec(m,n);
        System.out.println(b);
        System.out.println(System.currentTimeMillis()-now1+"ms");//计算相应的时间进行相应的对比
        long now2=System.currentTimeMillis();
        int c=diedai(m,n);
        System.out.println(c);
        System.out.println(System.currentTimeMillis()-now2+"ms");
    }
}