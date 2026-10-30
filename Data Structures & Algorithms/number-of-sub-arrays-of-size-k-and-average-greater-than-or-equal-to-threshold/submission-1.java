class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int cnt = 0;
        int sum = 0;
        int l = 0;
        int r=0;
        while(r-l+1 <= k)
        {
            sum += arr[r];
            r++;
        }
        if(sum/k >= threshold) cnt++;
        //r++;
        while(r<n)
        {
            sum -= arr[l++];

            sum += arr[r];
            System.out.println(l+" "+r+" "+sum);
            if(sum/k >= threshold){
                //System.out.println(l+" "+r);
                cnt++;
            }
            r++;
        }
        return cnt;
    }
}