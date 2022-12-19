/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab43;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 20034
 */
public class Lab43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(in);
        int n = s.nextInt();
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i ++){
        arr[i] =  r.nextInt(30);
        }
out.println("array " + Arrays.toString(arr));
int es = 0;
int os = 0;
for (int i = 0; i < arr.length; i ++){
if (arr[i] % 2 == 0)
    es += arr[i];
else
    os += arr[i];
}
out.println(es);
out.println(os);
out.println("sum " + (es + os));
    }
    
}
