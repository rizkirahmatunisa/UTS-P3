/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizki.rahmatunisa.p3;

/**
 *
 * @author Rizki Rahmatunisa
 */
public class Transaksi {
    Integer no_transaksi;
    String id_menu;
    String jumlah_pesanan;
    Integer total_harga;

    public Integer getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(Integer no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getId_menu() {
        return id_menu;
    }

    public void setId_menu(String id_menu) {
        this.id_menu = id_menu;
    }

    public String getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setJumlah_pesanan(String jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }

    public Integer getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Integer total_harga) {
        this.total_harga = total_harga;
    }
}
