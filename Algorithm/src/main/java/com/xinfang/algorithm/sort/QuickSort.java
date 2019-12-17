package com.xinfang.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author TangWenBo
 * @date 2019/10/22
 */
public class QuickSort {
    private static int[] array = {7, 5, 1, 8, 2, 33, 55, 11, 66, 22};


    public static void main(String[] args) {
        int[] quick = quick(array, 0, array.length - 1);
        Arrays.stream(quick).forEach(System.out::println);
    }


    private static int[] quick(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int key = array[start];
        while (i < j) {
            //从尾数开始找,直到找到当前索引值小于基准值的位置
            while (array[j] > key) {
                j--;
            }
            //从头开始找,直到找到当前索引值大于基准值的位置
            while (array[i] < key) {
                i++;
            }
            //当前索引值一样,并且索引头小于索引尾,正常
            if (array[j] == array[i] && i < j) {
                i++;
            } else {
                //否则交换值的位置
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //一遍过后,所有比基准值小的数都在左边,在对左边的数组进行排序
        if (i - 1 > start) {
            array = quick(array, start, i - 1);
        }
        //在对右边的数组进行排序
        if (j + 1 < end) {
            array = quick(array, j + 1, end);
        }
        return array;
    }

}
