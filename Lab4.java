/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

//import static java.lang.System.out;
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    
   static  int rez (){
               int res =0;
        try{
         String[] arr = new String[11];
            arr[0] = "zero";
            arr[1] = "one";
            arr[2] = "two";
            arr[3] = "three";
            arr[4] = "four";
            arr[5] = "five";
            arr[6] = "six";
            arr[7] = "seven";
            arr[8] = "eight";
            arr[9] = "nine";
            arr[10] = " ";
            
            if (arr.length < 0) {
                throw new NegativeArraySizeException("исключение возникает при попытке создать массив отрицательного размера");
            }
if (arr.length > 11){
                throw new ArrayIndexOutOfBoundsException("попытка адресовать элементы за пределами массива");
}
        System.out.println("введите числло от 0 до 9");
        Scanner s = new Scanner(System.in);
        String n = s.next();
        
             try {
        for (int i = arr.length; i > 0; i--) {
              for (int j = 0; j < n.length(); j++) {
                  char r = arr[i].charAt(j);
                 char h = n.charAt(j);
                      if (r != h) { 
//                          return 0;
                         break;
                      } else { res=i; }       
              }}
              }catch(StringIndexOutOfBoundsException e)
                      {
                          System.out.println(e);
                          
                      }  
        } catch (NegativeArraySizeException e) {
            System.out.println(e + "исключение возникает при попытке создать массив отрицательного размера");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
    return res;
                }
        
    public static void main(String[] args) {
        System.out.println(rez());

            }
   
}
    

