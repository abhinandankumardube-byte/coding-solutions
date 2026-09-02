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
**Runtime:** 6 ms (beats 87.65%)  
**Memory:** 44.2 MB (beats 37.68%)  
**Submitted:** 2026-09-02T09:25:41.808Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int f1[]=new int[26];
        for(char ch:s1.toCharArray())f1[ch-'a']++;

        int k=s1.length();

        int f2[]=new int[26];
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            // include
            f2[ch-'a']++;
            if(i<k-1)continue;

            if(Arrays.equals(f1,f2))return true;
            // shrink  or remove
            int sin = i-k+1;
            char sch = s2.charAt(sin);
            f2[sch-'a']--;
        }
        return false;
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)