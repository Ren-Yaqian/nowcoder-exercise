package test0524;

import java.util.Scanner;
//淘宝网店???https://www.nowcoder.com/questionTerminal/754921e9c98b43d1b2d70c227b844101
public class Main1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);

    }

    //非闰年为标准
    int[] totalday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //非闰年 - 每个月的总收益
    int[] totalMoney= {62, 28, 31, 60, 31, 60, 31, 62, 60, 62, 30, 62};

    //判断该月份是否为素数
    boolean Judge_IsPriNum(int month){
        if(month == 2 || month == 3 || month == 5 || month == 7 ||
                month == 11){
            return true;
        }
        return false;
    }

    //判断该年份是否为闰年
    boolean Judge_IsLeaYear(int year){
        if( (year % 4 == 0 && year % 100 != 0) ||
                year % 400 == 0){
            return true;
        }
        return false;
    }

    //计算相差day2 - day1天数的收益
    int Caclue_Day(int day1, int day2, int month){
        //1 - 31， 是31天    31 - 1 = 30 -- 得加1
        int sum = day2 - day1 + 1;
        if(!Judge_IsPriNum(month)){
            //非素数一天赚2块
            sum += sum;
        }
        return sum;
    }

    //计算相差month2 - month1 整月数的收益
    int Caclue_Month(int month1, int month2, int year){
        int sum = 0;
        for(int i = month1; i <= month2; ++i){
            //下标-1
            sum += totalMoney[i - 1];
            //2月 - 闰年 - 多加1块
            if(i == 2 && Judge_IsLeaYear(year)){
                sum += 1;
            }
        }
        return sum;
    }

    //计算相差year2 - year1 整年数的收益
    int Caclue_Year(int year1, int year2){
        int sum = 0;
        for(int i = year1; i <= year2; ++i){
            sum += Caclue_Month(1, 12, i);
        }
        return sum;
    }
}
