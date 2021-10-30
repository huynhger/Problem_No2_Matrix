/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */
public class ArrayHandler {

    static void rotateArray(int N, int arr[][]) {

        int[][] res = new int[N][N];
        for (int j = 0; j < N; j++) {
            for (int i = N - 1; i >= 0; i--) {
                res[i][j] = arr[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printArray(int N, int arr[][]) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
