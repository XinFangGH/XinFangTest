package com.xinfang.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
 * 插入排序非常类似于整扑克牌。在开始摸牌时，左手是空的，牌面朝下放在桌上。接着，一次从
 * 桌上摸起一张牌，并将它插入到左手一把牌中的正确位置上。为了找到这张牌的正确位置，要将
 * 它与手中已有的牌从右到左地进行比较。无论什么时候，左手中的牌都是排好序的。
 * 时间复杂度:O(n^2)
 *
 * @author TangWenBo
 * @date 2019/10/22
 */
public class InsertionSort {
    private static int[] array = {7, 5, 1, 8, 2, 33, 55, 11, 66, 22};

    public static void main(String[] args) {
        method2(array);

    }

    /**
     * 方式一
     *
     * @author TangWenBo
     * @date 2019/10/22 14:17
     */
    private static void method1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //即将被插入的数
            int insertVal = array[i];
            //即将被插入的位置
            int insertIndex = i - 1;
            //如果被插入的位置大于等于0并且即将被插入的值小于即将被插入位置的值
            while (insertIndex >= 0 && insertVal < array[insertIndex]) {
                //把数值大的值后移一位
                array[insertIndex + 1] = array[insertIndex];
                //当前索引-1
                insertIndex--;

            }
            //把插入的值放到合适位置
            array[insertIndex + 1] = insertVal;
        }
        Arrays.stream(array).forEach(System.out::println);
    }

    /**
     * 方式二
     *
     * @author TangWenBo
     * @date 2019/10/22 14:17
     */
    private static void method2(int[] array) {
        //从即将插入的地方开始
        for (int i = 1; i < array.length; i++) {
            //记录即将插入的值
            int temp = array[i];
            int index;

            for (int j = i; j > 0; j--) {
                //如果左边值比右边大
                if (array[j] < array[j - 1]) {
                    //右边值等于左边值
                    array[j] = array[j - 1];
                    //记录左边的索引位置
                    index = j - 1;
                } else {
                    break;
                }
                //把插入的值赋值给左边
                array[index] = temp;
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
