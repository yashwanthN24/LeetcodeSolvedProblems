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

    static class NodeComparator implements Comparator<ListNode> {
    public int compare(ListNode k1, ListNode k2){
    if (k1.val > k2.val)
    return 1;
    else if (k1.val < k2.val)
    return -1;
    return 0;
    }
    }
    public ListNode mergeKLists(ListNode[] arr) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new NodeComparator());
        int K = arr.length;
    ListNode head = new ListNode(0);  // Temporary node to hold the merged list
    ListNode last = head;

    for (int i = 0; i < K; i++) {
        if (arr[i] != null) {
            queue.add(arr[i]);  // Add the first node of each list
        }
    }

    while (!queue.isEmpty()) {
        ListNode curr = queue.poll();  // Get the smallest node
        last.next = curr;  // Add it to the result list
        last = last.next;

        if (curr.next != null) {
            queue.add(curr.next);  // Add the next node of the list
        }
    }

    return head.next;
    }

}