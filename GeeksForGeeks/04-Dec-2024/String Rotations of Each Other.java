class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.equals(s2)) return true;
        return (s1+s1).lastIndexOf(s2)>0;
    }
}
