package com.xinfang.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1 个位置。
 * （3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
 * 时间复杂度
 * 最好情况:O(N)
 * 平均:O（n²）
 *
 * @author TangWenBo
 * @date 2019/10/22
 */
public class BubbleSort {

    private static int[] array = {7, 5, 1, 8, 2, 33, 55, 11, 66, 22};

    public static void main(String[] args) {
        //两个相邻的数比较
        for (int i = 0; i < array.length - 1; i++) {
            int temp;
            for (int j = i + 1; j < array.length; j++) {
                //如果前一个数比后一个大,两边就交换位置
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
