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

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void getNama(String nama) {
        this.nama = nama;
    }

    public void getWarna(String warna) {
        this.warna = warna;
    }

    public void getPertulanganDaun(String pertulanganDaun) {
        this.pertulanganDaun = pertulanganDaun;
    }

    public void getAroma(String aroma) {
        this.aroma = aroma;
    }

    public void getAsal(String asal) {
        this.asal = asal;
    }
}
