/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bunga;

/**
 *
 * @author Acer
 */
public class Bunga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kamboja bunga1 = new Kamboja("Lily", "Putih", "Sejajar", "Batang Semu", "Lembut nyaris tidak beraroma", "Afrika Selatan");
        
        bunga1.setNama("Kamboja");
        bunga1.setWarna("Putih dan Kuning");
        bunga1.setPertulanganDaun("Menyirip");
        bunga1.setJenisBatang("Batang Lunak");
        bunga1.setAroma("Wangi");
        bunga1.setAsal("Amerika Tengah, Meksiko, Venezuela, dan Kepulauan Karibia");
        
        System.out.println("Nama\t\t\t:" + bunga1.getNama());
        System.out.println("Warna\t\t\t:" + bunga1.getWarna());
        System.out.println("Pertulangan Daun\t:" + bunga1.getPertulanganDaun());
        System.out.println("Jenis Batang\t\t:" + bunga1.getJenisBatang());
        System.out.println("Aroma\t\t\t:" + bunga1.getAroma());
        System.out.println("Asal\t\t\t:" + bunga1.getAsal());
        
        System.out.println("");
        
        Melati bunga2 = new Melati("Lily", "Putih", "Sejajar", "Batang Semu", "Lembut nyaris tidak beraroma", "Afrika Selatan");
        
        bunga2.setNama("Melati");
        bunga2.setWarna("Putih");
        bunga2.setPertulanganDaun("Menyirip");
        bunga2.setJenisBatang("Batang Berkayu");
        bunga2.setAroma("Wangi");
        bunga2.setAsal("Asia Selatan, Asia Tenggara, dan Indonesia");
        
        System.out.println("Nama\t\t\t:" + bunga2.getNama());
        System.out.println("Warna\t\t\t:" + bunga2.getWarna());
        System.out.println("Pertulangan Daun\t:" + bunga2.getPertulanganDaun());
        System.out.println("Jenis Batang\t\t:" + bunga2.getJenisBatang());
        System.out.println("Aroma\t\t\t:" + bunga2.getAroma());
        System.out.println("Asal\t\t\t:" + bunga2.getAsal());
        
        System.out.println("");
        
    }
    
}
