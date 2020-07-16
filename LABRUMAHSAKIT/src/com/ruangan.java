/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author hp
 */
public class ruangan {
    private int id_ruangan;
    private String jenis_ruangan;
    private int harga;

    public ruangan() {
    }

    public ruangan(String jenis_ruangan, int harga) {
        this.jenis_ruangan = jenis_ruangan;
        this.harga = harga;
    }

    public ruangan(int id_ruangan, String jenis_ruangan, int harga) {
        this.id_ruangan = id_ruangan;
        this.jenis_ruangan = jenis_ruangan;
        this.harga = harga;
    }

    public int getId_ruangan() {
        return id_ruangan;
    }

    public void setId_ruangan(int id_ruangan) {
        this.id_ruangan = id_ruangan;
    }

    public String getJenis_ruangan() {
        return jenis_ruangan;
    }

    public void setJenis_ruangan(String jenis_ruangan) {
        this.jenis_ruangan = jenis_ruangan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "ruangan{" + "id_ruangan=" + id_ruangan + ", jenis_ruangan=" + jenis_ruangan + ", harga=" + harga + '}';
    }

       
}
