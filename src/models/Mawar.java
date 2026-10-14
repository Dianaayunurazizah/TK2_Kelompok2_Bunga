/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Eka Melawan ERROR
 */
public class Mawar extends Bunga{
    
    private String jumlahDuri;
    
    public Mawar(){
        jumlahDuri = "";
    }

    public Mawar(String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal, String jumlahDuri) {
        super(nama, warna, pertulanganDaun, jenisBatang, aroma, asal);
        this.jumlahDuri = jumlahDuri;
    }
    
    public Mawar(String jumlahDuri) {
        super();
        this.jumlahDuri = jumlahDuri;
    }

    public String getJumlahDuri() {
        return jumlahDuri;
    }

    public void setJumlahDuri(String jumlahDuri) {
        this.jumlahDuri = jumlahDuri;
    }
    
}
