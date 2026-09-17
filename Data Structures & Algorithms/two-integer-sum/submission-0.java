class Solution {
    class Pair{
        int num;
        int idx;
        Pair(int n , int i)
        {
            this.num = n;
            this.idx = i;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] arr = new Pair[n];
        for(int i=0;i<n;i++)
        {
            int e = nums[i];
            Pair p = new Pair(e,i);
            arr[i] = p;
        }
        Arrays.sort(arr,(a,b)->{
            return Integer.compare(a.num,b.num);
        });
        int i=0 , j = n-1;
        while(i<j)
        {
            int sum = arr[i].num+arr[j].num;
            if(sum == target){
                int min = Math.min(arr[i].idx,arr[j].idx);
                int max = Math.max(arr[i].idx,arr[j].idx);
                return new int[]{min,max};
            }
            else if(sum < target) i++;
            else j--;
        }
        return new int[]{-1,-1};
    }
}
