/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Hasil {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            boolean progres = true;
            String key;
            Buku selectedBuku;
            Siswa arraySiswa = new Siswa();
            Buku buku = new Buku();
            Petugas arrayKaryawan = new Petugas();

            while (progres) {
                System.out.println("\n---- Perpustakaan Siswa ----");
                System.out.println("1. List Siswa & Buku");
                System.out.println("2. Pinjam/Kembalikan");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu : \n");
                int menu = input.nextInt();
                
                switch (menu) {
                    case 1:
                        System.out.println("\n===========================");
                        //menampilkan daftar siswa
                        arraySiswa.cetak(arraySiswa);                       
                        System.out.println("");
                        // menampilkan daftar buku
                        buku.cetak(buku);
                        System.out.println("Press any key and enter...");
                        key = input.next();
                        System.out.println("===========================\n");
                        break;
                    case 2:
                        System.out.println("\n===========================");
                        System.out.println("---- Peminjaman Buku / Pengembalian ----");

                        int temp;

                        System.out.print("Masukkan id siswa : ");
                        int selectedIDSiswa = input.nextInt();

                        selectedIDSiswa -= 1;

                        ArrayList<Integer> idBuku = new ArrayList<Integer>();

                        int i = 0;
                        temp = 0;

                        System.out.print("Masukkan id Buku : ");
                        temp = input.nextInt();

                        temp -= 1;

                            if (arraySiswa.getStatus(selectedIDSiswa) == true) {
                                idBuku.add(temp);
                                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                                int banyak = input.nextInt();
                                int itemp = idBuku.get(0);

                                if (banyak <= buku.getStok(itemp)) {
                                    buku.setBukuMin(itemp, banyak);
                                    arraySiswa.editStatus(selectedIDSiswa, false);
                                }
                                else {
                                    System.out.println("Stok buku hanya ada sekian");
                                    int x = buku.getJmlBuku();
                                    System.out.println("Id" + "\t" + "Judul" + "\t" + "Stok");
                                    for (int b = 0; b < x; b++) {
                                        System.out.println(buku.getid(b) + "\t" + buku.getNamaBuku(b) + "\t" + buku.getStok(b));
                                    }
                                    System.out.println("Press any key and enter...");
                                    key = input.next();
                                }

                                System.out.println("\n---------------------------");
                                System.out.println("Id Siswa : " + arraySiswa.getid(selectedIDSiswa));
                                System.out.println("Nama : " + arraySiswa.getNama(selectedIDSiswa));
                                System.out.println("Alamat : " + arraySiswa.getAlamat(selectedIDSiswa));
                                System.out.println("Nomor : " + arraySiswa.getTelepon(selectedIDSiswa));
                                System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));
                                System.out.println("---------------------------\n");

                                System.out.println("--------- Karyawan ---------");
                                System.out.println("Nama : " + arrayKaryawan.getNama(0));
                                System.out.println("Alamat : " + arrayKaryawan.getAlamat(0));
                                System.out.println("Telepon : " + arrayKaryawan.getTelepon(0));
                                System.out.println("---------------------------");
                                System.out.println("===========================\n");

                            } 
                            else if (arraySiswa.getStatus(selectedIDSiswa) == false) {
                                System.out.print("Siswa sudah melakukan peminjaman buku");
                                System.out.print("\nApakah anda ingin mengembalikan buku ? y/n : ");
                                key = input.next();
                                if (key.equalsIgnoreCase("Y")) {
                                System.out.print("Masukkan id buku yang dipinjam : ");
                                int idbukupinjam = input.nextInt();
                                idbukupinjam -= 1; // id buku - 1

                                System.out.print("Masukkan jumlah buku " + buku.getNamaBuku(idbukupinjam) + " yang dipinjam : ");
                                int jumlahbukupinjam = input.nextInt();

                                buku.setBukuPlus(idbukupinjam, jumlahbukupinjam);

                                arraySiswa.editStatus(selectedIDSiswa, true);
                            }
                                System.out.println("\n---------------------------");
                                System.out.println("Id Siswa : " + arraySiswa.getid(selectedIDSiswa));
                                System.out.println("Nama : " + arraySiswa.getNama(selectedIDSiswa));
                                System.out.println("Alamat : " + arraySiswa.getAlamat(selectedIDSiswa));
                                System.out.println("Nomor : " + arraySiswa.getTelepon(selectedIDSiswa));
                                System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));
                                System.out.println("---------------------------\n");

                                System.out.println("--------- Karyawan ---------");
                                System.out.println("Nama : " + arrayKaryawan.getNama(0));
                                System.out.println("Alamat : " + arrayKaryawan.getAlamat(0));
                                System.out.println("Telepon : " + arrayKaryawan.getTelepon(0));
                                System.out.println("---------------------------");
                                System.out.println("===========================\n");
                            }
                            break;
                    case 3:
                        //variabel "progres" diset false menyebabkan program berhenti
                        progres = false;
                        break;
                } 
            }
        } 
        catch (Exception e) {
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }
}
