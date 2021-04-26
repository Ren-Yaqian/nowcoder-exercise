package test0422;

public class main {
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }


//    String str=new String("good");
//    char[]ch={'a','b','c'};
//
//    public static void main(String args[]) {
//        main ex=new main();
//        ex.change(ex.str,ex.ch);
//        System.out.println(ex.str+"and");
//        System.out.println(ex.ch);
//    }
//
//    public static void change(String str,char ch[]) {
//        str="testok";
//        ch[0]='g';
//    }
}
