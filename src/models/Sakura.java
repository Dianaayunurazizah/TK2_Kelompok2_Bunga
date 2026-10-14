/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class Sakura extends Bunga {

    private String tradisiMekar;

    public Sakura() {
        tradisiMekar = "";
    }

    public Sakura(String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal, String tradisiMekar) {
        super(nama, warna, pertulanganDaun, jenisBatang, aroma, asal);
        this.tradisiMekar = tradisiMekar;
    }

    public Sakura(String tradisiMekar) {
        super();
        this.tradisiMekar = tradisiMekar;
    }

    public void setTradisiMekar(String tradisiMekar) {
        this.tradisiMekar = tradisiMekar;
    }

    public String getTradisiMekar() {
        return tradisiMekar;
    }

}
