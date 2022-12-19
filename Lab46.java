/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab46;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author 20034
 */
public class Lab46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();
        String d = s.nextLine();
        String f = s.nextLine();
        str(a, b, c, d, f);
    }
    
    public static void str(String s1, String s2, String s3, String s4, String s5){
    if (s4.equals(s5))
        out.println(s1 + s2);
    else 
         out.println(s1 + s3);
    
    
}
}
