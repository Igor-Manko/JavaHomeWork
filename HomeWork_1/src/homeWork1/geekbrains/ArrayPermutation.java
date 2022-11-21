package homeWork1.geekbrains;

import java.util.Arrays;
/*
Учитывая нулевую перестановку nums (с индексом 0), постройте массив ans той же длины,
где ans[i] = nums[nums[i]] для каждого 0 <= i < nums.length и верните его.
Перестановка nums на основе нуля представляет собой массив различных целых чисел от 0 до nums.length - 1 (включительно).
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
 */
public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
