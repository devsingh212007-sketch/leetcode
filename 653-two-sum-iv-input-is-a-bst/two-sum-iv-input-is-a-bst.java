
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        return check(root, k, set);
    }

    boolean check(TreeNode root, int k, java.util.HashSet<Integer> set) {
        if (root == null) return false;

        if (set.contains(k - root.val)) return true;

        set.add(root.val);

        return check(root.left, k, set) ||
               check(root.right, k, set);
    }
}
