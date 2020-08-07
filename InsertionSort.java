package leetcode.preparation.sort;

/**
 * 插入排序
 */
public class InsertionSort {

    public static int[] sort(int[] input) {
        int length;
        if (input == null || (length = input.length) == 0) {
            return new int[0];
        }

        int temp;
        for (int i = 1; i < length; i++) {

            // 待排元素小于有序序列的最后一个元素时，向前插入
            if (input[i] < input[i - 1]) {
                temp = input[i];

                for (int j = i; j >= 0; j--) {

                    if (j > 0 && input[j - 1] > temp) {
                        input[j] = input[j - 1];
                    } else {
                        input[j] = temp;
                    }
                }
            }
        }
        return input;
    }
}