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
public class pasien {
    private int id_pasien;
    private String nama;
    private String alamat;
    private int usia;
    private String jeniskelamin;

    public pasien() {
    }

    public pasien(String nama, String alamat, int usia, String jeniskelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.jeniskelamin = jeniskelamin;
    }

    public pasien(int id_pasien, String nama, String alamat, int usia, String jeniskelamin) {
        this.id_pasien = id_pasien;
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.jeniskelamin = jeniskelamin;
    }

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
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

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    @Override
    public String toString() {
        return "pasien{" + "id_pasien=" + id_pasien + ", nama=" + nama + ", alamat=" + alamat + ", usia=" + usia + ", jeniskelamin=" + jeniskelamin + '}';
    }

    
}
