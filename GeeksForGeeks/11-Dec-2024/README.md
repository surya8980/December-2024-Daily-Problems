# [Merge without extra space](https://github.com/surya8980/December-2024-Daily-Problems/blob/main/GeeksForGeeks/11-Dec-2024/Merge%20without%20extra%20space%20Brute%20Force.java)

Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.  

# Examples

**Example 1 :**

**Input:** a[] = [2, 4, 7, 10], b[] = [2, 3]  
**Output:**  
2 2 3 4  
7 10  
**Explanation:** After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10  

**Example 2:**

**Input:** a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]  
**Output:**  
1 2 3 5 8 9  
10 13 15 20  
**Explanation:** After merging two sorted arrays we get 5 10 12 18 20.  

**Example 3:**

**Input:** a[] = [0, 1], b[] = [2, 3]  
**Output:**  
0 1  
2 3  
**Explanation:** After merging two sorted arrays we get 0 1 2 3.  
# Constraints:
1 <= a.size(), b.size() <= 10^5  
0 <= a[i], b[i] <= 10^7
