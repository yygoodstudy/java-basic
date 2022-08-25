package com.yy.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Date 2022/8/17 20:21
 */
public class Test02 {

    private final List<Integer> nums = new ArrayList<>(Arrays.asList(0, 0, 4, 2, 5, 0, 3, 0));

    //precondition: nums.size() > 0
//nums contains Integer objects
    public void numQuest() {
        int k = 0;
        Integer zero = new Integer(0);
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            k++;
        }
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.numQuest();
        System.out.println(test02.nums);
    }
}
