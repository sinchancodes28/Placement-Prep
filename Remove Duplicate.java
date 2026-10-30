class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for( int j = i + 1 ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        // i represnt the index 
        // i + 1 number of umique element
        return i + 1;
    }
}
