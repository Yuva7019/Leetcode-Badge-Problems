ublic class Solution {
    //Using BFS level by level using queue approach
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();//due to return type
        Queue<TreeNode> queue = new LinkedList<>();//they given class TREENODE
        queue.offer(root);//initializing first level
        
        while (!queue.isEmpty()) { //whilt till all the levels
            int size = queue.size();
            int max_val = Integer.MIN_VALUE;
            
            for (int i = 0; i <size; i++) {//loops till each level(0,1,2)
                TreeNode node = queue.poll();//remove from queue
         max_val = Math.max(max_val, node.val);//check max for each level
                
                if (node.left != null) 
                queue.offer(node.left);
 //check is there node for next iteratio and add to queue for next iteration
                if (node.right != null)
                 queue.offer(node.right);
                 //left right check from root node tree struct level by lvel
            }
            
            result.add(max_val);//after each level add to arraykList
        }
        
        return result;
    }
}