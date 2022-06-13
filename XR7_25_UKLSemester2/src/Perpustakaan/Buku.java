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
public class Buku{
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku(){
        this.idBuku.add(1);
        this.namaBuku.add("Sejarah");
        this.stok.add(15);
        this.harga.add(20000);

        this.idBuku.add(2);
        this.namaBuku.add("Fisika");
        this.stok.add(10);
        this.harga.add(22000);
    }

    public int getJmlBuku(){
        return this.idBuku.size();
    }
    public int getid(int id){
        return this.idBuku.get(id);
    }
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }

    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }

    //    Set stok minus
    public void setBukuMin (int idbuku, int banyak){
        int min = getStok(idbuku) - banyak;
        stok.set(idbuku, min);
    }

    //    Set stok plus
    public void setBukuPlus (int idbuku, int banyak){
        int plus = getStok(idbuku) + banyak;
        stok.set(idbuku, plus);
    }
    
    public void cetak(Buku buku){
        int x = buku.getJmlBuku();

        System.out.println("===== List Buku =====");
        System.out.println("Id" + "\t" + "Judul" + "\t\t" + "Stok");
        for (int i = 0; i < x; i++){
            System.out.println(buku.getid(i) + "\t" + buku.getNamaBuku(i) + "\t\t" + buku.getStok(i));
        }
    }
}
