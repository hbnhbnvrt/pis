/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.pkg2;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Arrays;
/**
 *
 * @author 20034
 */
public class Lab42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 25;
        int y = 1;
        int t = x - y;
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i ++){
        arr[i] =  r.nextInt(25);
        }
out.println("array " + Arrays.toString(arr));

out.println(XN(arr));

Arrays.sort(arr);
        out.println("sort " + Arrays.toString(arr));
    }
    public static int XN (int[] arr){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for ( int i : arr){
    if (i < min)
        min = i;
    if (i > max)
        max = i;
    }
    out.println("before max " + max);
        out.println("before min " + min);
        
        int w;
        w = min;
        min = max;
        max  = w;
        
out.println("after max " + max);
        out.println("after min " + min);
        
    return max;
    }
}
