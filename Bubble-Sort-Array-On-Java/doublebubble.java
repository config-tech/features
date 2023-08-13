/* package whatever; // don't place package name! */

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Arrays;

class Three {
public static void main(String[] args) {
    double num[][] = {
            {17.1, 21.4, 15.9, 19.1, 22.4, 20.7, 17.9, 18.6, 21.8, 16.1},
            {19.1, 20.5, 14.2, 16.9, 17.8, 18.1, 19.1, 15.8, 18.8, 17.2},
            {16.2, 17.3, 22.5, 19.9, 21.1, 15.1, 17.7, 19.8, 14.9, 20.5},
            {17.5, 19.2, 18.5, 15.7, 14.0, 18.6, 21.2, 16.8, 19.3, 17.8},
            {18.8, 14.3, 17.1, 19.5, 16.3, 20.3, 17.9, 23.0, 17.2, 15.2},
            {15.6, 17.4, 21.3, 22.1, 20.1, 14.5, 19.3, 18.4, 16.7, 18.2},
            {16.4, 18.7, 14.3, 18.2, 19.1, 15.3, 21.5, 17.2, 22.6, 20.4},
            {22.8, 17.5, 20.2, 15.5, 21.6, 18.1, 20.5, 14.0, 18.9, 16.5},
            {20.8, 16.6, 18.3, 21.7, 17.4, 23.0, 21.1, 19.8, 15.4, 18.1},
            {18.9, 14.7, 19.5, 20.9, 15.8, 20.2, 21.8, 18.2, 21.2, 20.1}
            };
            
    double[] flat = new double[10 * 10];

    int ctr = 0;
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            flat[ctr++] = num[row][col];
        }
    }
    Arrays.sort(flat);
    ctr = 0;
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            num[row][col] = flat[ctr++];
        }
    }
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            System.out.print(num[row][col] + " ");
        }
        System.out.println();
    }
}
}
