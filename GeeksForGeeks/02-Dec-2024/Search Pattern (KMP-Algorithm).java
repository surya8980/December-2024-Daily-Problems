class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=pat.length();
        for(int i=0;i<=txt.length()-n;i++)
        {
            if(pat.charAt(0)!=txt.charAt(i))
                continue;
            String str=txt.substring(i,n+i);
            if(str.equals(pat))
                ans.add(i);
        }
        return ans;
    }
}
