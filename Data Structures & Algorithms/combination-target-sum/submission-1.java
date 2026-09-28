class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        func(nums , n , ans , al , 0 , target);
        return ans;
    }
    static void func(int[] arr , int n , List<List<Integer>> ans , List<Integer> al , int idx , int tar)
    {
        if(tar == 0){
            ans.add(new ArrayList<>(al));
            return ;
        }
        if(idx == n || tar < 0)
        {
            return ;
        }
        al.add(arr[idx]);
        func(arr , n , ans , al , idx , tar-arr[idx]);
        al.remove(al.size()-1);
        func(arr , n , ans , al , idx+1 , tar);
    }
}
