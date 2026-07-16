/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void preOrder(TreeNode* root, string str, string &ans) {
        if(root == NULL) {
            return;
        }
        
        str = char(root->val + 'a') + str;
        if(root->left == NULL && root->right == NULL) {
            if(ans == "" || str < ans) {
                ans = str;
            }
            return;
        }
        preOrder(root->left, str, ans);
        preOrder(root->right, str, ans);
    }
    string smallestFromLeaf(TreeNode* root) {
        string ans = "";
        preOrder(root, "", ans);
        return ans;
    }
};