class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        buildPaths(root, "", paths);
        return paths;
    }
    
    // Helper function to build the paths
    private void buildPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) {
            return;
        }
        
        // Add the current node's value to the path
        path += Integer.toString(node.val);
        
        // If the current node is a leaf, add the path to the list
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            // If not a leaf, continue to traverse left and right
            path += "->";  // Add arrow for intermediate nodes
            buildPaths(node.left, path, paths);
            buildPaths(node.right, path, paths);
        }
    }
}
