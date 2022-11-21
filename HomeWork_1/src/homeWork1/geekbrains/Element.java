package homeWork1.geekbrains;

import java.util.Arrays;

/*
Remove Element val
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
без создания нового массива, работаем с тем, что дано
 */
public class Element {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        System.out.println("Remove Elements: " + removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int removeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[removeIndex] = nums[i];
                removeIndex++;
            }
        }
        return removeIndex;
    }
}
