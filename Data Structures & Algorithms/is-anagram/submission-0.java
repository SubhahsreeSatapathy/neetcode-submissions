class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(sArray.length != tArray.length) return false;

        for(int i = 0; i < sArray.length; i++){
            counter[sArray[i] - 'a']++;
            counter[tArray[i] - 'a']--;
        }
        
        for(int i = 0; i < 26; i++) {
            if(counter[i] != 0) return false;
        }

        return true;
    }
}
