class Solution {
public:
    bool wordPattern(string pattern, string s) {

        unordered_map<char, int> charMap;
        unordered_map<string, int> wordMap;

        stringstream ss(s);
        string word;

        int i = 0;

        while (ss >> word) {

            if (i == pattern.size())
                return false;

            if (charMap[pattern[i]] != wordMap[word])
                return false;

            charMap[pattern[i]] = i + 1;
            wordMap[word] = i + 1;

            i++;
        }

        return i == pattern.size();
    }
};