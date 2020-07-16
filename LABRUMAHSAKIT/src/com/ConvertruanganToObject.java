/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executeruangan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ConvertruanganToObject {
    public String [][]getruangan(){
        List<ruangan> myrgn = new ArrayList<ruangan>();
        executeruangan ergn = new executeruangan();
        myrgn = ergn.getAllruangan();
        String[][]dataruangan = new String[myrgn.size()][3];
        int i=0;
        for(ruangan rgn : myrgn){
            dataruangan[i][0] = ""+rgn.getId_ruangan();
            dataruangan[i][1] = rgn.getJenis_ruangan();
            dataruangan[i][2] = ""+rgn.getHarga();
            i++;
        }
        return dataruangan;
    
    }
    
}
