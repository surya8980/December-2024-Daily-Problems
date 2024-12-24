# [Search in a row-wise sorted matrix](https://github.com/surya8980/December-2024-Daily-Problems/blob/main/GeeksForGeeks/23-Dec-2024/Search%20in%20a%20row-wise%20sorted%20matrix.java)
# Problem Statement:
Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.

Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

# Examples :

**Example 1:**

**Input:** mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9

**Output:** true

**Explanation:** 9 is present in the matrix, so the output is true.

**Example 2:**

**Input:** mat[][] = [[19, 22, 27, 38, 55, 67]], x = 56

**Output:** false

**Explanation:** 56 is not present in the matrix, so the output is false.

**Example 3:**

**Input:** mat[][] = [[1, 2, 9],[65, 69, 75]], x = 91

**Output:** false 

**Explanation:** 91 is not present in the matrix.

# Constraints:
- 1 <= n, m <= 1000

- 1 <= mat[i][j] <= 10^5
  
- 1 <= x <= 105
