package uas;

public class coba2 {

    private static int[] stack = new int[5];
    private static String[] obj = new String[5];
    private static int counters = 0;

    private static void createStack(int a, String b) {
        int alpha = a;
        String beta = b;
        stack[counters] = alpha;
        obj[counters] = beta;
        counters++;
    }

    private static void selection_sort() {
        int i, j, pos;
        for (i = 0; i < counters - 1; i++) {
            pos = i;

            for (j = i + 1; j < counters; j++) {
                if (stack[j] < stack[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                tukar(pos, i);
            }
        }
    }

    private static void tukar(int a, int b) {
        int temp = stack[a];
        stack[a] = stack[b];
        stack[b] = temp;
        String temp1 = obj[a];
        obj[a] = obj[b];
        obj[b] = temp1;
    }

    private static void removeStack() {
        counters--;
        System.out.println("Data terakhir sudah dikeluarkan");
    }

    private static void cetak() {
        for (int j = 0; j < counters; j++) {
            System.out.println(stack[j] + " => " + obj[j]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        createStack(3, "A");
        createStack(2, "B");
        createStack(5, "C");
        createStack(4, "D");
        createStack(1, "E");
        System.out.println("Data Awal");
        cetak();
        selection_sort();
        System.out.println("Data setelah di sortir");
        cetak();
        removeStack();
        cetak();
    }
}
