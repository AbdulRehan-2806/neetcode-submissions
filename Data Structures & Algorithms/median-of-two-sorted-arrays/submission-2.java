class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        int i = n-1 , j = m-1 , k = n+m-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j]){
                ans[k--] = nums1[i--];
            }
            else{
                ans[k--] = nums2[j--];
            }
        }
        while(i>=0) ans[k--] = nums1[i--];
        while(j>=0) ans[k--] = nums2[j--];
        int mid = (n+m)/2;
        if(mid == 0) return n == 0 ? (double)nums2[0] : (double)nums1[0];
        if((n+m) %2 == 1)
        {
            return (double)(ans[mid]);
        }
        else{
            return ((double)(ans[mid-1]+ans[mid])/2.0);
        }
    }
}
