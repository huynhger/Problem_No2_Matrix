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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        //input
        int N = 4;
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayHandler ah = new ArrayHandler();
        System.out.println("before:");
        ah.printArray(N, arr);
        System.out.println("after");
        ah.rotateArray(N, arr);

        
        
    }
}
