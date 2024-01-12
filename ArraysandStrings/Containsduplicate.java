package ArraysandStrings;
import java.util.HashSet;

public class Containsduplicate {
  public static boolean checkDuplicates(int[] nums){
    HashSet<Integer> hSet = new HashSet<>();
      for(int num: nums) {
        if (hSet.contains(num)) {
          return true;
        }
        hSet.add(num);
      }
      return false;

  }

  public static void main(String args[]) {
    int []nums = {1,2,3,4,5,1};
    boolean result = checkDuplicates(nums);
    System.out.println(result);
  }
}

// It has a time complexity of O(n) and a space complexity of O(n) in the worst case.
//********************************************************************************************* */

//SOLUTION 2: 

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0; i<nums.length-1; i++) {
//             if(nums[i] == nums[i+1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }


// Sorting the array with `Arrays.sort(nums)` takes O(n log n) time, and checking for adjacent equal elements in the sorted array takes O(n) time. The overall time complexity is O(n log n), and space complexity is O(1) due to in-place sorting without additional data structures.