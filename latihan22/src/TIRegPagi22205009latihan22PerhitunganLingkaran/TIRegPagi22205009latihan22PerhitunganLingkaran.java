 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan22PerhitunganLingkaran;
import java.util.Scanner;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * perhitungan lingkaran yang inputannya berasal dari user
 * 
 */
public class TIRegPagi22205009latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Perhitungan lingkaran=======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter lingkaran : ");
        String diameterLingkaran = scanner.nextLine();
        
        try {
            int d = Integer.parseInt(diameterLingkaran);
            
            if(d <= 0) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            
            } else {
                
                int jariJariLingkaran = d / 2;               
                double luasLingkaran = Math.PI * jariJariLingkaran * jariJariLingkaran;
                double kelilingLingkaran = Math.PI * d;
                
                System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
                System.out.println("Jari-jari Lingkaran\t= "+jariJariLingkaran+" cm");
                System.out.printf("Luas Lingkaran\t\t= %.2f cm\u00B2\n",luasLingkaran);
                System.out.printf("Keliling Lingkaran\t= %.2f cm\n",kelilingLingkaran);
            }
        } catch (NumberFormatException e) {
            System.out.println("Nilai Diameter Tidak Sesuai ");
        }
        
    }
    
}