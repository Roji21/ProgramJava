package strukturdata;
public class Strukturdata {
    public static class box
    {
        int data;
        String nama,jk,email,alamat;
        box Pointer_Setelahnya;
    }
    public static box boxAwal, boxAkhir;
    public static void Tambah_Data(int dataisi, String isinama,String gender,String email1,String add)
    {
        box boxBaru = new box();
        boxBaru.data = dataisi;
        boxBaru.nama = isinama;
        boxBaru.jk = gender;
        boxBaru.email = email1;
        boxBaru.alamat = add;
        if(boxAwal == null) {
            boxAkhir = boxAwal = boxBaru;
        } else{
            boxAkhir.Pointer_Setelahnya = boxBaru;
            boxBaru.Pointer_Setelahnya = null;
            boxAkhir=boxBaru;
        }   
    }
    public static void Cetak_Data()
    {
        box trav = boxAwal;
        if(trav == null) {
            System.out.println("LinkedList masih kosong");
        } else {
            System.out.println("Isi dari LinkedList:");
            while(trav != null)
            {
                System.out.println(trav.data +" - "+trav.nama +" jenis kelamin - "+trav.jk+" email - "+trav.email+" alamat - "+trav.alamat);
                trav = trav.Pointer_Setelahnya;
            }
            System.out.println("======Batas=======");
        }
    }
    public static void jumlahdata(){
        box trav = boxAkhir;
        if(trav == null) {
            System.out.println("LinkedList masih kosong");
        } else {
            System.out.println("Isi dari LinkedList:");
            while(trav != null)
            {
                System.out.println("Bayak data yang tersimpan - "+trav.data );
                trav = trav.Pointer_Setelahnya;
            }
            System.out.println("======Batas=======");
        }
    }
    public static void Hapus_Semua_Data() {
        boxAwal = boxAkhir = null;
    }
    
    
    public static void main(String[] args) {
        Tambah_Data(1, "Roji", "Laki", "211111038@mhs.stiki.ac.id", "Batu");
        Tambah_Data(2, "Roji", "Laki", "211111038@mhs.stiki.ac.id", "Batu");
        Cetak_Data();
        jumlahdata();
    }
    
}
