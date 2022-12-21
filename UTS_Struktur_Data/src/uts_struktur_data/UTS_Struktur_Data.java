package uts_struktur_data;

import java.util.Scanner;

public class UTS_Struktur_Data {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan ordo matrik pertama");
        System.out.println("Baris : ");
        int o = input.nextInt();
        System.out.println("Kolom : ");
        int p = input.nextInt();
        System.out.println("Masukan ordo matrik kedua");
        System.out.println("Baris : ");
        int l = input.nextInt();
        System.out.println("Kolom : ");
        int k = input.nextInt();
        int matriks1[][] = new int[o][p];
        int matriks2[][] = new int[l][k];
        if (p != l) {
            System.out.println("Matriks tidak dapat dikalikan satu sama lain.\n");
        } else {
            System.out.println("Masukkan elemen matriks pertama: ");
            for (int i = 0; i < o; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.println("baris " + (j + 1) + "kolom " + (i + 1) + " :");
                    matriks1[i][j] = input.nextInt();
                }
            }
            System.out.println("Masukkan elemen matriks kedua: ");
            for (int i = 0; i < k; i++) {
                for (int j = 0; l < p; j++) {
                    System.out.println("baris " + (j + 1) + "kolom " + (i + 1) + " :");
                    matriks2[i][j] = input.nextInt();
                }
            }
            Perkalian(matriks1, matriks2,o, k, l);
            int[][] laa = Perkalian(matriks1, matriks2,o,k,l);
            tampil(laa);
        }
    }

    public static int[][] Perkalian(int z[][], int y[][],int a,int b,int c) {
        int q = a;
        int w = b;
        int e = c;
        int MatrikA[][] = z;
        int MatrikB[][] = y;
        int jumlah = 0;
        int hasil[][]= new int [10][10];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < e; k++) {
                    jumlah = jumlah + MatrikA[i][k] * MatrikB[k][j];
                }
                hasil[i][j] = jumlah;
                jumlah = 0;
            }
        }
        return hasil;
    }

    public static int[][] tampil(int x[][]) {
        int tampil[][] = x;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("(" + tampil[i][j] + "  " + ")");
            }
            System.out.println("");
        }
        return tampil;
    }
}
