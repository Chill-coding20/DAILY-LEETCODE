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
 import java.util.ArrayList;
class Solution {
    List<Integer> firstNode;
    List<Integer> secondNode;
    public boolean isSameTree(TreeNode p, TreeNode q) {
         firstNode = new ArrayList<>();
          secondNode = new ArrayList<>();
         first(p);
         second(q);
         
         if(firstNode.equals(secondNode)) return true;
        else return false;
    }
    private void first(TreeNode node){
        if(node==null){ 
        firstNode.add(null);
        return;
        }
        firstNode.add(node.val);
        first(node.left);
        first(node.right);
           
            }
     private void second(TreeNode node){
        if(node==null){
             secondNode.add(null);
             return;
        }
        secondNode.add(node.val);
        second(node.left);
        second(node.right);
           
            }

        
}