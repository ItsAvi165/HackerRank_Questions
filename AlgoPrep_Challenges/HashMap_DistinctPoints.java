// Given N 2D Points, Calculate no. of distinct points among them.

// Ex: x[5] = {2, 1, 3, 2, 2}
//     y[5] = {3, 1, 2, 3, 4}

// The first array represents the x co-ordinates, the second array represents the y co-ordinate. Acoording to above examples the points are
//     (x[0],y[0])->(2,3)
//     (x[1],y[1])->(1,1)
//     (x[2],y[2])->(3,2)
//     (x[3],y[3])->(2,3)
//     (x[4],y[4])->(2,4)

// Total number of distinct points are 4.
// Input Format

// The first line contains an Integer n denoting number of points.
// Second line contains n integer denoting the x-coordinates.
// Third line contains another n integer denoting the y-coordinates.
// Constraints

// 1<=n<=10^5
// Output Format

// Output the distinct points count
// Sample Input 0

// 5
// 2 1 3 2 2
// 3 1 2 3 4
// Sample Output 0

// 4

//----------------------------------------------------------------------------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int x1, y1, count = 0;
        for (int i = 0; i < n; i++) {
            x1 = x[i];
            y1 = y[i];
            if (hm.containsKey(x1) && hm.get(x1) != y1)
                count++;
            else if (hm.containsKey(x1) == false) {
                hm.put(x1, y1);
                count++;
            }
        }
        //OR using hashset
        //hs.add(X[i]+" "+Y[i]); //just add combination of x and y co-ordinate as one element
        System.out.println(count);
        sc.close();

    }
}
