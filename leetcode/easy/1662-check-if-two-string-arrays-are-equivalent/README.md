# Check If Two String Arrays are Equivalent

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two string arrays `word1` and `word2`, return `true` *if the two arrays  **represent**  the same string, and* `false` *otherwise.* 

A string is  **represented**  by an array if the array elements concatenated  **in order**  forms the string.

 

 **Example 1:** 

```
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
```

 **Example 2:** 

```
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

```

 **Example 3:** 

```
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

```

 

 **Constraints:** 

- 1 <= word1.length, word2.length <= 103
- 1 <= word1[i].length, word2[i].length <= 103
- 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
- word1[i] and word2[i] consist of lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 83.54%)  
**Submitted:** 2026-08-28T12:04:40.892Z  

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String c:word1)sb1.append(c);
        for(String c:word2)sb2.append(c);
        return sb1.toString().equals(sb2.toString());
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)