/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b121_muc.newpackage;

/**
 *
 * @author PC-18
 */
public class Mahasiswa extends Orang {
    private int nim;
    
    public Mahasiswa(String nama, String alamat, int umur, int nim){
        super(nama, alamat, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
            
}
