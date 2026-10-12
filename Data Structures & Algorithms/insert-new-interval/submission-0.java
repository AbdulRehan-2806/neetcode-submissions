class Solution {
    public int[][] insert(int[][] intervals, int[] newi) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int i=0;
        while(i<n && intervals[i][1] < newi[0]){
            ans.add(intervals[i]);
            i++;
        }
        while(i<n && newi[1] >= intervals[i][0]){
            newi[0] = Math.min(newi[0],intervals[i][0]);
            newi[1] = Math.max(newi[1] , intervals[i][1]);
            i++;
        }
        ans.add(newi);
        while(i<n)
        {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
