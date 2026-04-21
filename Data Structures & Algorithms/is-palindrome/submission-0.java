class Solution {
    public boolean isPalindrome(String s) {
      String input = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
      int i = 0;
      int j = input.length()-1;
      while(i<j) {
        if(input.charAt(i) != input.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}
