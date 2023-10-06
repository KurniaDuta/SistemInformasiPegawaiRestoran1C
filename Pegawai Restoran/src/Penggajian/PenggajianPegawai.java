package Penggajian;

import java.util.Scanner;

public class PenggajianPegawai {
    public static void main(String[] args) {

        // Inisialisasi Scanner
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);

        // Inisialisasi variabel
        String username = "admin1", password = "admin1", namaPegawai, domisili, pendidikan, penyakit, role;
        char pilihMenu, pilihRole, back;
        int gajiPokok = 4000000, jmlIzin, nominalIzin = 100000, gajiAkhir, potIzin,
                intensifLembur = 25000, jmlLembur,
                gajiLembur, shiftMasuk;

        // Login
        System.out.println(
                "================================== Sistem Pegawai Restoran 1C =================================");
        System.out.print("\t\t\t        Enter username: ");
        String enteredUsername = inputText.nextLine();

        System.out.print("\t\t\t        Enter password: ");
        String enteredPassword = inputText.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("\n\t\t\t      Welcome to Sistem Pegawai, " + username + "!");

            // List Menu
            System.out.println("=========================================");
            System.out.println("           MENU SISTEM KARYAWAN          ");
            System.out.println("=========================================");
            System.out.println("1. List Data Karyawan");
            System.out.println("2. Tambah Data Karyawan");
            System.out.println("3. Ubah Data Karyawan");
            System.out.println("4. Hapus Data Karyawan");
            System.out.println("5. Sistem Gaji");
            System.out.println("=========================================");
            System.out.print("   Pilih menu yang anda inginkan (1-5) : ");

            pilihMenu = inputText.next().charAt(0);
            switch (pilihMenu) {
                case '1':
                    System.out.println("\n***** Menu List Data Pegawai *****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                case '2':
                    System.out.println("\n***** Menu Tambah Data Pegawai *****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                case '3':
                    System.out.println("\n***** Menu Ubah Data Pegawai *****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                case '4':
                    System.out.println("\n***** Menu Hapus Data Karyawan ****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                case '5':
                    System.out.println("\n***** Menu Sistem Gaji *****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                default:
                    System.out.println("\nMenu yang anda pilih tidak ditemukan! Mohon re-run codingan anda");
            }
        } else {
            System.out.println("\n\t\t\t  Maaf, username atau password anda salah!");
        }
    }
}
