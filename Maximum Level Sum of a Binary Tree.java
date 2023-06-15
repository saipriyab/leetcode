url: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

class Solution {
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE,sum=0,level=0,maxLevel=0,size=0,i=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            size=queue.size();
            sum=0;
            level++;
            for(i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null)
                queue.offer(node.left);
                if(node.right!=null)
                queue.offer(node.right);
            }
            if(sum>max)
            {
                max=sum;
                maxLevel=level;
            }
        }
        return maxLevel;
    }
}
