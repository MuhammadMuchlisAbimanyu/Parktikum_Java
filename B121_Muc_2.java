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

public class B121_Muc_2 {
        static InputStreamReader isr = new InputStreamReader(System.in);
        static BufferedReader br = new BufferedReader(isr);
        public static void main(String[] args) throws Exception{
            buku buku1 = new buku();
            peminjaman dataPeminjaman = new peminjaman(null, 0);
            while(true){
                System.out.println("====================");
                System.out.println("1 | Tambah Data");
                System.out.println("2 | Lihat Data");
                System.out.println("3 | Edit Data");
                System.out.println("4 | Hapus Data");
                System.out.println("5 | Keluar");
                System.out.println("====================");
                System.out.print("Masukkan Pilihan Anda : ");
                int x = Integer.parseInt(br.readLine());
                switch(x){
                    case 1:
                        buku1.tambah_buku();
                        break;
                    case 2:
                        buku1.lihat_buku();
                        break;
                }                
            }
//                case 2:
//                    lihatData();
//                case 3:
//                    editData();
//                case 4:
//                    hapusData();
//                case 5:
//                    end();
    }
}
