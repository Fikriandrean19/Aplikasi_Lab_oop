/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executepasien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ConvertpasienToObject {
     public String [][]getpasien(){
        List<pasien> mypsn = new ArrayList<pasien>();
        executepasien epsn = new executepasien();
        mypsn = epsn.getAllpasien();
        String[][]datapasien = new String[mypsn.size()][5];
        int i=0;
        for(pasien psn : mypsn){
            datapasien[i][0] = ""+psn.getId_pasien();
            datapasien[i][1] = psn.getNama();
            datapasien[i][2] = psn.getAlamat();
            datapasien[i][3] = ""+psn.getUsia();
            datapasien[i][4] = psn.getJeniskelamin();
            i++;
        }
        return datapasien;
    
    }
}
