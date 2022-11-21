package homeWork1.geekbrains;

import java.util.Arrays;

/*
Вам даны два массива целых чисел nums1 и nums2, отсортированные в порядке неубывания,
и два целых числа m и n, представляющих количество элементов в nums1 и nums2 соответственно.
Объедините nums1 и nums2 в единый массив, отсортированный в порядке неубывания.
Окончательный отсортированный массив не должен быть возвращен функцией,
а вместо этого сохранен внутри массива nums1. Чтобы учесть это, nums1 имеет длину m + n,
где первые m элементов обозначают элементы, которые должны быть объединены,
а последние n элементов имеют значение 0 и должны игнорироваться. nums2 имеет длину n.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
 */
public class MergeArrays {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        merge(arr1, 3, arr2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int i = m + n - 1;
        while (b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[i] = nums1[a];
                i--;
                a--;
            } else {
                nums1[i] = nums2[b];
                i--;
                b--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}