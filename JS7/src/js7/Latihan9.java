/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js7;

/**
 * created by 21343038_AbelLevran
 * @author Bellevran
 */
public class Latihan9 {
    public static void main(String[] args) {
        int baris, kolom, hasil_kali;
        int maks=8;
        for (baris = 1; baris <= maks; baris++)
        {
            for (kolom = 1; kolom <= maks; kolom++)
            {
                hasil_kali = baris * kolom;
                System.out.print("\t"+hasil_kali);
            }
            System.out.println("");
        }
    }
}
