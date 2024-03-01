// Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.

// Leetcode Link: https://leetcode.com/problems/binary-search/description/
// Input Format

// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k
// Constraints

// 1 <= n <= 10^9
// Output Format

// Return true if k is present else false.
// Sample Input 0

// 10
// 4 7 10 13 15 20 21 24 26 28
// 13
// Sample Output 0

// true

//SOLUTION :

import java.util.*;

class Solution {
    public static boolean binarySearch(int[] arr, int k) {
        int length = arr.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == k)
                return true;
            if (arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(binarySearch(arr, k));
        sc.close();
    }
}