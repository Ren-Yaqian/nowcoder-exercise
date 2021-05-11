package test0506;

public class main {
    private int count;

    public static void main(String[] args) {
        main test=new main(88);
        System.out.println(test.count);
    }
    main(int a){
        count=a;
    }

//    public  String name="abc";
//
//    public static void main(String[] args) {
//        main test=new main();
//        main testB=new main();
//        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
//    }

//    static boolean pad;
//
//    public static void main(String[] args) {
//        System.out.println(pad);
//    }
}
