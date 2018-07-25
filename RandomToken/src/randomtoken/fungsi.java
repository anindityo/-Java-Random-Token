/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomtoken;

import java.util.Random;

/**
 *
 * @author Gusma
 */
public class coba {

    /**
     * Fungsi dengan menggunakan data tipe char diconvert menjadi String
     * Dengan fungsi Random untuk menghasilkan data acak dari data array.
     * Fungsi menampilkan data Array dengan hasil Token (Acak). dengan non void
     * @param panjang
     * @return String baru berisi (charbaru)
     */

    public String token(int panjang) {

        char[] isi = "0123456789ABCDEFGHJIKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] charbaru = new char[panjang]; //
        Random acak = new Random(); 
        for (int i = 0; i < panjang; i++) { 
            charbaru[i] = isi[acak.nextInt(isi.length)];
        }
        return new String(charbaru);
    }
}
