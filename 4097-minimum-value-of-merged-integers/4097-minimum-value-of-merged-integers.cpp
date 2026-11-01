class Solution {
public:
    int minMergedInteger(vector<int>& nums) {
        int ans = INT_MAX;
        for(int i = 1; i < nums.size();){
            string str = to_string(nums[i-1]) + to_string(nums[i]);
            ans = min(stoi(str) , ans);
            i = i + 2;
        }
        return ans;
    }
};