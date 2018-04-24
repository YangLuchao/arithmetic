package arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ylc
 * @date 2018/4/23 19:31
 * <p>
 * 题目：
 * 无重复字符的最长子串
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "a";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        // 记录字符上次出现过的位置
        int[] last = new int[1024];
        for (int i = 0; i < last.length; i++) {
            last[i] = -1;
        }
        // 记录当前字符串的起始位置
        int start = 0;
        int size = c.length;
        int nMax = 0;
        for (int i = 0; i < c.length; i++) {
            // s[start,..,i]中重复出现，重新开始记录
            if (last[c[i]] >= start) {
                nMax = Math.max(i - start, nMax);
                start = last[c[i]] + 1;
            }
            // 记录s[i]最后出现的位置
            last[c[i]] = i;
        }
        return Math.max(size - start, nMax);
    }
}
