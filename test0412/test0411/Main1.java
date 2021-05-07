package test0411;

import java.util.Arrays;
import java.util.Scanner;

//组队竞赛
public class Main1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int[] arr=new int[3*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sca.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=n;i<2*n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
