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
public class Dosen extends Orang {
    private int nip;
    
    public  Dosen(String nama, String alamat, int umur, int nip) {
        super(nama, alamat, umur);
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    
}
