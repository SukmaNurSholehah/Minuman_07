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
        Red_Velvet RVT = new Red_Velvet();
        RVT.setnama("RED VELVET");
        RVT.setharga("18.000");
        RVT.setjenis("DINGIN");
        RVT.setukuran("MEDIUM");
        System.out.println("Nama  : " +RVT.getnama());
        System.out.println("Harga : Rp." +RVT.getharga());
        System.out.println("Jenis : " +RVT.getjenis());
        System.out.println("Ukuran: " +RVT.getukuran());
    }
    
}
