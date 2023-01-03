/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.mvc;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dracko
 */
public class Controller {
    ArrayList<Model> ArrayData;
    DefaultTableModel tabelModel;
    
    public Controller(){
    ArrayData = new ArrayList<Model>();
    }
    
    public void InsertData (String nama, String satuan, String jumlah, String total){
    Model brg = new Model(nama,satuan,jumlah,total);
    ArrayData.add(brg);
    }
    
    public DefaultTableModel showData(){
    String[] kolom = {"NAMA", "SATUAN", "JUMLAH", "TOTAL HARGA"};
    Object [][] objData = new Object [ArrayData.size()][4];
    int i = 0;
    
    for(Model n : ArrayData){
    String[] arrData = {n.getNama(), n.getSatuan(),n.getJumlah(), (n.isTotal())};
    objData[i] = arrData;
     i++;
    }
    
    tabelModel = new DefaultTableModel(objData,kolom){
   
    };
    return tabelModel;
    }


}
