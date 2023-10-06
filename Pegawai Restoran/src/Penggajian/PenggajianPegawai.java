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
        } else {
            System.out.println("\n\t\t\t  Maaf, username atau password anda salah!");
        }
    }
}
