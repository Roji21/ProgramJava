/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linklist;

/**
 *
 * @author Ky Nur
 */
public class linklist {
    public static class box{
        int nilai;
        box selanjutnya;
    }
    public static box boxawal,boxakhir;
    
    public static void main(String[] args) {
        
        box list1 = new box();
        list1.nilai = 20;
        
        box list2 = new box();
        list2.nilai = 40;
        
        box list3 = new box();
        list3.nilai = 60;
        boxawal = list1;
        boxakhir = list3;
        list1.selanjutnya = list2;
        list2.selanjutnya = list3;
//        list1.selanjutnya = list1.selanjutnya.selanjutnya;
//        box list4 = new box();
//        list4.nilai = 80;
//        
//        list4.selanjutnya = boxawal;
//        boxawal = list4;
        box trav;
        trav = boxawal;
        while(trav!=null){
            System.out.println(trav.nilai);
            trav = trav.selanjutnya;
        }
//        System.out.println(boxawal.selanjutnya.nilai);
    }
    
}
