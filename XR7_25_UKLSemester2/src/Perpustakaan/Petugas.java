/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Petugas implements GetInfo{
    private ArrayList<String> karyawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas(){
        this.karyawan.add("Sultan");
        this.alamat.add("Blitar");
        this.telepon.add("081209384756");
    }

    public int getJmlKaryawan(){
        return this.karyawan.size();
    }

    @Override
    public void setNama(String namaKaryawan){
        this.karyawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat ){
        this.karyawan.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.karyawan.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan){
        return this.karyawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan){
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
}
