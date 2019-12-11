package exam;


/**
 * @PackageName: exam
 * @ClassName: Class2
 * @Description:
 * 合并两个排序链表
 * @author: 呆呆
 * @date: 2019/12/1
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Class2 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode cur = new ListNode(-1);
        ListNode newHead = cur;

        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                cur.next = list1;
                cur = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                cur = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null){
            cur.next = list1;
        }
        if (list2 != null){
            cur.next = list2;
        }
        return newHead.next;
    }
}
