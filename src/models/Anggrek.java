/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Anggrek extends Bunga{
    String pohonInang;
    
    public Anggrek(){
        pohonInang= "";
    }

    public Anggrek(String pohonInanng) {
        this.pohonInang = pohonInanng;
    }

    public String getPohonInang() {
        return pohonInang;
    }

    public void setPohonInang(String pohonInang) {
        this.pohonInang = pohonInang;
    }
    
    

}
