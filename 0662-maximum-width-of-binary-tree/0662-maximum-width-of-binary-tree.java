class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        long maxWidth = 0;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.offer(root);
        index.offer(0L);

        while (!q.isEmpty()) {

            int n = q.size();
            long start = index.peek();

            for (int i = 0; i < n; i++) {

                TreeNode node = q.poll();
                long curr = index.poll() - start;

                if (i == n - 1) {
                    maxWidth = Math.max(maxWidth, curr + 1);
                }

                if (node.left != null) {
                    q.offer(node.left);
                    index.offer(2 * curr + 1);
                }

                if (node.right != null) {
                    q.offer(node.right);
                    index.offer(2 * curr + 2);
                }
            }
        }

        return (int) maxWidth;
    }
}