/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ASUS
 */
public class Kamboja extends Bunga{
    
    private String ciriGetah;
    
    public Kamboja(){
        ciriGetah = "";
    }

    public Kamboja(String ciriGetah, String nama, String warna, String pertulanganDaun, String jenisBatang, String aroma, String asal) {
        super(nama, warna, pertulanganDaun, jenisBatang, aroma, asal);
        this.ciriGetah = ciriGetah;
    }

    public Kamboja(String ciriGetah) {
        super();
        this.ciriGetah = ciriGetah;
    }
    
    public void setCiriGetah(String ciriGetah) {
        this.ciriGetah = ciriGetah;
    }

    public String getCiriGetah() {
        return ciriGetah;
    }

}
