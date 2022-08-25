package com.yy.loop;

/**
 * @Description 冒泡排序
 * @Date 2022/8/9 18:16
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int[] nmb = {1, 45, 3, 0, 10, 23, 29, 27, 3};
        for (int i = 0; i < nmb.length; i++) {
            for (int j = 0; j < nmb.length - i - 1; j++) {
                if (nmb[j + 1] < nmb[j]) {
                    int temp = nmb[j + 1];
                    nmb[j + 1] = nmb[j];
                    nmb[j] = temp;
                }
            }
        }

        for (int i = 0; i < nmb.length; i++) {
            System.out.println(nmb[i]);
        }
    }
}
