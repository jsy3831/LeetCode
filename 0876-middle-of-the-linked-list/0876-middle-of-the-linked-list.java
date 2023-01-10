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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);

        int countNode = 1;
        ListNode nextNode = head.next;

        for(int i = 0; i < 100; i++) {
            if(nextNode == null) {
                break;
            } else {
                list.add(nextNode);
                countNode++;
                nextNode = nextNode.next;
            }
        }

        int midNode = countNode / 2;

        ListNode middleNode = list.get(midNode);

        return middleNode;
    }
}