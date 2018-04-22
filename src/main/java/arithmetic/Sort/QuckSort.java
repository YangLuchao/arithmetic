package arithmetic.sort;

/**
 * @author ylc
 * @date 2018/4/22 16:42
 * <p>
 * 快速排序
 * 在要排的数（比如数组A）中选择一个中心值key（比如A[0]），
 * 通过一趟排序将数组A分成两部分，其中以key为中心，key右边都比key大，key左边的都key小，
 * 然后对这两部分分别重复这个过程，直到整个有序。
 */
public class QuckSort {

    public static void main(String[] args) {
        int[] source = {7, 4, 9, 2, 4, 5, 24, 57, 234, 76, 57234, 345, 75, 23, 24, 54, 678};
        quckSort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

    public static void quckSort(int[] source) {
        if (source.length > 0) {
            quckSort(source, 0, source.length - 1);
        }
    }

    private static void quckSort(int[] source, int low, int high) {
        if (low > high) {
            return;
        }

        int i = low;
        int j = high;
        int key = source[low];

        while (i < j) {
            // 从右往左找到第一个比key小的值
            while (i < j && source[j] > key) {
                j--;
            }

            // 从左往右找到第一个比key大的值
            while (i < j && source[i] <= key) {
                i++;
            }

            // 交换
            if (i < j) {
                int tmp = 0;
                tmp = source[i];
                source[i] = source[j];
                source[j] = tmp;
            }
        }

        // 调整key的位置
        int tmp = 0;
        tmp = source[i];
        source[i] = source[low];
        source[low] = tmp;

        // key的左边进行排列
        quckSort(source, low, i - 1);
        // key的右边进行排列
        quckSort(source, i + 1, high);


    }
}
