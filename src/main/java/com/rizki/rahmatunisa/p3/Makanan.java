/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.rizki.rahmatunisa.p3;

/**
 *
 * @author riki
 */
public class Makanan {
    String id_menu;
    String pilihan_menu;
    String nama_menu;
    String harga;

    public String getid_menu(){
        return id_menu;
    }
    
    public String getpilihan_menu(){
        return pilihan_menu;
    }
    
    public String getnama_menu(){
        return nama_menu;
    }
    
    public String getharga(){
        return harga;
    }
    
    public void setid_menu(String id_menu){
        this.id_menu = id_menu;
    }
    public void setpilihan_menu(String pilihan_menu){
        this.pilihan_menu = pilihan_menu;
    }
    public void setnama_menu(String nama_menu){
        this.nama_menu = nama_menu;
    }
    public void setharga(String harga){
        this.harga = harga;
    }

}
