/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b121_muc.newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author PC-18
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        ArrayList<Dosen> dataDosen = new ArrayList<>();
        while (true) {
            System.out.println("=============================");
            System.out.println("1 | Create");
            System.out.println("2 | Read");
            System.out.println("3 | Update");
            System.out.println("4 | Delete");
            System.out.println("5 | Exit");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int x = Integer.parseInt(br.readLine());
            switch (x) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("1 | Create Data Mahasiswa");
                    System.out.println("2 | Create Data Dosen");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int menuCreate = Integer.parseInt(br.readLine());
                    switch (menuCreate) {
                        case 1:
                            System.out.print("Create Nama : ");
                            String nmaM = br.readLine();
                            System.out.print("Create Alamat : ");
                            String almtM = br.readLine();
                            System.out.print("Create Umur ");
                            int umrM = Integer.parseInt(br.readLine());
                            System.out.print("Create Nim : ");
                            int nm = Integer.parseInt(br.readLine());
                            Mahasiswa newMahasiswa = new Mahasiswa(nmaM, almtM, umrM, nm);
                            dataMahasiswa.add(newMahasiswa);
                            break;
                        case 2:
                            System.out.print("Create Nama : ");
                            String nmaD = br.readLine();
                            System.out.print("Create Alamat : ");
                            String almtD = br.readLine();
                            System.out.print("Create Umur ");
                            int umrD = Integer.parseInt(br.readLine());
                            System.out.print("Create NIM : ");
                            int np = Integer.parseInt(br.readLine());
                            Dosen newDosen = new Dosen(nmaD, almtD, umrD, np);
                            dataDosen.add(newDosen);
                            break;
                    }
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;

                case 2:
                    System.out.println("=============================");
                    System.out.println("1 | Read Data Mahasiswa");
                    System.out.println("2 | Read Data Dosen");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int menuRead = Integer.parseInt(br.readLine());
                    switch (menuRead) {
                        case 1:
                            System.out.println("=============================");
                            for (int i = 0; i < dataMahasiswa.size(); i++) {
                                System.out.println("Data Mahasiswa ke-" + (i + 1));
                                System.out.println("Nama : " + dataMahasiswa.get(i).getNama());
                                System.out.println("Alamat : " + dataMahasiswa.get(i).getAlamat());
                                System.out.println("Umur : " + dataMahasiswa.get(i).getUmur());
                                System.out.println("NIM : " + dataMahasiswa.get(i).getNim());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 2:
                            System.out.println("=============================");
                            for (int i = 0; i < dataDosen.size(); i++) {
                                System.out.println("Data Mahasiswa ke-" + (i + 1));
                                System.out.println("Nama : " + dataDosen.get(i).getNama());
                                System.out.println("Alamat : " + dataDosen.get(i).getAlamat());
                                System.out.println("Umur : " + dataDosen.get(i).getUmur());
                                System.out.println("NIM : " + dataDosen.get(i).getNip());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("1 | Update Data Mahasiswa");
                    System.out.println("2 | Update Data Dosen");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int menuUpdate = Integer.parseInt(br.readLine());
                    switch (menuUpdate) {
                        case 1:
                            System.out.print("Masukkan NIM Yang Ingin Diupdate : ");
                            int updateMhs = Integer.parseInt(br.readLine());

                            for (Mahasiswa mhs : dataMahasiswa) {
                                if (mhs.getNim() == updateMhs) {
                                    System.out.print("Masukkan Nama : ");
                                    mhs.setNama(br.readLine());
                                    System.out.print("Masukkan Alamat : ");
                                    mhs.setAlamat(br.readLine());
                                    System.out.print("Masukkan Umur : ");
                                    mhs.setUmur(Integer.parseInt(br.readLine()));
                                    System.out.print("Masukkan NIM : ");
                                    mhs.setNim(Integer.parseInt(br.readLine()));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan NIP Yang Ingin Diupdate : ");
                            int updateDsn = Integer.parseInt(br.readLine());

                            for (Mahasiswa mhs : dataMahasiswa) {
                                if (mhs.getNim() == updateDsn) {
                                    System.out.print("Masukkan Nama : ");
                                    mhs.setNama(br.readLine());
                                    System.out.print("Masukkan Alamat : ");
                                    mhs.setAlamat(br.readLine());
                                    System.out.print("Masukkan Umur : ");
                                    mhs.setUmur(Integer.parseInt(br.readLine()));
                                    System.out.print("Masukkan NIP : ");
                                    mhs.setNim(Integer.parseInt(br.readLine()));
                                    break;
                                }
                            }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
