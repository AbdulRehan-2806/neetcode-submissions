class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        func(nums , n , ans , al , 0);
        return ans;
    }
    static void func(int[] arr , int n , List<List<Integer>> ans , List<Integer> al , int idx)
    {
        if(idx == n)
        {
            ans.add(new ArrayList<>(al));
            return ;
        }
        al.add(arr[idx]);
        func(arr , n , ans , al , idx+1);
        al.remove(al.size()-1);
        func(arr , n , ans , al , idx+1);
    }
}
