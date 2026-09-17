class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            String s = details[i];
            //11,13
            int age = Integer.parseInt(s.substring(11,13));
            if(age>60) res++;
        }
        return res;
    }
}