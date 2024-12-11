# [Non-Overlapping Intervals](https://github.com/surya8980/December-2024-Daily-Problems/tree/main/GeeksForGeeks/10-Dec-2024)
# Problem Statement:
Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.  

# Examples

**Example 1:**  

**Input:** intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]  
**Output:** 1  
**Explanation:** [1, 3] can be removed and the rest of the intervals are non-overlapping.  

**Example 2:**

**Input:** intervals[][] = [[1, 3], [1, 3], [1, 3]]  
**Output:** 2  
**Explanation:** You need to remove two [1, 3] to make the rest of the intervals non-overlapping. 

**Example 3 :**

**Input :** intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]  
**Output:** 0  
**Explanation:** All ranges are already non overlapping.  

# Constraints:
1 ≤ intervals.size() ≤  10^5  
|intervalsi| == 2  
0 ≤ starti < endi <=5*104
