package base;

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
}
