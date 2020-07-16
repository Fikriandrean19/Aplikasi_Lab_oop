/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.pasien;
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
public class executepasien {
    public List<pasien>getAllpasien(){
        String query = "select * from pasien";
        ConnectionManager conMan = new ConnectionManager();
        List<pasien>lspasien = new ArrayList<pasien>();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                pasien psn = new pasien();
                psn.setId_pasien(rs.getInt("id_pasien"));
                psn.setNama(rs.getString("nama"));
                psn.setAlamat(rs.getString("alamat"));
                psn.setUsia(rs.getInt("usia"));
                psn.setJeniskelamin(rs.getString("jeniskelamin"));
                lspasien.add(psn);
            }
        }catch(SQLException ex){
            Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lspasien;
    }
     public int insertData(pasien psn){
         int hasil = 0;
        String query ="Insert into pasien(id_pasien, nama, alamat, usia, jeniskelamin)"
                +" values('"+psn.getId_pasien()+"','"+psn.getNama()+"','"+psn.getAlamat()
                +"','"+psn.getUsia()+"','"+psn.getJeniskelamin()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
                try{
                    Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
                }catch (SQLException ex) {
            Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);    
                }
        conMan.logOff();
        return hasil;
     }
     public int hapusData(int id_pasien){
         String query = "Delete from pasien where id_pasien='"+ id_pasien+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
     }
     
      public int ubahData(pasien psn){
          int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update pasien set nama='"+psn.getNama()+"', alamat='"+psn.getAlamat()
                +"', usia="+psn.getUsia()+", jeniskelamin='"+psn.getJeniskelamin()+"' where id_pasien="+psn.getId_pasien()+"";
      try{
          Statement stm = conn.createStatement();
          hasil = stm.executeUpdate(query);
          System.out.println(query);
      } catch (SQLException ex) {
          Logger.getLogger(executepasien.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println(query);
      }
      
      return hasil;
      }
}

