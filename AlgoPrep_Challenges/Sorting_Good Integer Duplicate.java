// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements can be duplicate.
// Input Format

// Integer representing N representing length of array
// N numbers of Array
// Constraints

// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9
// Output Format

// Count of Good Integers
// Sample Input 0

// 6
// 2 3 3 8 2 0
// Sample Output 0

// 3

//SOLUTION :

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int lessCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == 0)
            count++;
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                lessCount = i;
            }

            if (arr[i] == lessCount)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}