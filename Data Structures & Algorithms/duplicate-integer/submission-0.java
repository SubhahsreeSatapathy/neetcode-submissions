class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            
 if (findX(nums, nums[i], i)) {
        return true;
    }

        }
        return false;
    }

    boolean findX(int[] nums,int number,int excludedIndex){
        for(int i = 0; i < nums.length; i++) {
            if(i != excludedIndex && nums[i] == number) return true;
        }
        return false;
    }
}