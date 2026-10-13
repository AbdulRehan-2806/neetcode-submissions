class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int n = intervals.length;
        List<int[]> al = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0] <= prev[1]){
                prev[1] = Math.max(prev[1],intervals[i][1]);
            }
            else{
                al.add(prev);
                prev = intervals[i];
            }
        }
        al.add(prev);
        return al.toArray(new int[al.size()][]);
    }
}
