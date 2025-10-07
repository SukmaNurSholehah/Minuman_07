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
     SubClassRedVelvet sbr = new SubClassRedVelvet();
     sbr.setNama("Red Velvet");
     sbr.setJenis("Dingin");
     sbr.setUkuran("Medium");
     sbr.setHarga("15.000");
     
     sbr.tampilData();
   
    }

    }
