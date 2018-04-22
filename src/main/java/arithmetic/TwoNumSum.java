package arithmetic;

import java.util.HashMap;

/**
 * @author ylc
 * @date 2018/4/22 15:13
 * <p>
 * 题目：
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例：
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] source =new int[]{2,7,11,15};
        int target = 9;
        int[] ints = twoSum(source, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] twoSum(int[] source, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        int[] res = new int[2];
        for (int i = 0; i < source.length; i++) {
            if(map.containsKey(target - source[i])){
                res[0] = i;
                res[1] = map.get(target -  source[i]);
                break;
            }
            map.put(source[i],i);
        }
        return res;
    }


}
