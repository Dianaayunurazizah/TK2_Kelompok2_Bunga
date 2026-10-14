/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ThinkPad
 */
public class Matahari extends Bunga {

    private String fungsiBiji;

    public Matahari() {
        fungsiBiji = "";
    }

    public Matahari(String fungsiBiji) {
        this.fungsiBiji = fungsiBiji;
    }

    public void setFungsiBiji(String fungsiBiji) {
        this.fungsiBiji = fungsiBiji;
    }

    public String getFungsiBiji() {
        return fungsiBiji;
    }

}
