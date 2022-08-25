package com.yy.loop;

/**
 * @Description do{....}while(逻辑判断);
 * @Date 2022/8/9 17:21
 */
public class DoWhileLoop01 {
    public static void main(String[] args) {

        // 数组赋值，是引用传递
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = array1;
        array2[3] = 3;
        for (int i : array1) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------array2-----");
        for (int i : array2) {
            System.out.print(i+" ");
        }

    }

    public static void breaks() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 4) {
                break;
            }
        }
    }

    public static void continues() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 4) {
                continue; // 跳过本次循环，continue之后的语句不会执行；继续下一次的循环.
            }
            System.out.println("i =" + i);
        }
    }
}
