# 🧩 Stark String

## Problem Statement

You are given two strings **str1** and **str2** representing String A and String B respectively.  

A **Stark String** is formed by combining characters from both strings using the following rules:

1. Start taking characters alternately from A and B.  
2. Characters from A are taken sequentially (index 0, 1, 2, ...).  
3. The index of character taken from B is calculated as:  

   **B_index = current_index_of_A + previous_index_of_A**

4. For the first character from B, use index **0**.  
5. If string A ends, append all remaining unused characters from B to the result.  
6. If the calculated B index exceeds the length of B, stop using the pattern and append remaining B characters.  

Return the final **Stark String**.

---

## Example 1

### Input
str1 = "abcdef"
str2 = "ghijklmnopqrst"


### Output
agbhcjdlenfpqrst


### Explanation
A indices: 0, 1, 2, 3, 4, 5  
B indices: 0, 1, 3, 5, 7, 9  
Remaining B: qrst  

---

## Example 2

### Input
str1 = "ab"
str2 = "wxyz"


### Output
awbxyz


---

## Constraints

- 1 <= str1.length < 100  
- 1 <= str2.length < 100  
- str2.length > str1.length  
- str1 and str2 consist of lowercase English letters.  
- 0-based indexing is used.  