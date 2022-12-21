/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nbasu
 */
public class laa {
    public static void main(String args[]) {
//      try {
//         long start = System.currentTimeMillis( );
//         System.out.println(new Date( ) + "\n");
//         Thread.sleep(5*60*10);
//         System.out.println(new Date( ) + "\n");
//         long end = System.currentTimeMillis( );
//         long diff = end - start;
//         System.out.println("Perbedaannya adalah : " + diff);
//      } catch (Exception e) {
//         System.out.println("Terdapat exception!");
//      }
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd H:m:s"); 

      String input =  "1818-11-11 04:00:00 " ; 

      System.out.print(input + " Memparsing sebagai "); 

      Date t; 

      try { 
          t = ft.parse(input); 
          System.out.println(t); 
      } catch (ParseException e) { 
          System.out.println("Tidak dapat diparsing menggunakan " + ft); 
      }
   }
}
