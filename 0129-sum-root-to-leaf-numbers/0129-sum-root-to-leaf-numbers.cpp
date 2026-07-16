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

    void preOrder(TreeNode* root, int number, int &ans) {

        if(root == NULL) {
            return;
        }

        number = number * 10 + root->val;

        if(root->left == NULL && root->right == NULL) {
            ans += number;
            return;
        }

        preOrder(root->left, number, ans);
        preOrder(root->right, number, ans);
    }

    int sumNumbers(TreeNode* root) {

        int ans = 0;

        preOrder(root, 0, ans);

        return ans;
    }
};