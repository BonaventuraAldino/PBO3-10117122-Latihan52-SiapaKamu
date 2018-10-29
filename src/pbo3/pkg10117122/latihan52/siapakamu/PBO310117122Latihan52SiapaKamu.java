/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan52.siapakamu;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini dibuat untuk menampilkan biodata dari dosen
 *                     dan mahasiswa dengan ketentuannya masing-masing 
 *                     menggunakan pendekatan berbasis objek penerapan 
 *                     polimorphisme, dimana inputan tidak dari keyboard user. 
 */
public class PBO310117122Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        System.out.println("\n(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
