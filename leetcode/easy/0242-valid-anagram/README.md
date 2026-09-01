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
**Runtime:** 1839 ms (beats 5.16%)  
**Memory:** 44.4 MB (beats 74.67%)  
**Submitted:** 2026-09-01T05:06:05.238Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char a1[] = s.toCharArray();
        char a2[] = t.toCharArray();
        for(int i=0;i<a1.length;i++){
            boolean fl=false;
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    a2[j]=' ';
                    fl=true;
                    break;
                }
            }
            if(fl==false)return false;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)