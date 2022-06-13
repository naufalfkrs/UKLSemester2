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
public class Siswa implements GetInfo{
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa(){
        this.idSiswa.add(1);
        this.namaSiswa.add("Naufal");
        this.alamat.add("Surabaya");
        this.telepon.add("082142800540");
        this.status.add(true);

        this.idSiswa.add(2);
        this.namaSiswa.add("Ilham");
        this.alamat.add("Wonogiri");
        this.telepon.add("081234567890");
        this.status.add(true);
    }

    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }
    public int getid(int id){
        return this.idSiswa.get(id);
    }
    
    public void cetak(Siswa arraySiswa){
        int x = arraySiswa.getJmlSiswa();

        System.out.println("----- List Siswa -----");
        System.out.println("Id" + "\t" + "Nama" + "\t" + "Alamat" + "\t\t" + "Nomor" + "\t\t" + "Status");
        for (int i = 0; i < x; i++){
            System.out.println(arraySiswa.getid(i) + "\t" + arraySiswa.getNama(i) + "\t" + arraySiswa.getAlamat(i) + "\t" + arraySiswa.getTelepon(i) + "\t" + arraySiswa.getStatus(i));
        }
    }

    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPeminjam) {
        return this.namaSiswa.get(idPeminjam);
    }

    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }

    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }
    
}
