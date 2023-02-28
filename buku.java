/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b121_muc;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
        

/**
 *
 * @author PC-18
 */
public class buku {
    String nama, penulis;
    int tahun_terbit, harga;
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    static ArrayList listbuku = new ArrayList<>();
    
    void tambah_buku() throws IOException{
        System.out.print("Masukkan Nama Buku : ");
        nama = br.readLine();
        listbuku.add(nama);
    }
    
    void lihat_buku(){
        for(int i = 0; i < listbuku.size(); i++){
            System.out.println("Nama Buku " + (i+1) + " : " + listbuku.get(i));
        }
        System.out.print("Press [enter] to continue...");
        new java.util.Scanner(System.in).nextLine();
    }
    

    
    int cari() throws IOException{
        String search;
        int indeks = 0;
        System.out.println("Nama Buku : ");
        search = br.readLine();
        for(int i = 0; i < listbuku.size(); i++){
            indeks = listbuku.indexOf(search);
        }return indeks;
    }
    
    void edit_buku() throws IOException{
        int idk = cari();
        System.out.print("Nama Baru Buku : ");
    }
}
