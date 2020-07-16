/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Mesin Tempur
 */
public class admin {
    private Integer id_admin;
    private String Username;
    private String Password;

    public admin() {
    }

    public admin(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public admin(Integer id_admin, String Username, String Password) {
        this.id_admin = id_admin;
        this.Username = Username;
        this.Password = Password;
    }

    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "admin{" + "id_admin=" + id_admin + ", Username=" + Username + ", Password=" + Password + '}';
    }
    
    
    
}
