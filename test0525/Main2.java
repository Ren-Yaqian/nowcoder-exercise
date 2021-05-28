package test0525;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 客似云来*/
public class Main2 {
    private static Map<Integer, Long> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            long count = 0;
            for (int i = from; i <= to; i++) {
                count = count + getPersonCount(i);
            }
            System.out.println(count);
        }

    }

    public static long getPersonCount(int day) {
        if (day == 1) {
            return 1;
        }
        if (day == 2) {
            return 1;
        }
        //1、1、2、3、5……
        long prePreNum = 1;
        long preNum = 1;
        long result = 0;
        if (map.containsKey(day)) {
            return map.get(day);
        } else {
            for (int i = 3; i <= day; i++) {
                result = prePreNum + preNum;
                map.put(i, result);
                prePreNum = preNum;
                preNum = result;
            }
            return result;
        }

    }
}
