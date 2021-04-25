package test0421;

import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        int arr[]=new int[10];
        System.out.println(arr[10]);

//        StringBuffer a=new StringBuffer("A");
//        StringBuffer b=new StringBuffer("B");
//        operator(a,b);
//        System.out.println(a+","+b);

//        Object o=new Object(){
//            public boolean equals(Object obj){
//                return true;
//            }
//        };
//        System.out.println(o.equals("Fred"));

//        try{
//            int i=100/0;
//            System.out.println(i);
//        }catch (Exception e){
//            System.out.println(1);
//            throw new RuntimeException();
//        }finally {
//            System.out.println(2);
//        }
//        System.out.println(3);
    }

    private static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);y=x;
    }


//    public static void main(String[] args) {
//        byte b1=1,b2=2,b3,b6;
//        final byte b4=4,b5=6;
//        b6=b4+b5;
//        b3=(b1+b2);//编译出错
//        System.out.println(b3+b6);
//    }




//    public int add(int a,int b){
//        try{
//            return a+b;
//        }
//        catch (Exception e){
//            System.out.println("ca");
//        }
//        finally {
//            System.out.println("fa");
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        main test=new main();
//        System.out.println(":"+test.add(9,34));
//    }
}
