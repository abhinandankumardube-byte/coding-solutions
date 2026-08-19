# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 45.16%)  
**Memory:** 44.9 MB (beats 39.59%)  
**Submitted:** 2026-08-19T08:59:42.791Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder ns=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'  || ch>='0' && ch<='9'){
                ns.append(ch);
            }
        }
        
        return checkPalin(ns.toString());
    }
    boolean checkPalin(String s){
        String rev= new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)