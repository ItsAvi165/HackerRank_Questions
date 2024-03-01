// Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
// GFG Link: https://practice.geeksforgeeks.org/problems/key-pair5616/1

// Input Format

// The first line contains size of array and required sum
// Second line contains the elements of the array.
// Constraints

// 1 ≤ N ≤ 10^5
// 1 ≤ Arr[i] ≤ 10^5
// Output Format

// Output Y for Yes or N for No
// Sample Input 0

// 6 16
// 1 4 45 6 10 8
// Sample Output 0

// Y

//----------------------------------------------------------------------------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                int freq = hm.get(arr[i]);
                hm.put(arr[i], ++freq);
            }
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = k - a;
            if (a != b && hm.containsKey(b)) {
                flag = true;
                break;
            } else if (a == b && hm.get(b) > 1) {
                flag = true;
                break;
            }
            // else {
            // System.out.println("N");
            // break;
            // }
        }
        if (flag)
            System.out.println("Y");
        else
            System.out.println("N");
        sc.close();

    }
}