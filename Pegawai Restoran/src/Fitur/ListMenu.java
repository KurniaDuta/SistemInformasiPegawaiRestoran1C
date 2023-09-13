package Fitur;
import java.util.Scanner;

public class ListMenu {
    public static void main(String[] args) {
        // Scanner
        Scanner p1 = new Scanner(System.in);
        
        // Print line
        System.out.println("=========================================");
        System.out.println("           MENU SISTEM KARYAWAN          ");
        System.out.println("=========================================");
        System.out.println("1. List Data Karyawan");
        System.out.println("2. Tambah Data Karyawan");
        System.out.println("3. Ubah Data Karyawan");
        System.out.println("4. Hapus Data Karyawan");
        System.out.println("5. Sistem Gaji");
        System.out.println("=========================================");

        System.out.println("  Pilih menu yang anda inginkan (1-5) : ");
        int pilih = p1.nextInt();
        
    }
}
