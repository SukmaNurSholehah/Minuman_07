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
    System.out.println("           DAFTAR MINUMAN          ");
    System.out.println("===================================");
    SubClassChocolate sbc = new SubClassChocolate();
     sbc.setNama("Chocolate");
     sbc.setJenis("Dingin");
     sbc.setUkuran("Medium");
     sbc.setHarga("18.000");
     
     sbc.tampilData(); 
     
    System.out.println("===================================");
     SubClassMocha mocha = new SubClassMocha();
     mocha.setNama("Mocha");
     mocha.setJenis("Dingin");
     mocha.setUkuran("Medium");
     mocha.setHarga("20.000");
     
     mocha.tampilData();
     
    System.out.println("===================================");
     SubClassRedVelvet sbr = new SubClassRedVelvet();
     sbr.setNama("Red Velvet");
     sbr.setJenis("Dingin");
     sbr.setUkuran("Medium");
     sbr.setHarga("15.000");
     
     sbr.tampilData();
     
    System.out.println("===================================");
     SubClassTaro sbt = new SubClassTaro();
     sbt.setNama("Taro");
     sbt.setJenis("Dingin");
     sbt.setUkuran("Medium");
     sbt.setHarga("16.000");
     
     sbt.tampilData();
     
    System.out.println("====================================");
     subclasslatte latte = new subclasslatte();
     latte.setNama("vanillalatte");
     latte.setJenis("ice");
     latte.setUkuran("medium");
     latte.setHarga("17.000");
        
     latte.tampilData();
        
    System.out.println("=================================");
     subclasstea ss = new subclasstea();
     ss.setNama("mlik tea");
     ss.setJenis("dingin/panas");
     ss.setUkuran("medium");
     ss.setHarga("15.000");
        
     ss.tampilData();
         
     }

    }


