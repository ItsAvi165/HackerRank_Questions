//Important Question

// Given an array arr[] of N distinct integers points on the 2D Plane. The task is to count the number of Right-Angled Triangle from N points such that
// the base or perpendicular is parallel to the X or Y-axis.
// Input Format

// The first line contains number of coordinates N.
// Next N lines contains pair  "X Y" denoting coordinates
// Constraints

// 1<=n<=10^5
// 1<=X,Y<=10^5
// Output Format

// Print number of triangles.
// Sample Input 0

// 3
// 4 2
// 2 1
// 1 3
// Sample Output 0

// 0

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int points[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer, Integer> xpoints = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ypoints = new HashMap<Integer, Integer>();

//Storing x co-ordinates in xpoints hashmap and y co-ordinate in ypoints hashmap
        for (int i = 0; i < n; i++) {
            if (xpoints.containsKey(points[i][0])) {
                xpoints.put(points[i][0], xpoints.get(points[i][0]) + 1);
            } else {
                xpoints.put(points[i][0], 1);
            }
            if (ypoints.containsKey(points[i][1])) {
                ypoints.put(points[i][1], ypoints.get(points[i][1]) + 1);
            } else {
                ypoints.put(points[i][1], 1);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {// counting all triangles considering right angle is at each point

          //count number of points whose x and y co-ordinates are same to the iterating point with which
          //we can form the right angled triangles
          //also -1 the point where the right angle is i.e iterating point

            if (xpoints.get(points[i][0]) >= 1 && ypoints.get(points[i][1]) >= 1) {
                count += ((xpoints.get(points[i][0]) - 1) * (ypoints.get(points[i][1]) - 1));
            }
        }

        System.out.println(count);
        sc.close();

    }
}
