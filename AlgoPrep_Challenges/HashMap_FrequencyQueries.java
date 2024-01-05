// Given N array elements and Q queries. For every query find frequency of element in array.
// Input Format

// First line contains 2 integers N, M denoting size of the array and the number of queries.
// Second line contains the elements of the array.
// Third line contains M elements representin queries. 
// Constraints

// 1 <= arr.length <= 10^5
// 1 <= arr[i], value <= 10^4
// 0 <= left <= right < arr.length
// Output Format

// Output M integers in different lines denoting the frequency of each query.
// Sample Input 0

// 9 2
// 2 8 6 9 8 6 8 2 11
// 2 8
// Sample Output 0

// 2
// 3

// ---------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int queries;
        size = sc.nextInt();
        queries = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int value = 0;
        for (int i = 0; i < size; i++) {
            if (hm.containsKey(arr[i])) {
                value = hm.get(arr[i]);
                hm.put(arr[i], ++value);
            } else
                hm.put(arr[i], 1);
        }

        while (queries > 0) {
            int element = sc.nextInt();
            if (hm.containsKey(element))
                System.out.println(hm.get(element));
            else
                System.out.println(0);
            queries--;
        }
    }
}