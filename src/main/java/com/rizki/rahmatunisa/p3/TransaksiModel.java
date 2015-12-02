package com.rizki.rahmatunisa.p3;

import java.util.*;
import javax.swing.table.*;

public class TransaksiModel extends AbstractTableModel {
    
    private List<Transaksi> data;

    public TransaksiModel(List<Transaksi> t){
        data = t;
    }

    public int getRowCount(){
        return data.size();
    }

    public int getColumnCount(){
        return 4;
    }

    public Object getValueAt(int row, int column){
        Transaksi t = data.get(row);

        switch(column){
            case 0: return t.getNo_transaksi();
            case 1: return t.getId_menu();
            case 2: return t.getJumlah_pesanan();
            case 3: return t.getTotal_harga();
            default: return null;
        }
    }

    public String getColumnName(int column){
        
        switch(column){
            case 0: return "No Transaksi";
            case 1: return "ID Menu";
            case 2: return "Jumlah Pesanan";
            case 3: return "Total Harga";
            default: return null;
        }
    }
}