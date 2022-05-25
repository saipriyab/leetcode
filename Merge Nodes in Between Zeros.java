class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            sum=sum+curr.val;
            if(curr.val==0)
            {
                prev.val=sum;
                sum=0;
                if(curr.next!=null)
                {
                    prev=prev.next;
                }
                
            }
            curr=curr.next;
        }
        prev.next=null;
        return head;
    }
}

leetcode url: https://leetcode.com/problems/merge-nodes-in-between-zeros/
