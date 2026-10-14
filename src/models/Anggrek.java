/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Anggrek extends Bunga {

    private String pohonInang;

    public Anggrek() {
        pohonInang = "";
    }

    public Anggrek(String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal, String pohonInang) {
        super(nama, warna, pertulanganDaun, jenisBatang, aroma, asal);
        this.pohonInang = pohonInang;
    }

    public Anggrek(String pohonInang) {
        super();
        this.pohonInang = pohonInang;
    }

    public void setPohonInang(String pohonInang) {
        this.pohonInang = pohonInang;
    }

    public String getPohonInang() {
        return pohonInang;
    }

}
