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
        
        Chocolate C = new Chocolate();
        C.setnama("Chocolate Hazelnut");
        System.out.println("Nama : " + C.getnama());
        C.setharga("18.000");
        System.out.println("Harga : Rp. " + C.getharga());
        C.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + C.getjenis());
        C.setukuran("Medium");
        System.out.println("Ukuran : " + C.getukuran());
        System.out.println("===================================");
        
        
        C.setnama("Red Velvet");
        System.out.println("Nama : " + C.getnama());
        C.setharga("18.000");
        System.out.println("Harga : Rp. " + C.getharga());
        C.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + C.getjenis());
        C.setukuran("Medium");
        System.out.println("Ukuran : " + C.getukuran());
        System.out.println("==================================="); 
        
        Vanilla_Latte V = new Vanilla_Latte();
        V.setnama("Vanilla Latte");
        System.out.println("Nama : " + V.getnama());
        V.setharga("17.000");
        System.out.println("Harga : Rp. " + V.getharga());
        V.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + V.getjenis());
        V.setukuran("Medium");
        System.out.println("Ukuran : " + V.getukuran());
        System.out.println("===================================");
        
       
        C.setnama("Milk Tea");
        System.out.println("Nama : " + C.getnama());
        C.setharga("15.000");
        System.out.println("Harga : Rp. " + C.getharga());
        C.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + C.getjenis());
        C.setukuran("Medium");
        System.out.println("Ukuran : " + C.getukuran());
        System.out.println("===================================");
        
        
        C.setnama("Mocha");
        System.out.println("Nama : " + C.getnama());
        C.setharga("20.000");
        System.out.println("Harga : Rp. " + C.getharga());
        C.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + C.getjenis());
        C.setukuran("Medium");
        System.out.println("Ukuran : " + C.getukuran());
        System.out.println("===================================");
        
        
        C.setnama("Taro");
        System.out.println("Nama : " + C.getnama());
        C.setharga("16.000");
        System.out.println("Harga : Rp. " + C.getharga());
        C.setjenis("Dingin / Panas");
        System.out.println("Jenis : " + C.getjenis());
        C.setukuran("Medium");
        System.out.println("Ukuran : " + C.getukuran());
        System.out.println("===================================");
        
    }
    
}
