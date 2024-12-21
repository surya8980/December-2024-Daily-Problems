# [Spirally Traversing a matrix](https://github.com/surya8980/December-2024-Daily-Problems/blob/main/GeeksForGeeks/20-Dec-2024/Spirally%20Traversing%20a%20matrix.java)
# Problem Statement:
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form. 

# Examples:

**Example 1:**

**Input:** mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]   

**Output:** [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]   

**Explanation:**    

![image](https://github.com/user-attachments/assets/c7eec618-3438-434d-9003-8b128a677ce8)

**Example 2:**

**Input:** mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]  

**Output:** [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]      

**Explanation:** Applying same technique as shown above.   

**Example 3:**   

**Input:** mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]    

**Output:** [32, 44, 27, 23, 62, 50, 28, 54]            

**Explanation:** Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].  

# Constraints:   
1 <= n, m <= 1000   
0 <= mat[i][j]<= 100
