package test0507;

public class main {
    private static int x=100;

    public static void main(String[] args) {
        main hs1=new main();
        hs1.x++;
        main hs2=new main();
        hs2.x++;
        hs1=new main();
        hs1.x++;
        main.x--;
        System.out.println("x=" + x);
    }

//    public String str="6";
//
//    public static void main(String[] args) {
//        main sv=new main();
//        System.out.println(sv.str);
//    }
//    public void change(String str){
//        str="10";
//    }

//    public static void main(String[] args) {
//        Integer i1=59;
//        int i2=59;
//        Integer i3=Integer.valueOf(59);
//        Integer i4=new Integer(59);
//
//        System.out.println(i1==i2);
//        System.out.println(i1 == i3);
//        System.out.println(i2 == i3);
//        System.out.println(i3 == i4);
//    }
}
