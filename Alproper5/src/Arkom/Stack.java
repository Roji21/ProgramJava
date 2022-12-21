package Arkom;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Stack {
    public static void main(String[] args) {
        pilihanmenu();
    }
    private static String [] stack =new String[5];
    
    private static int counter = 0;
    private static boolean stackStorage(){
        if (counter < stack.length){
            return true;           
        }else {
            return false;  
        }
    }
    private static void tambahstack(){
        int loop1 = 0;
        String data = "";
        Scanner input = new Scanner(System.in);
        while (loop1 == 0){
            System.out.print("Masukan Data (angka) : ");
            try{
                data = input.next();
                loop1 = 1;
            }catch (InputMismatchException e){
                System.out.println("Masukan Harus beupa Angka");
                break;
            }
        }
        stack[counter] = data;
        counter++;
    }
    private static void pop(){
        counter--;
        for (int i = counter; i < 0; i--) {
                stack[i] = stack[i+1];      
        }
        System.out.println("Data terakhir dalam Stack dikeluarkan");
    }
    private static void tampil(){
        System.out.println("Data Dalam Stack : ");
        for (int i = 0; i < counter; i++) {
               System.out.println("["+(i+1)+" => "+stack[i]+"]"); 
        }
        System.out.println("");
    }
    private static void hapusantrian(){
        counter = 0;
    }
    public static void pilihanmenu(){
        int loop2 = 0;
        int pilihmenu = 0;
        Scanner input = new Scanner(System.in);
        while (loop2 == 0) {            
            System.out.println("\nContoh Program Stack dengan Java");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Stack");
            System.out.println("2. Pop");
            System.out.println("3. Status Stack");
            System.out.println("4. Tampilkan data dalam Stack");
            System.out.println("5. Bersihkan Stack");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilihan Menu (1 - 6) >>> ");
            try {
                pilihmenu = input.nextInt();
                loop2 = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan Harus Angka!");
                break;
            }
        }
        System.out.println("");
        menu(pilihmenu);
    }
    private static void menu(int pilih){
        switch(pilih){
            case 1:
                boolean cek = stackStorage();
                if (cek){
                    tambahstack();
                }else {
                    System.out.println("Stack Penuh!, kosongkan data terlebih dahulu");
                }
                break;
            case 2:
                pop();
                break;
            case 3:
                System.out.println("Status Storage: ");
                System.out.println("Kapasitas: " + stack.length);
                System.out.println("Terisi   : " + counter);
                break;
            case 4:
                tampil();
                break;
            case 5:
                hapusantrian();
                break;
            case 6:
                quit();
                break;
        }
        pilihanmenu();
    }
    private static void quit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Keluar dari Program ? (Y/T) : ");
        String keluar = input.next();
        if (keluar.equals("y")||keluar.equals("Y")){
            System.exit(0);
        }else {
            pilihanmenu();
        }
    }
}
