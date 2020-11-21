/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung Gaji Karyawan.
 */
public class PBOIF210119058Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Manager m = new Manager ();
        
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : "); m.setNik(input.nextLine());
        System.out.print("Masukkan Nama : "); m.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : "); m.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : "); m.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : "); m.setKehadiran(input.nextInt());
        System.out.println();
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK      : " + m.getNik());
        System.out.println("Nama     : " + m.getNama());
        System.out.println("GOLONGAN : " + m.getGolongan());
        System.out.println("JABATAN  : " + m.getJabatan());
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN  : " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println();
        System.out.println("GAJI TOTAL : " + m.gajiTotal());
    }
    
}
