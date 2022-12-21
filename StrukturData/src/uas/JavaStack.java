package uas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaStack {

    private static int[] id = new int[5];
    private static String[] nopol = new String[5];
    private static Date[] jam = new Date[5];
    private static int counters = 0;

    private static void createStack(int a, String b,String c) {
        int alpha = a;
        String beta = b;
        id[counters] = alpha;
        nopol[counters] = beta;
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy H:m:s");
        String input = c;
        try {
            jam[counters] = ft.parse(input);
        } catch (ParseException e) {
            System.out.println("Tidak dapat diparsing menggunakan " + ft);
        }
        counters++;
    }

    private static void selection_sort() {
        int i, j, pos;
        for (i = 0; i < counters - 1; i++) {
            pos = i;

            for (j = i + 1; j < counters; j++) {
                if (id[j] < id[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                tukar(pos, i);
            }
        }
    }

    private static void tukar(int a, int b) {
        int temp = id[a];
        id[a] = id[b];
        id[b] = temp;
        String temp1 = nopol[a];
        nopol[a] = nopol[b];
        nopol[b] = temp1;
        Date temp2 = jam[a];
        jam[a] = jam[b];
        jam[b] = temp2;
    }

    private static void removeStack() {
        counters--;
        System.out.println("Kendaraan masuk terakhir, sudah keluar");
        cetak();
    }

    private static void cetak() {
        System.out.println("Data Dalam Parkiran");
        for (int j = 0; j < counters; j++) {
            System.out.println(id[j] + " => " + nopol[j]+"Akan Keluar pada => "+jam[j]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        createStack(3, "N 9089 IU","20-7-2022 06:00:00");
        createStack(2, "D 1112 JK","20-7-2022 07:30:00");
        createStack(5, "D 3312 TF","20-7-2022 04:00:00");
        createStack(4, "B 9900 EA","20-7-2022 04:30:00");
        createStack(1, "L 9912 PO","20-7-2022 09:00:00");
        System.out.println("Data Dalam Parkiran sebelum penjaga mengurutkan jam keluar");
        cetak();
        selection_sort();
        System.out.println("Data Dalam Parkiran sesudah penjaga mengurutkan jam keluar");
        cetak();
        removeStack();
    }
}
