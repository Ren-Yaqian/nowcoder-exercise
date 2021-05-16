package test0513;

import java.util.*;
public class Main1 {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int a=gifts[n/2];
        int num=0;
        for(int i=0;i<gifts.length;i++){
            if(gifts[i]==a){
                num++;
            }
        }
        return num<=n/2?0:a;
    }
}
