package test0525;
//剪花布条
import java.util.*;
public class Main1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            String str1=in.next();
            String str2=in.next();

            if(str1.length() < str2.length())
            {
                System.out.println(0);
            }

            else
            {

                int ret=0;
                for(int i=0;i<=str1.length()-str2.length();)
                {
                    if(str1.substring(i,i+str2.length()).equals(str2))
                    {
                        ret++;
                        i=i+str2.length();
                    }
                    else
                        i++;
                }

                System.out.println(ret);
            }
        }
    }
}