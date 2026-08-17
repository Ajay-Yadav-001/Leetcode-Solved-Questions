class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = 0;
        for(int i = 0; i<candies.length; i++){
            if(candies[i]>largest){
                largest = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= largest){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}