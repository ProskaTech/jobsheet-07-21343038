/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js7;

/**
 * created by 21343038_AbelLevran
 * @author Bellevran
 */
import java.util.Scanner;
public class Tugas1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;

        while (jumlah < 10) {
            System.out.println(nama);
            jumlah++;
        }
    }
}
