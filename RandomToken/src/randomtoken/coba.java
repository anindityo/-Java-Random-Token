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
     * Menampilkan data Array dengan hasil Token (Acak). dengan non void
     *
     * @param panjang
     * @return String baru berisi (charbaru)
     */

    public String token(int panjang) {

        char[] isi = "0123456789ABCDEFGHJIKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray(); //Data array dari data tipe karakter
        char[] charbaru = new char[panjang]; //instanceof dari char menjadi charbaru
        Random acak = new Random(); //instanceof dari random menjadi acak
        for (int i = 0; i < panjang; i++) { //Looping untuk memanggil data array pada inisialisasi "isi"
            charbaru[i] = isi[acak.nextInt(isi.length)];
        }
        return new String(charbaru);
    }
}
