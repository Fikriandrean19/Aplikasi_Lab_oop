/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executeperawat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ConvertperawatToObject {
    public String [][]getperawat(){
        List<perawat> myprw = new ArrayList<perawat>();
        executeperawat eprw = new executeperawat();
        myprw = eprw.getAllperawat();
        String[][]dataperawat = new String[myprw.size()][5];
        int i=0;
        for(perawat prw : myprw){
            dataperawat[i][0] = ""+prw.getId_perawat();
            dataperawat[i][1] = prw.getNama();
            dataperawat[i][2] = prw.getAlamat();
            dataperawat[i][3] = prw.getJeniskelamin();
            dataperawat[i][4] = prw.getJabatan();
            i++;
        }
        return dataperawat;
    
    }
    
}
