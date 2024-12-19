# [Kth Missing Positive Number in a Sorted Array](https://github.com/surya8980/December-2024-Daily-Problems/blob/main/GeeksForGeeks/19-Dec-2024/Kth%20Missing%20Positive%20Number%20in%20a%20Sorted%20Array.java)
# Problem Statement:

Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].   

# Examples :

**Example 1:**
**Input:** arr[] = [2, 3, 4, 7, 11], k = 5  
**Output:** 9    
**Explanation:** Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.    

**Example 2:**

**Input:** arr[] = [1, 2, 3], k = 2   
**Output:** 5   
**Explanation:** Missing are 4, 5, 6… and 2nd missing number is 5.   

**Example 3:**

**Input:** arr[] = [3, 5, 9, 10, 11, 12], k = 2  
**Output:** 2    
**Explanation:** Missing are 1, 2, 4, 6… and 2nd missing number is 2.   
# Constraints:
1 <= arr.size() <= 10^5  
1 <= k <= 10^5     
1 <= arr[i]<= 10^6   
