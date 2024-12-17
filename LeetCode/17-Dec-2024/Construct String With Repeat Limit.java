class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        //used in designing passwords
        // take a frquency array fill it
        //start building the res 
        // start at largest index if it is zero, decrement and come out of loop 
        // append char with reeat limit 
        // update freq for the char 
        //do the same for valid prev char
        //return string  

        int [] freq= new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder res = new StringBuilder();
        int start = 25;
        while(start>=0){
            if(freq[start]==0){
                start--;
                continue;
            }
            int use = Math.min(freq[start],repeatLimit);
            for(int i=0;i<use;i++){
                res.append((char)('a'+start));
            }
            freq[start]-=use;
            if(freq[start]>0){
                int prev = start-1;
                while(prev>=0&&freq[prev]==0){
                    prev--;
                }
                if(prev<0) break;
                res.append((char)('a'+prev));
                freq[prev]--;
            }
        } 
        return res.toString();
    }

}
