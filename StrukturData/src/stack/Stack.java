package Stack;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Stack {

    public static void main(String[] args) {
        pilihanmenu();
//        System.out.println();
    }
    private static String[][] nama = new String[3][3];
    private static int[][] indikasi = new int[3][3];

    private static int counter = 0;

    private static boolean stackStorage() {
        if (counter < nama.length) {
            return true;
        } else {
            return false;
        }
    }

    private static void tambahstack() {
        int loop1 = 0;
        String data = "";
        Scanner input = new Scanner(System.in);
        while (loop1 == 0) {
            System.out.print("Masukan Data (angka) : ");
            try {
                data = input.next();
                loop1 = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan Harus beupa Angka");
                break;
            }
        }
        nama[counter][counter] = data;
        counter++;
    }

    private static void pop() {
        counter--;
        for (int i = counter; i < 0; i--) {
//            for (int j = 0; j < counter; j++) {
            nama[i][i] = nama[i + 1][i + 1];
//            }            
        }
        System.out.println("Data terakhir dalam Stack dikeluarkan");
    }

    private static void tampil() {
        System.out.println("Data Dalam Stack : ");
        for (int i = 0; i < counter; i++) {
//            for (int j = 0; j < counter; j++) {
            System.out.println("[" + (i + 1) + " => " + nama[i][i] + "]");
//            } 
        }
        System.out.println("");
    }

    private static void hapusantrian() {
        counter = 0;
    }

    public static void pilihanmenu() {
        int loop2 = 0;
        int pilihmenu = 0;
        Scanner input = new Scanner(System.in);
        while (loop2 == 0) {
            System.out.println("\nContoh Program Stack dengan Java");
            System.out.println("Menu: ");
            System.out.println("1. Parkir Mobil");
            System.out.println("2. Keluarkan Mobil");
            System.out.println("3. Status Parkiran");
            System.out.println("4. Tampilkan Isi Parkiran");
//            System.out.println("5. Bersihkan Stack");
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

    private static void menu(int pilih) {
        switch (pilih) {
            case 1:
                boolean cek = stackStorage();
                if (cek) {
                    tambahstack();
                } else {
                    System.out.println("Parkiran Penuh!, kosongkan data terlebih dahulu");
                }
                break;
            case 2:
                pop();
                break;
            case 3:
                System.out.println("Status Storage: ");
                System.out.println("Kapasitas: " + nama.length);
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

    private static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < indikasi.length && y >= 0
                && y < indikasi.length && maze[x][y] == 1);
    }

    private static boolean sorti(int ind[][]) {
        int sol[][] = new int[indikasi.length][indikasi.length];

        if (sort(ind, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        return true;
    }

    private static boolean sort(int ind[][], int x, int y, int sol[][]) {
        if (x == indikasi.length - 1 && y == indikasi.length - 1 && ind[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(ind, x, y) == true) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (sort(ind, x + 1, y, sol)) {
                return true;
            }
            if (sort(ind, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    private static void quit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Keluar dari Program ? (Y/T) : ");
        String keluar = input.next();
        if (keluar.equals("y") || keluar.equals("Y")) {
            System.exit(0);
        } else {
            pilihanmenu();
        }
    }
}
