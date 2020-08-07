package leetcode.preparation.sort;

/**
 * 选择排序
 */
public class SelectionSort {

    public static int[] sort(int[] input) {
        int length;
        if (input == null || (length = input.length) == 0) {
            return new int[0];
        }

        int index, temp;
        for (int i = 0; i < length; i++) {
            index = i;

            for (int j = i + 1; j < length; j++) {
                if (input[index] > input[j]) {
                    index = j;
                }
            }

            temp = input[index];
            input[index] = input[i];
            input[i] = temp;
        }

        return input;
    }
}