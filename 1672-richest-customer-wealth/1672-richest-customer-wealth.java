import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int i = 0; i < accounts.length; i++){
            int res = 0;
            for(int j = 0; j < accounts[i].length; j++){
                res += accounts[i][j];
            }
            if(res > result){
                result = res;
            }
        }
        return result;
    }
}