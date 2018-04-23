package arithmetic;

import javax.swing.undo.CannotUndoException;

/**
 * @author ylc
 * @date 2018/4/22 16:11
 * <p>
 * 题目：
 * <p>
 * 给定两个非空链表来表示两个非负整数。
 * 位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    /**
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        // 根节点
        ListNode root = new ListNode(0);
        ListNode r = root;
        root.next = l1;

        ListNode p1 = l1;
        ListNode p2 = l2;

        // 进位符
        int carry = 0;
        int sum;
        while (p1 != null && p2 != null) {
            // 求和
            sum = p1.val + p2.val + carry;
            // 本位求和后的值
            p1.val = sum % 10;

            // 进位求和后的值
            carry = sum / 10;

            // 指向最后一个相加的节点
            r = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        if (p1 == null) {
            r.next = p2;
        } else {
            r.next = p1;
        }

        // 最后进位为1
        if (carry == 1) {
            // 开始时r.next是第一个要相加的节点
            while (r.next != null) {
                sum = r.next.val + carry;
                r.next.val = sum % 10;
                carry = sum / 10;
                r = r.next;
            }

            // 都加完了还要进位，新加一个节点
            if (carry == 1) {
                r.next = new ListNode(0);
            }
        }

        return root.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
