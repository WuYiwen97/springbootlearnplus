package base;

import java.util.*;

import java.util.ArrayList;

import java.util.stream.Collectors;

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



    public static String get99(){
        StringBuffer sb = new StringBuffer(500);
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                sb.append(i).append("*").append(j).append("=").append(i*j).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static  int[] rounding(int[] array) {
        // write your code here
        for(int i = 0 ; i < array.length ;i++) {
            int a = array[i];
            if(a > 0) {
                String aString = String.valueOf(a);
                char aChat = aString.charAt(aString.length()-1);
                int ch_int=aChat-'0';
                if (ch_int < 5 ){
                    array[i] = a-ch_int;
                }
                else {
                    array[i] = a+ch_int;
                }

            }
        }
        return array;
    }


    public int getMax(int[] array) {
        // write your code here
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        Integer integer = integerArray.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        return integer;

    }

    public static void main(String[] args) {
        Map<String, Map<String,String>> mapMap = new HashMap<>();
        Map<String,String> dd = new HashMap<>();
        dd.put("1","11");
        dd.put("2","22");
        dd.put("3","33");
        mapMap.put("aa",dd);
        Map<String, String> aa = mapMap.get("aa");
        aa.put("1","3");
        System.out.println(dd);

    }
}
