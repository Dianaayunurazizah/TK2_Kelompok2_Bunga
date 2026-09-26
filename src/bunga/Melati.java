/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bunga;

/**
 *
 * @author Acer
 */
public class Melati {

    String nama;
    String warna;
    String pertulanganDaun;
    String jenisBatang;
    String aroma;
    String asal;
    
     public Melati(){
        this.nama = "";
        this.warna = "";
        this.pertulanganDaun = "";
        this.jenisBatang = "";
        this.aroma = "";
        this.asal = "";
    }

    public Melati(String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal) {
        this.nama = nama;
        this.warna = warna;
        this.pertulanganDaun = pertulanganDaun;
        this.jenisBatang = jenisBatang;
        this.aroma = aroma;
        this.asal = asal;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setPertulanganDaun(String pertulanganDaun) {
        this.pertulanganDaun = pertulanganDaun;
    }
    
    public void setJenisBatang(String jenisBatang) {
        this.jenisBatang = jenisBatang;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public String getPertulanganDaun() {
        return pertulanganDaun;
    }
    
    public String getJenisBatang() {
        return jenisBatang;
    }

    public String getAroma() {
        return aroma;
    }

    public String getAsal() {
        return asal;
    }
}
