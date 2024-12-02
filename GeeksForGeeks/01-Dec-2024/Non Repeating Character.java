class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //if any char has count 1 break
        char k ='$';
        for(char c : s.toCharArray()){
            if(hm.get(c)==1){
                k=c;
                break;
            }
        }
        return k;
    }
}
