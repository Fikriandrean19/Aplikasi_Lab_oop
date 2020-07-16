/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.ruangan;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class executeruangan {
    public List<ruangan>getAllruangan(){
        String query = "select * from ruangan";
        ConnectionManager conMan = new ConnectionManager();
        List<ruangan>lsruangan = new ArrayList<ruangan>();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                ruangan rgn = new ruangan();
                rgn.setId_ruangan(rs.getInt("id_ruangan"));
                rgn.setJenis_ruangan(rs.getString("jenis_ruangan"));
                rgn.setHarga(rs.getInt("harga"));
                lsruangan.add(rgn);
            }
        }catch(SQLException ex){
            Logger.getLogger(executeruangan.class.getName()).log(Level.SEVERE, null, ex);
        } 
        conMan.logOff();
        return lsruangan;
    }
    public int insertData(ruangan rgn){
        int hasil = 0;
        String query ="Insert into ruangan(id_ruangan, jenis_ruangan, harga)"
                +" values("+rgn.getId_ruangan()+",'"+rgn.getJenis_ruangan()+"',"+rgn.getHarga()+")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        }catch (SQLException ex){
            Logger.getLogger(executeruangan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    public int hapusData(int id_ruangan){
        String query = "Delete from ruangan where id_ruangan="+ id_ruangan+"";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        }catch (SQLException ex){
            Logger.getLogger(executeruangan.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil; 
        }
    public int ubahData(ruangan rgn){
          int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update ruangan set jenis_ruangan='"+
                rgn.getJenis_ruangan()+"', harga="+rgn.getHarga()+" where id_ruangan="+rgn.getId_ruangan()+"";    
     try{
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
     }catch (SQLException ex){
         Logger.getLogger(executeruangan.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println(query);
     }
     return hasil;
    }
    }
