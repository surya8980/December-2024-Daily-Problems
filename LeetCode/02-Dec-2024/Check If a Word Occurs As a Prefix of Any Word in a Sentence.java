class Solution {
    public boolean isprefix(String s1,String s2){
        if(s1.startsWith(s2))return true;
        else return false;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] st = sentence.split(" ");
        for(int i=0;i<st.length;i++){
            if(isprefix(st[i],searchWord))return i+1;
        }
        return -1;
    }
}
