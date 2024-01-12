package ArraysandStrings;

import java.util.Arrays;

public class PermutationInString {
  
    public static boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length() || s2.length()==0) {
        return false;
    }
    if(s1.length() == 0) {
        return true;
    }
    int x = s1.length(), y = s2.length();

    int[] arr1 = new int[26];
    int[] arr2 = new int[26];

//Loop through 1st window

for(int i=0; i< x; i++) {
    arr1[s1.charAt(i) - 'a']++;
    arr2[s2.charAt(i) - 'a']++;
}

for(int i = x; i<y; i++) {
    if(Arrays.equals(arr1, arr2)) {
        return true;
    }

    arr2[s2.charAt(i-x) - 'a']--;
    arr2[s2.charAt(i) - 'a']++;
}

if(Arrays.equals(arr1, arr2)) {
    return true;
}
else {
    return false;
}
       
       
    }

    public static void main(String[] args) {
      boolean result = checkInclusion("ab", "eidboaoo");
      System.out.println(result);
    }
}

