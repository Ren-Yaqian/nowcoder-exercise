package test0427;
class A{
    public A(String str){}
}
public class main {


        public static void main(String[] args) {
            A classa=new A("he");
            A classb=new A("he");
            System.out.println(classa==classb);
        }



//    String str=new String("good");
//    char[] ch={'a','b','c'};
//
//    public static void main(String[] args) {
//        main ex=new main();
//        ex.change(ex.str,ex.ch);
//        System.out.println(ex.str+"and");
//        System.out.println(ex.ch);
//    }
//
//    private void change(String str, char[] ch) {
//        str="test ok";
//        ch[0]='g';
//    }

//    public static void main(String[] args) {
//        int a=10;
//        double b=3.14;
//        System.out.println('A' + a + b);
//    }


//    private float f=1.0f;
//    int m=12;
//    static int n=1;
//
//    public static void main(String[] args) {
//        main t=new main();
//        System.out.println(main.n);
//        System.out.println(this.n);
//    }
}
