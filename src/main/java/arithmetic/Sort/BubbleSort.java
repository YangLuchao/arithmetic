package arithmetic.Sort;

/**
 * @author ylc
 * @date 2018/4/22 16:18
 * <p>
 * 冒泡排序，对比两个元素，小的放右边，大的放左边
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] source = {1, 4, 7, 2, 4, 5, 24, 57, 234, 76, 57234, 345, 75, 23, 24, 54, 678};
        bubbleSort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1 - i; j++) {
                if (source[j] > source[j + 1]) {
                    int tmp = 0;
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                }
            }
        }
    }
}
