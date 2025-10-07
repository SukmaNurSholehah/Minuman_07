/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tim7_minuman;

/**
 *
 * @author Sukma Nur
 */
public class Tim7_Minuman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
     System.out.println("===================================");
     SubClassTaro sbt = new SubClassTaro();
     sbt.setNama("Taro");
     sbt.setJenis("Dingin");
     sbt.setUkuran("Medium");
     sbt.setHarga("16.000");
     
     sbt.tampilData();
     
    }

    }
