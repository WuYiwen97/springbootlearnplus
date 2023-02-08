package sort;

import java.util.Arrays;
import java.util.Vector;

public class BubbleSort {

    static void bubbleSort(int[] a,int size){
        for(int i=0;i<size-1;i++){
            for (int j=0;j<size-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

    }

    /**
     * 简单选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;//每一趟循环比较时，min用于存放较小元素的数组下标，这样当前批次比较完毕最终存放的就是此趟内最小的元素的下标，避免每次遇到较小元素都要进行交换。
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //进行交换，如果min发生变化，则进行交换
            if (min != i) {
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {7,8,3,4,9,5,1,2,6};
        //bubbleSort(a,9);
        insertionSort(a);
        Arrays.stream(a).forEach(System.out::print);
    }



}
