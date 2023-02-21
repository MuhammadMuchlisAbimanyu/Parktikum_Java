/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b121_muc;

import javax.swing.JOptionPane;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

/**
 *
 * @author PC-18
 */
public class B121_Muc {

    /**
     * @param args the command line arguments
     */

// Method, Fungsi, & Prosedur
//    =====================================
    static void error(){
        System.out.println("404 Not Found");
    }
    
    static int hitung(int angka1, int angka2){
        return angka1 + angka2;
    }
//    =====================================
    
    public static void main(String[] args) throws IOException{
        
//        int angka = 1;
//        JOptionPane.showMessageDialog(null, "Hello World" + angka);
//        System.out.println("Hello Console" + angka);
        
        error();
        System.out.println(hitung(10,20));

        String nama, kelas;
        int umur;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
//    Scanner
//    =====================================
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan Nama  : ");
//        nama = input.nextLine();
//        System.out.print("Masukkan Umur  : ");
//        umur = input.nextInt();
//        ============
//        input.nextLine();
//        ============
//        System.out.print("Masukkan Kelas : ");
//        kelas = input.nextLine();
//        
//        System.out.println("Nama kamu " + nama);
//        System.out.println("Umur kamu " + umur);
//        System.out.println("Kelas kamu " + kelas);

//        ArrayList<String> listNama = new ArrayList<>();
//        
//        listNama.add("Mac");
//        listNama.add("Mic");
//        listNama.add("Muc");
//        listNama.add("Mec");
//        listNama.add("Moc");
//        
//        listNama.set(2, "Muchlis");
//        
//        System.out.println("Panjang Array : " + listNama.size());
//        for(int i = 0; i < listNama.size(); i++){
//            System.out.println(listNama.get(i));
//        }

        }
}
