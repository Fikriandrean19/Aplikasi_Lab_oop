/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.perawat;
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
public class executeperawat {
    public List<perawat>getAllperawat(){
        String query = "select * from perawat";
        ConnectionManager conMan = new ConnectionManager();
        List<perawat>lsperawat = new ArrayList<perawat>();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                perawat prw = new perawat();
                prw.setId_perawat(rs.getInt("id_perawat"));
                prw.setNama(rs.getString("nama"));
                prw.setAlamat(rs.getString("alamat"));
                prw.setJeniskelamin(rs.getString("jeniskelamin"));
                prw.setJabatan(rs.getString("jabatan"));
                lsperawat.add(prw);
            }
        }catch (SQLException ex) {
            Logger.getLogger(executeperawat.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsperawat;
    }
    public int insertData(perawat prw){
        int hasil = 0;
        String query ="Insert into perawat(id_perawat, nama, alamat, jeniskelamin, jabatan)"
                +" values('"+prw.getId_perawat()+"','"+prw.getNama()+"','"+prw.getAlamat()
                +"','"+prw.getJeniskelamin()+"','"+prw.getJabatan()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        }catch (SQLException ex){
            Logger.getLogger(executeperawat.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    public int hapusData(int id_perawat){
        String query = "Delete from perawat where id_perawat='"+ id_perawat+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        }catch (SQLException ex){
            Logger.getLogger(executeperawat.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    public int ubahData(perawat prw){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update perawat set nama='"+prw.getNama()+"', alamat='"+prw.getAlamat()
                +"', jeniskelamin='"+prw.getJeniskelamin()+"', jabatan='"+prw.getJabatan()+"' where id_perawat="+prw.getId_perawat()+"";
        try{
          Statement stm = conn.createStatement();
          hasil = stm.executeUpdate(query);
          System.out.println(query);
        }catch (SQLException ex) {
            Logger.getLogger(executeperawat.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
    return hasil;
    }
}
