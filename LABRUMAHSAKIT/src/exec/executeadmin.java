/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.admin;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.util.Password;

/**
 *
 * @author Mesin Tempur
 */
public class executeadmin {
    public List<admin> getAlladmin(){
        String query = "select * from admin";
        ConnectionManager conMan = new ConnectionManager();
        List<admin> lsadmin = new ArrayList<admin>();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                admin lgn = new admin();
                lgn.setUsername(rs.getString("username"));
                lgn.setPassword(rs.getString("password"));
                lsadmin.add(lgn);
            }
        } catch (SQLException ex){
            Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null,ex);
        }
        conMan.logOff();
        return lsadmin; 
    }
    
    public List<admin> getadmin(String uname, String pwd){
        String query = "select * from admin where Username='"+uname+"'AND Password='"+pwd+"'";
        ConnectionManager conMan = new ConnectionManager();
        List<admin> lsadmin = new ArrayList<admin>();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                admin lgn = new admin();
                lgn.setUsername(rs.getString("Username"));
                lgn.setPassword(rs.getString("Password"));
                lsadmin.add(lgn);
            }
        } catch (SQLException ex){
            Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null,ex);
        }
        conMan.logOff();
        return lsadmin; 
    }
    
    public int loginData(String uname, String pwd){
       String query = "select * from admin where Username = '"+uname+"' and Password = '"+pwd+"'";
       int hasil = 0;
       ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            ResultSet as = conn.createStatement().executeQuery(query);
            if(as.next()){
                if(uname.equals(as.getString("Username"))&& pwd.equals(as.getString("Password"))){
                    hasil = hasil + 1 ;
                }
            }else{
                hasil = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    
}
