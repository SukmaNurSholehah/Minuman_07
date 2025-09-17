/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim7_minuman;

/**
 *
 * @author Sukma Nur
 */
public class Red_Velvet {
    String nama, harga, jenis, ukuran ;
    
    public void setnama(String namaMinuman){
        this.nama = namaMinuman;
    }
    public void setharga(String hargaMinuman){
        this.harga = hargaMinuman;
    }
    public void setjenis(String jenisMinuman){
        this.jenis = jenisMinuman;
    }
    public void setukuran(String ukuranMinuman){
        this.ukuran = ukuranMinuman;
    }
    public String  getnama(){
        return this.nama;
    }
    public String  getharga(){
        return this.harga;
    }
    public String  getjenis(){
        return this.jenis;
    }
    public String  getukuran(){
        return this.ukuran;
    }
    
}
