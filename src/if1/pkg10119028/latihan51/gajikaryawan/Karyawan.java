/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan51.gajikaryawan;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan gaji karyawan
 */
public class Karyawan {
    protected String nik, nama, jabatan;
    protected int golongan;
    
    public String getNik(){
        return this.nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGolongan(){
        return this.golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
}