/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


// What is a Binary Tree?
// A Binary Tree is a non-linear data structure in which each node can have at most two children:
// 1. Left Child
// 2. Right Child


// Term	Meaning
// Root	=> First node of tree
// Parent => 	Node having child nodes
// Child	=> Node connected below parent
// Leaf	Node => having no children
// Sibling	=> Nodes having same parent
// Edge	=> Connection between two nodes
// Depth	=> Distance from root to node
// Height	=> Longest path from node to leaf
// Subtree	=> A smaller tree inside a tree
// Level	=> Root is at level 0 (in common convention)


// Inorder Traversal (Left → Root → Right)


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        solve(root,result);
        return result;
    }

    public void solve(TreeNode root,List<Integer> result){

        if(root==null){
            return;
        }
        solve(root.left,result);
        result.add(root.val);
        solve(root.right,result);

    }
}

