package d23;

/**
 * @PackageName: d23
 * @ClassName: Class1
 * @Description:
 * 平衡二叉树检查
 * @author: 呆呆
 * @date: 2019/12/2
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Class1 {
    public boolean isBalance(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) <= 1){
            return isBalance(root.left) && isBalance(root.right);
        }else {
            return false;
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left,right)+1;
    }
}
