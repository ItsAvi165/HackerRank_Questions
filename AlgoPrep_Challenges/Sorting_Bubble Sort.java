// Given N array Integers, Sort the array using Bubble sort technique
// Input Format

// Integer representing N representing length of array
// N numbers of Array
// Constraints

// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9
// Output Format

// Print the sorted array in a line separated by space

// Sample Input 0
// 5
// 7 9 3 10 4

// Sample Output 0

// 3 4 7 9 10

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }
}