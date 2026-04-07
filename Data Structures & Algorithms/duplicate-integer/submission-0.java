class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nondupes = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(nondupes.contains(nums[i])){
                return true;
            }
            else{
                nondupes.add(nums[i]);
            }
        }
        return false;
    }
}