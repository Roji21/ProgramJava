package linked;

public class Single_LinkedList {

    public static class Linked_list_Node {

        int data;
        String mama;
        Linked_list_Node Pointer_Setelahnya;
    }

    public static Linked_list_Node NodeAwal, NodeAkhir;

    public static void Tambah_Data(int dataisi, String isinama) {
        Linked_list_Node NodeBaru = new Linked_list_Node();
        NodeBaru.data = dataisi;
        NodeBaru.mama = isinama;
        if (NodeAwal == null) {
            NodeAkhir = NodeAwal = NodeBaru;
        } else {
            NodeAkhir.Pointer_Setelahnya = NodeBaru;
            NodeBaru.Pointer_Setelahnya = null;
            NodeAkhir = NodeBaru;
        }
    }

    public static void Cetak_Data() {
        Linked_list_Node trav = NodeAwal;
        if (trav == null) {
            System.out.println("LinkedList masih kosong");
        } else {
            System.out.println("Isi dari LinkedList:");
            while (trav != null) {
                System.out.println(trav.data + " - " + trav.mama);
                trav = trav.Pointer_Setelahnya;
            }
            System.out.println("======Batas=======");
        }
    }

    public static void Hapus_Semua_Data() {
        NodeAwal = NodeAkhir = null;
    }

    public static void main(String[] args) {
        Tambah_Data(1, "Hilman N");
        Tambah_Data(2, "Teguh");
        Tambah_Data(3, "Abi");
        Tambah_Data(4, "Budi");
        Tambah_Data(5, "Jaka");
        Cetak_Data();

        Hapus_Semua_Data();
        Cetak_Data();
    }

}
