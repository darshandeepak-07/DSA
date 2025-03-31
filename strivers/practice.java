package strivers;

import java.util.ArrayList;
import java.util.List;

public class practice {

    public List<Integer> frequencyCount(int[] arr) {
       
        int[] freq = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            
             if(arr[i] >= 1 && arr[i] <= arr.length) {
                 freq[arr[i] - 1]++;
             }
        }
          List<Integer> result = new ArrayList<>();
         for (int val : freq) {
             result.add(val);
         }
        
        return result;
     }
     
    public static void main(String[] args) {

    }
}