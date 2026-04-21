class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> groups = new ArrayList<>();
        if (strs == null || strs.length == 0) return groups;
        
        for(String str: strs){
            boolean placed = false;

            for(int i = 0; i < groups.size(); i++){
                if(areAnagrams(groups.get(i).get(0),str)){
                    groups.get(i).add(str);
                    placed = true;
                    break;
                }
            }
            if(placed != true){
            List<String> newGroup = new ArrayList<>();
            newGroup.add(str);
            groups.add(newGroup);
            }      
        }

        return groups;
  
    }

    private boolean areAnagrams(String a,String b) {
        if(a.length() != b.length()) return false;
        int[] frequencyArray = new int[26];

        for(int i = 0; i < a.length(); i++) {

            frequencyArray[a.charAt(i) - 'a']++;
            frequencyArray[b.charAt(i) - 'a']--;
        }

        for(int i = 0; i < frequencyArray.length; i++){
            if(frequencyArray[i] != 0) return false;
        }

        return true;

    }
}