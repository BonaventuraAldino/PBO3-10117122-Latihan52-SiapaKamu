/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan52.siapakamu;

/**
 *
 * @author Aldy Senda
 */
public class Mahasiswa {
    private String nama,nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return "10110269";
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang "
                + "belajar di kelas PBO2");
    }
    public void siapaKamu (){
        System.out.println("Saya Mahasiswa");
    }
}
