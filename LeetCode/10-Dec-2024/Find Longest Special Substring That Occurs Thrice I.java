class Solution {
    public int maximumLength(String s) {
        //generate all substrings and check if each substring is special or not 
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++){
                //if string is empty or current char = prv added char then add it hashmap
                if(sb.length()==0||sb.charAt(sb.length()-1)==s.charAt(j)){
                    sb.append(s.charAt(j));
                    hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
                }else{
                    break;
                }
            }
        }
        int ans = 0;
        for(String str : hm.keySet()){
            if(hm.get(str)>=3&&str.length()>ans)ans = str.length();
        }
        if(ans==0)return -1;
        return ans;
    }
}
