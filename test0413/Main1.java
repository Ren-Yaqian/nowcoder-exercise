package test0413;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] stringBuffer = str.split(" ");
            int y1 = Integer.parseInt(stringBuffer[0]);
            int y2 = Integer.parseInt(stringBuffer[1]);
            int y3 = Integer.parseInt(stringBuffer[2]);
            int y4 = Integer.parseInt(stringBuffer[3]);
            //System.out.println(y3);
            int A = (y1 + y3)/2;
            int B = (y2 + y4)/2;
            int C = (y4 - y2)/2;
            if((A-B)==y1 && (B-C)==y2 && (A +B)==y3 && (B + C)==y4) {
                System.out.println(A +" " + B + " " + C);
            }else {
                System.out.println("No");
            }
        }
    }
}
