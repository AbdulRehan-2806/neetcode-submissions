/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->{
            return Integer.compare(a.start,b.start);
        });
        int n = intervals.size();
        if(n<=1) return true;
        Interval prev = intervals.get(0);
        for(int i=1;i<n;i++)
        {
            if(intervals.get(i).start < prev.end) return false;
            prev = intervals.get(i);
        }
        return true;

    }
}
