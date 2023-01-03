/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.mvc;

/**
 *
 * @author Dracko
 */
public class Model {
    private String nama;
    private String satuan;
    private String jumlah;
    private String total;

    public String isTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
  
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }  
    
public Model(String nama, String satuan, String jumlah, String total){
    this.nama = nama;
    this.satuan = satuan;
    this.jumlah = jumlah;
    this.total = total;
} 

}



