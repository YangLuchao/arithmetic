package arithmetic.sort;

/**
 * @author ylc
 * @date 2018/4/23 19:11
 * <p>
 * 选择排序：
 * 冒泡排序的优化
 * 选择排序使用标记最值所在位置的方式, 查找最值过程中不移动数位置, 只是在最后将最值置换到顶端
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] source = {1, 4, 7, 2, 4, 5, 24, 57, 234, 76, 57234, 345, 75, 23, 24, 54, 678};
        selectSort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

    public static void selectSort(int[] source) {
        int i, j, max;
        int len = source.length;
        int tmp;

        for (j = len; j > 1; j--) {
            max = 0;
            for (i = 1; i < j; i++) {
                if (source[i] > source[max]) {
                    max = i;
                }
                if (max != j - 1) {
                    tmp = source[max];
                    source[max] = source[j - 1];
                    source[j - 1] = tmp;
                }
            }
        }


    }
}
