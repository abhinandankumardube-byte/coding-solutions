# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 163 ms (beats 10.33%)  
**Memory:** 46.7 MB (beats 20.71%)  
**Submitted:** 2026-09-02T08:57:05.774Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        for(int i=0;i<=s2.length()-k;i++){
            String sub = s2.substring(i, i+k);
            if(isAnagram(s1, sub))return true;
        }
        return false;
    }
    public boolean isAnagram(String s, String t) {
        int f1[]=new int[26];
        for(char ch:s.toCharArray()){
            f1[ch - 'a']++;
        }
        int f2[]=new int[26];
        for(char ch:t.toCharArray())f2[ch-'a']++;
        return Arrays.equals(f1,f2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)