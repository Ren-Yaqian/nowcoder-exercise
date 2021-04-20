package test0419;
import java.util.Arrays;
import java.util.Scanner;
//n个数里最小的k个
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int len = strs.length;
            int[] arr = new int[len-1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int k = Integer.valueOf(strs[len-1]);
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]+" ");
            }

        }

    }
}