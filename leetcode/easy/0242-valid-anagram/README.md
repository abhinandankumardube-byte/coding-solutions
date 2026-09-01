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
**Runtime:** 4 ms (beats 83.52%)  
**Memory:** 46.8 MB (beats 9.11%)  
**Submitted:** 2026-09-01T05:10:35.194Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char a1[] = s.toCharArray();
        char a2[] = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)