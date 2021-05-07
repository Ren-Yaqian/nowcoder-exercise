package test0412;

import java.util.Arrays;
public class Main2 {
    public int MoreThanHalfNum_Solution(int [] array) {
        //确定可能是哪个数字：排序后在最中间的数字
        Arrays.sort(array);
        int count=0;
        int n=array.length;
        for(int i=0;i<n;i++){
            if(array[i]==array[n/2]){
                count++;
            }
        }
        //再判断该数字出现次数是不是真的超过数组长度一半
        if(count>n/2){
            return array[n/2];
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}