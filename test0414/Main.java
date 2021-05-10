package test0414;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(numberStr(str));
        }
    }
    public static String numberStr(String str){
        int max = 0,count = 0,end = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;
                if(max < count){
                    max = count;
                    end = i;
                }
            }else{
                count = 0;
            }
        }
        return str.substring(end - max + 1,end + 1);
        //注意：substring方法是索引从0开始的前闭后开区间的写法，所以是[end - max +1,end+1)
    }
}