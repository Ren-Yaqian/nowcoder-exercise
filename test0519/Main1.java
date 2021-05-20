package test0519;
//奇数位上都是奇数，偶数位上都是偶数
//未通过
public class Main1 {
    static boolean isOddOrEven(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
    public static void oddInOddEvenInEven(int[] arr) {
        //偶数数组
        int temp1[]=new int[arr.length];
        //奇数数组
        int temp2[]=new int[arr.length];
        for(int i=0,j=0,k=0;i<arr.length;i++){
            //若当前数字是偶数则放进偶数数组
            if(isOddOrEven(arr[i])){
                temp1[j]=arr[i];
                j++;
            }
            //若当前数是奇数则放进奇数数组
            else{
                temp2[k]=arr[i];
                k++;
            }
        }
        for(int i=0,j=0,k=0;i<arr.length;i++){
            //若当前位置是偶数位置，则放进偶数
            if(isOddOrEven(i)){
                arr[i]=temp1[j];
                j++;
            }
            //若当前位是奇数位则放进奇数
            else{
                arr[i]=temp2[k];
                k++;
            }
        }
    }
}
