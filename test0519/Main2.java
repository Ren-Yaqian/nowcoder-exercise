package test0519;
//猴子分桃
public class Main2 {
    public static void main(String[] args) {
//第一只猴子分桃时,调用函数fun(1)求得桃数
        System.out.println("最初海滩上共有"+fun(1)+"个桃子");
    }
//递归函数
    public static int fun(int i) {
        if(i==5) {
            return 6;
            //轮到第五只猴子分桃时，至少得6个桃
            }else {
            return fun(i+1)*5+1;
        }
    }
}
