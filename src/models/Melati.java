/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Acer
 */
public class Melati extends Bunga {

    private String lamaWangi;

    public Melati() {
        lamaWangi = "";
    }

    public Melati(String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal, String lamaWangi) {
        super(nama, warna, pertulanganDaun, jenisBatang, aroma, asal);
        this.lamaWangi = lamaWangi;
    }

    public Melati(String lamaWangi) {
        super();
        this.lamaWangi = lamaWangi;
    }

    public void setLamaWangi(String lamaWangi) {
        this.lamaWangi = lamaWangi;
    }

    public String getLamaWangi() {
        return lamaWangi;
    }

}
