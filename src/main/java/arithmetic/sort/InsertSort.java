package arithmetic.sort;

/**
 * @author ylc
 * @date 2018/4/23 19:27
 * <p>
 * 插入排序：
 * <p>
 * 将一个记录插入到已经排好序的有序表中，从而得到一个新的、记录数增1的有序表
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] source = {1, 4, 7, 2, 4, 5, 24, 57, 234, 76, 57234, 345, 75, 23, 24, 54, 678};
        insertSort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

    public static void insertSort(int[] source) {
        int n = source.length;
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && source[j] < source[j - 1]; j--) {
                tmp = source[j];
                source[j] = source[j - 1];
                source[j - 1] = tmp;
            }
        }

    }
}
