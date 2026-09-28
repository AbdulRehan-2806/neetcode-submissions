class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        func(candidates, target, 0, al, ans);
        return ans;
    }

    static void func(int[] arr, int tar, int idx,
                     List<Integer> al, List<List<Integer>> ans) {

        if (tar == 0) {
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > tar)
                break;
            al.add(arr[i]);
            func(arr, tar - arr[i], i + 1, al, ans);

            al.remove(al.size() - 1);
        }
    }
}