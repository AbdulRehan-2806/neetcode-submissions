class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0 ,j = s.length()-1;
        while(i<j)
        {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (!Character.isLetterOrDigit(a)) {
                i++;
            }
            else if (!Character.isLetterOrDigit(b)) {
                j--;
            }
            else if(a != b) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
