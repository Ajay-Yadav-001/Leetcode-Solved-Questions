class Solution {
    public int findLucky(int[] arr) {
        int largestLuckyInt = -1;
        for(int i = 0; i<arr.length; i++){
            int CurrNum = arr[i];
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(CurrNum == arr[j]){
                    count++;
                }
            }
            if(CurrNum == count){
                largestLuckyInt = Math.max(largestLuckyInt, CurrNum);
            }
        }
        return largestLuckyInt;
    }
}