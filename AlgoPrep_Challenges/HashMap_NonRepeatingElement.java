// Find the first non-repeating element in a given array arr of N integers.
// GFG Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1

// Input Format

// The first line contains size of array.
// Second line contains the elements of the array.
// Constraints

// 1 <= N <= 10^7
// -10^16 <= Ai <= 10^16
// Array consists of only positive and negative integers and not zero.
// Output Format

// Output the required element
// Sample Input 0

// 5
// -1 2 -1 3 2
// Sample Output 0

// 3

//----------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                int val = hm.get(arr[i]);
                hm.put(arr[i], ++val);
            }
        }
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}