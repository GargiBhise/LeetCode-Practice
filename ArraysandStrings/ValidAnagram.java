package ArraysandStrings;

//import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
  public static boolean anagram(String s, String t){
    if(s.length() != t.length()) { //checking the length of the String. 
      return false;
    }
  //********************************************************************* */
    // char[] sChar = s.toCharArray();
    // char[] tChar = t.toCharArray();
    // Arrays.sort(sChar);
    // Arrays.sort(tChar);

  //  return Arrays.equals(sChar, tChar);       SOLUTION:1
  //Time complexity O(nlogn) as we are applying soring algo. 

//************************************************************************ */

// *****************  SOLUTION 2  ******************
// int[] arr = new int[26];
//   for(int i=0; i<s.length(); i++) {
//     arr[t.charAt(i) - 'a']++;
//     arr[s.charAt(i) - 'a']--;
//   }
// for(int count: arr) {
//   if(count != 0) {
//     return false;
//   }
// }

//   return true;
// //Time complexity: O(n), Space complexity: O(1)

  HashMap<Character,Integer> hmap = new HashMap<>();
  for(int i=0; i<s.length(); i++) {
      hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i),0) + 1);
      hmap.put(t.charAt(i), hmap.getOrDefault(t.charAt(i),0) - 1);
  }

  for(char c: hmap.keySet()) {
    if (hmap.get(c) != 0) {
      return false;
    }
  }
  return true;

  }

  public static void main(String[] args) {
    String s = "cat";
    String t="tac";
    boolean result = anagram(s, t);
    System.out.println(result);
  }
}
