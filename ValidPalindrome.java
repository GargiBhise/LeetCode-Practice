class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while(i<=j) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;        
            }
         return true;       
    }


    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println("\"" + s + "\" is a palindrome: " + isPalindrome(s));
}
    }
