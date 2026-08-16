# second-largest3735

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T03:45:59.279Z  

```java
class Solution {
public int getSecondLargest(int[] arr) {
    int n = arr.length;

    int max = -1;

    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    int Smax = -1;

    for (int i = 0; i < n; i++) {
        if (arr[i] > Smax && arr[i] != max) {
            Smax = arr[i];
        }
    }

    return Smax;
}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-largest3735/1)