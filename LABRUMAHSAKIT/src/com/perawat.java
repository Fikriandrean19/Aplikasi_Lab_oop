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
public class perawat {
    private int id_perawat;
    private String nama;
    private String alamat;
    private String jeniskelamin;
    private String jabatan;

    public perawat() {
    }

    public perawat(int id_perawat, String nama, String alamat, String jeniskelamin, String jabatan) {
        this.id_perawat = id_perawat;
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelamin = jeniskelamin;
        this.jabatan = jabatan;
    }

    public int getId_perawat() {
        return id_perawat;
    }

    public void setId_perawat(int id_perawat) {
        this.id_perawat = id_perawat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return "perawat{" + "id_perawat=" + id_perawat + ", nama=" + nama + ", alamat=" + alamat + ", jeniskelamin=" + jeniskelamin + ", jabatan=" + jabatan + '}';
    }
    
}
