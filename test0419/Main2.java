package test0419;
//删数
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if(n>1000){
                n = 999;
            }
            boolean[] delete = new boolean[n];
            int count = 0;
            int index = 0;
            int num = 0;
            while (count < n) {
                for (int i = 0; i != n; ++i) {
                    if (delete[i] == false) {
                        ++num;
                        if (num == 3) {
                            delete[i] = true;
                            num = 0;
                            ++count;
                            index = i;
                        }
                    }
                }
            }
            System.out.println(index);
        }
    }
}