/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per3;

/**
 *
 * @author Ky Nur
 */
public class a {
     public static class Box
    {
        int data,nrp;
        String nama,email;
        Box Box_Prev;
        Box Box_Next;
    }

    public static Box NodeAwal, NodeAkhir;
    
    public static void Tambah_Data(int dataisi)
    {
        Box NodeBaru = new Box();
        NodeBaru.data = dataisi;
        if(NodeAwal == null) {
            NodeAkhir = NodeAwal = NodeBaru;
        } else{
            NodeAkhir.Box_Next = NodeBaru;
            NodeBaru.Box_Prev = NodeAkhir;
            NodeBaru.Box_Next = null;
            NodeAkhir=NodeBaru;
        }   
    }
    
    public static void Tambah_Data_Urut(int dataisi,String name,int NRP,String mail)
    {
        Box NodeBaru = new Box();
        NodeBaru.data = dataisi;
        NodeBaru.nama = name;
        NodeBaru.nrp = NRP;
        NodeBaru.email = mail;
        if(NodeAwal == null) {
            NodeAkhir = NodeAwal = NodeBaru;
        } else{
            if(NodeAkhir.data <= dataisi){
                NodeBaru.Box_Prev = NodeAkhir;
                NodeAkhir.Box_Next = NodeBaru;
                NodeAkhir = NodeBaru;
            } else if (NodeAwal.data > dataisi){
                NodeAwal.Box_Prev = NodeBaru;
                NodeBaru.Box_Next = NodeAwal;
                NodeAwal = NodeBaru;
            } else{
                Box trav = NodeAwal;
                while(trav.data <= dataisi){
                    trav = trav.Box_Next;
                    if(trav == null) break;
                }
                trav.Box_Prev.Box_Next = NodeBaru;
                NodeBaru.Box_Prev = trav.Box_Prev;
                NodeBaru.Box_Next = trav;
                trav.Box_Prev = NodeBaru;
            }
        }       
    }
    
    public static void Cetak_Data()
    {
        Box trav = NodeAwal;
        if(trav == null) {
            System.out.println("DoubleLinkedList masih kosong");
        } else {
            System.out.println("Isi dari DoubleLinkedList:");
            while(trav != null)
            {
                System.out.println(trav.data+" Nama - "+trav.nama+" NRP - "+trav.nrp+" Email - "+trav.email);
                trav = trav.Box_Next;
            }
            System.out.println("======Batas=======");
        }
    }
    public static void jumdata()
    {
        Box trav = NodeAwal;
        int counter = 0;
        if(trav == null) {
            System.out.println("DoubleLinkedList masih kosong");
        } else {
//            System.out.println("Isi dari DoubleLinkedList:");
            while(trav != null)
            {
//                System.out.println(trav.data+" Nama - "+trav.nama+" NRP - "+trav.nrp+" Email - "+trav.email);
//                trav = trav.Box_Next;
                counter = counter+1;
            }
//            System.out.println("======Batas=======");
        }
        System.out.println("jum"+counter);
    }
    public static void Cari_Data(int data_cari)
    {
        Box trav = NodeAwal;
        boolean apakah_ketemu =false;
        while(trav != null)
        {
            if(data_cari==trav.data){
                apakah_ketemu=true;
                break;
            }else{
                trav = trav.Box_Next;
            }            
        }
        System.out.println("apakah data ketemu: "+apakah_ketemu);
    }
    
    public static void Hapus_Data(int datahapus)
    {
        if(datahapus == NodeAwal.data){
            NodeAwal = NodeAwal.Box_Next;
            NodeAwal.Box_Prev = null;
        }else if (datahapus == NodeAkhir.data) {
            NodeAkhir = NodeAkhir.Box_Prev;
            NodeAkhir.Box_Next = null;
        }else{
            Box trav = NodeAwal;
            while(trav != null){
                if(datahapus==trav.data){
                    trav.Box_Next.Box_Prev = trav.Box_Prev;
                    trav.Box_Prev.Box_Next = trav.Box_Next;
                    break;
                }else{
                    trav = trav.Box_Next;
                }            
            }
        }
    }

    public static void Hapus_Semua_Data() {
        NodeAwal = NodeAkhir = null;
    }

    public static void main(String[] args) {
        Tambah_Data_Urut(56,"Fahrur",2,"2");
//        Tambah_Data_Urut(70);
        Tambah_Data_Urut(32,"Mukhamad",1,"1");
//        Tambah_Data_Urut(52);
        Tambah_Data_Urut(57,"Rozi",3,"3");
        Cetak_Data();
        jumdata();
        //Cari_Data(33);
        //Hapus_Data(56);
//        Hapus_Data(56);
//        Cetak_Data();
    }

}
