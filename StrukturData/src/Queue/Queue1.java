package Queue;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Queue1 {
    public static void main(String[] args) {
        pilihanmenu();
    }
    private static int[] queue =new int[5];
    private static int counter = 0;
    private static boolean queueStorage(){
        if (counter < queue.length){
            return true;           
        }else {
            return false;  
        }
    }
    private static void buatQueue(){
        int loop1 = 0;
        int data = 0;
        Scanner input = new Scanner(System.in);
        while (loop1 == 0){
            System.out.print("Masukan Data (angka) : ");
            try{
                data = input.nextInt();
                loop1 = 1;
            }catch (InputMismatchException e){
                System.out.println("Masukan Harus beupa Angka");
                break;
            }
        }
        queue[counter] = data;
        counter++;
    }
    private static void deque(){
        counter--;
        for (int i = 0; i < counter; i++) {
            queue[i] = queue[i+1];
        }
        System.out.println("Data pertama dalam antrian dikeluarkan");
    }
    private static void tampil(){
        System.out.println("Data Dalam Antrian : ");
        for (int i = 0; i < counter; i++) {
            System.out.println("["+(i+1)+" => "+queue[i]+"]");
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
            System.out.println("\nContoh Program Queue dengan Java");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Queue");
            System.out.println("2. Dequeue");
            System.out.println("3. Status Queue");
            System.out.println("4. Tampilkan data dalam Queue");
            System.out.println("5. Bersihkan Queue");
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
                boolean cek = queueStorage();
                if (cek){
                    buatQueue();
                }else {
                    System.out.println("Antrian Penuh!, kosongkan data terlebih dahulu");
                }
                break;
            case 2:
                deque();
                break;
            case 3:
                System.out.println("Status Storage: ");
                System.out.println("Kapasitas: " + queue.length);
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
