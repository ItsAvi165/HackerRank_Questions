// Given an array arr[] of length N, The task is to count all distinct elements in arr[].
// Input Format

// The first line contains size of array.
// Second line contains the elements of the array.
// Constraints

// 1<=N<=10^5
// 1<=Arr[i]<=10^5
// Output Format

// Output the count.
// Sample Input 

// 6
// 10 20 20 10 30 10

// Sample Output 

// 3
//--------------------------------------------------------------------------------------------------------------------------

import java.util.HashSet;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hs.add(sc.nextInt());
        }
        System.out.println(hs.size());
        sc.close();

    }
}