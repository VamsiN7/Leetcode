// https://leetcode.com/problems/add-two-numbers/submissions/801211890/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode p,temp = new ListNode(0);
        p=temp;
        while(l1!=null || l2!=null || sum!=0){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            temp.next = new ListNode(sum%10);
            sum/=10;
            temp=temp.next;
        }
        return p.next;
    }
}