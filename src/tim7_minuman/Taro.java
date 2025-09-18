/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim7_minuman;

/**
 *
 * @author Sukma Nur
 */
public class Taro {
     String Nama, Harga, Jenis, Ukuran;
    
    public void setNama(String Namax){
        this.Nama = Namax;
    }
    public void setHarga(String Hargax){
        this.Harga = Hargax;
    }
    public void setJenis(String Jenisx){
        this.Jenis = Jenisx;
    }
    public void setUkuran(String Ukuranx){
        this.Ukuran = Ukuranx;
    }
    
    public String getNama(){
        return this.Nama;
    }
    public String getHarga(){
        return  this.Harga;
    }
    public String getJenis(){
        return this.Jenis;
    }
    public String getUkuran(){
        return this.Ukuran;
    }
}
