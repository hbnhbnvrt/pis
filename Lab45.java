/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab45;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 20034
 */
public class Lab45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner s = new Scanner(in);
        int n = s.nextInt();
         int h = s.nextInt();

        Random r = new Random();
        int[][] arr = new int[n][h];
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j++ ){
        arr[i][j] =  r.nextInt(10);
            out.print((arr[i][j] + " "));
        }
            out.println();
        }

    }
    
}
