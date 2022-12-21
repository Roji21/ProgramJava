package uts_struktur_data;
public class NewClass {
    public static class Box {
        int nrp;
        String nama,prodi;
        Box Box_Prev;
        Box Box_Next;
    }
    public static Box NodeAwal, NodeAkhir;
    public static void Tambah_Data(int dataisi,String name,String jurusan) {
        Box NodeBaru = new Box();
        NodeBaru.nrp = dataisi;
        NodeBaru.nama = name;
        NodeBaru.prodi = jurusan;
        if (NodeAwal == null) {
            NodeAkhir = NodeAwal = NodeBaru;
        } else {
            NodeAkhir.Box_Next = NodeBaru;
            NodeBaru.Box_Prev = NodeAkhir;
            NodeBaru.Box_Next = null;
            NodeAkhir = NodeBaru;
        }
    }
    public static void Tambah_Data_Urut(int dataisi,String name,String jurusan) {
        Box NodeBaru = new Box();
        NodeBaru.nrp = dataisi;
        NodeBaru.nama = name;
        NodeBaru.prodi = jurusan;
        if (NodeAwal == null) {
            NodeAkhir = NodeAwal = NodeBaru;
        } else {
            if (NodeAkhir.nrp <= dataisi) {
                NodeBaru.Box_Prev = NodeAkhir;
                NodeAkhir.Box_Next = NodeBaru;
                NodeAkhir = NodeBaru;
            } else if (NodeAwal.nrp > dataisi) {
                NodeAwal.Box_Prev = NodeBaru;
                NodeBaru.Box_Next = NodeAwal;
                NodeAwal = NodeBaru;
            } else {
                Box trav = NodeAwal;
                while (trav.nrp <= dataisi) {
                    trav = trav.Box_Next;
                    if (trav == null) {
                        break;
                    }
                }
                trav.Box_Prev.Box_Next = NodeBaru;
                NodeBaru.Box_Prev = trav.Box_Prev;
                NodeBaru.Box_Next = trav;
                trav.Box_Prev = NodeBaru;
            }
        }
    }
    public static void Cetak_Data() {
        Box trav = NodeAwal;
        if (trav == null) {
            System.out.println("DoubleLinkedList masih kosong");
        } else {
            System.out.println("Isi dari DoubleLinkedList:");
            while (trav != null) {
                System.out.println("NRP : "+trav.nrp+"  Nama : "+trav.nama+"  Prodi : "+trav.prodi);
                trav = trav.Box_Next;
            }
            System.out.println("======Batas=======");
        }
    }
    public static void Cari_Data(int data_cari) {
        Box trav = NodeAwal;
        boolean apakah_ketemu = false;
        while (trav != null) {
            if (data_cari == trav.nrp) {
                apakah_ketemu = true;
                break;
            } else {
                trav = trav.Box_Next;
            }
        }
        System.out.println("apakah data ketemu: " + apakah_ketemu);
    }
    public static void Hapus_Data(int datahapus) {
        if (datahapus == NodeAwal.nrp) {
            NodeAwal = NodeAwal.Box_Next;
            NodeAwal.Box_Prev = null;
        } else if (datahapus == NodeAkhir.nrp) {
            NodeAkhir = NodeAkhir.Box_Prev;
            NodeAkhir.Box_Next = null;
        } else {
            Box trav = NodeAwal;
            while (trav != null) {
                if (datahapus == trav.nrp) {
                    trav.Box_Next.Box_Prev = trav.Box_Prev;
                    trav.Box_Prev.Box_Next = trav.Box_Next;
                    break;
                } else {
                    trav = trav.Box_Next;
                }
            }
        }
    }
    public static void Hapus_Semua_Data() {
        NodeAwal = NodeAkhir = null;
    }
    public static void jumlahdata() {
        Box trav = NodeAwal;
        int jum = 0;
        if (trav == null) {
            System.out.println("DoubleLinkedList masih kosong");
        } else {
            System.out.println("Isi dari DoubleLinkedList:");
            while (trav != null) {
                jum =jum+1;
            }
            System.out.println("======Batas=======");
        }
    }
    public static void main(String[] args) {
        Tambah_Data(1111, "Hilman", "TI");
        Tambah_Data(1112, "Nuril", "SI");
        Tambah_Data(1113, "Hadi", "DKV");
        Tambah_Data(1114, "Rakhmad", "TI");
        Cetak_Data();
    }
}
