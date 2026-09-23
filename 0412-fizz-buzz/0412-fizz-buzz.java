import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> newList = new ArrayList<>(n);
        
        int fizz = 0;
        int buzz = 0;
        
        for (int i = 1; i <= n; i++) {
            fizz++;
            buzz++;
            
            if (fizz == 3 && buzz == 5) {
                newList.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                newList.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                newList.add("Buzz");
                buzz = 0;
            } else {
                newList.add(String.valueOf(i));
            }
        }
        
        return newList;
    }
}
