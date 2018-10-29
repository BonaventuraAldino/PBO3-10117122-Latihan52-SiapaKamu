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
public class Dosen extends Manusia{
    public String nip, mataKuliah;

    public String getNip() {
        return "41227829930";
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa (){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun "
                + "sedang mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu (){
        System.out.println("Saya Dosen");
    }
}
