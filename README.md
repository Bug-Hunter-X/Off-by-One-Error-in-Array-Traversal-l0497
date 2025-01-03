# Off-by-One Error in Java Array
This repository demonstrates a common yet subtle error in Java: the off-by-one error when iterating over arrays.  The bug involves accessing an array element beyond its valid index range, resulting in an `ArrayIndexOutOfBoundsException`. The solution shows how to correct this error.

## Bug Description:
The `bug.java` file contains a `for` loop that iterates over an array. Due to an incorrect loop condition (`i <= arr.length`), the loop attempts to access an index that is outside the bounds of the array. 

## Solution:
The `bugSolution.java` file demonstrates the corrected code, where the loop condition is changed to `i < arr.length`, ensuring that the loop does not exceed the array's valid index range. 