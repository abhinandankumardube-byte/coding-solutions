# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.65%)  
**Memory:** 44.4 MB (beats 74.67%)  
**Submitted:** 2026-09-01T05:25:16.855Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int f1[]=new int[26];
        for(char ch:s.toCharArray()){
            f1[ch - 'a']++;
        }
        int f2[]=new int[26];
        for(char ch:t.toCharArray()){
            f2[ch - 'a']++;
        }
        return Arrays.equals(f1,f2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)