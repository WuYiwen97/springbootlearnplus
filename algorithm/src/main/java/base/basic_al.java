package base;

import java.util.ArrayList;
import java.util.List;

public class basic_al {

    //计算2个数的最小公倍数
    public static int getCM(int a,int b){
        int max = (a>b)?a:b;
        int min = (a<b)?a:b;
        for (int i=min ;i<=max* min;i++){
            if (i % a == 0 && i % b ==0) {
                return i;
            }
        }
        return 1;
    }

    //计算2个数的最大公约数
    public static int getSM(int a,int b ){
        //这个好复杂啊 ™
        return 1;
    }

    //质数
    public static boolean getZhishu(int number){
        if (number == 1 || number ==2)
            return true;
        for (int i = 2;i<number;i++){
            if (number%i ==0){
                return true;
            }
        }
        return false;
    }

    //整数位数
    public static int getWeishu(int number) {
        int weishu = 1;
        while (number / 10 !=0){
            weishu+=1;
            number=number / 10;
        }
        return weishu;
    }

    public static void main(String[] args) {
        System.out.println(getWeishu(9999));
    }
}
