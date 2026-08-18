class Solution {
public:
int solve(string s,string t)
{
    map<char,int>mp1;
    map<char,int> mp2;
    int ans=0;
    for(auto ch:s)
    {
        mp1[ch]++;
    }
    for(auto ch:t)
    {
        mp2[ch]++;
    }
    for(auto [ch,freq]:mp2)
    {
        if(mp1[ch]<freq)
          ans+=freq-mp1[ch];
    }
   
    
        


       
      
      
      
   
    return ans;
}
    int minSteps(string s, string t) {
       return  solve(s,t);
    }
};