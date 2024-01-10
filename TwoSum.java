import java.util.*;

class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, n = numbers.length, Right = n-1;

        while(left<Right) {
            int sum = numbers[left] + numbers[Right];
            if (sum == target) {
                return new int[] {left + 1, Right + 1};
            }
            else if(sum<target) {
                left++;
            }
            else {
                Right--;
            }
        }
        return new int[] {-1,-1};
    }

public static void main(String []args) {
    TwoSum sol = new TwoSum();
    int[] numbers = {2,7,11,15}; 
    int target = 13;
    int[] result = sol.twoSum(numbers, target);
    System.out.println(Arrays.toString(result));
}
}

//The twoSum method returns an array, and you can't print an array directly in Java using System.out.println(). Instead, you need to use Arrays.toString() to convert the array to a string first.