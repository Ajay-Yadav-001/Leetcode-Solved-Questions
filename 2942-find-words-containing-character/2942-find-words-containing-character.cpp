class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        int index = 0;
        vector<int>ans;
        for(string str : words){
            for(char ch : str){
                if(ch == x){
                    ans.push_back(index);
                    break;
                }
            }
                index++;
        }
        return ans;
    }
};