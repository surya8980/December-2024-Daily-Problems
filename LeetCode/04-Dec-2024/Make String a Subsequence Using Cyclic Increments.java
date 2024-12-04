class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length()){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);
            if(c1==c2||c1+1==c2){
                i++;
                j++;
            }else if(c1=='z'&&c2=='a'){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return(j==str2.length());
    }
}