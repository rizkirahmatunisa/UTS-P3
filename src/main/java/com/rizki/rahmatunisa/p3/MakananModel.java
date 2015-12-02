package com.rizki.rahmatunisa.p3;

import java.util.*;
import javax.swing.table.*;

public class MakananModel extends AbstractTableModel {
    
    private List<Makanan> data;

    public MakananModel(List<Makanan> m){
        data = m;
    }

    public int getRowCount(){
        return data.size();
    }

    public int getColumnCount(){
        return 3;
    }

    public Object getValueAt(int row, int column){
        Makanan m = data.get(row);

        switch(column){
            case 0: return m.getpilihan_menu();
            case 1: return m.getnama_menu();
            case 2: return m.getharga();
            default: return null;
        }
    }

    public String getColumnName(int column){
        
        switch(column){
            case 0: return "Pilihan Menu";
            case 1: return "Nama";
            case 2: return "Harga";
            default: return null;
        }
    }
}