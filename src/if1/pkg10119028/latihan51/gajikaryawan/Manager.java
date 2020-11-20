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
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran(){
        return this.kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        String kapital = jabatan.toUpperCase();
        if (kapital.equals("MANAGER")) {
            tunjanganJabatan = 2000000;
        } else if (kapital.equals("KABAG")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        tunjanganGolongan = switch (golongan) {
            case 1 -> 500000;
            case 2 -> 1000000;
            case 3 -> 1500000;
            default -> 0;
        };
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
}    