package test0527;

import java.util.*;

public class Main2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            char[] chars = in.nextLine().toCharArray();

            Set<String> set = new HashSet<>();
            StringBuilder curName = new StringBuilder();
            boolean flag = false;
            for (int i = 0; i < chars.length; ++i) {
                char ch = chars[i];

                if (ch == '\"') {
                    flag = !flag;
                    continue;
                }

                if (ch == ',' && !flag) {
                    set.add(curName.toString());
                    curName.setLength(0);
                    continue;
                }

                curName.append(ch);
            }
            set.add(curName.toString());

            String name = in.nextLine();
            System.out.println(!set.contains(name) ? "Important!" : "Ignore");
        }

        in.close();
    }
}