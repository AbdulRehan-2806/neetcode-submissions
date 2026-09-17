class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            if(hs.contains(num)) return true;
            hs.add(num);
        }
        return false;
    }
}