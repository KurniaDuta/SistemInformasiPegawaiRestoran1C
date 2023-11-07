package Penggajian;

import java.util.Scanner;

public class PenggajianPegawaiV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel
        char back;

        // Data pengguna (username, password, dan level)
        String[] usernames = { "admin1", "admin2", "admin3", "admin4", "admin5", "manager1", "manager2", "manager3",
                "manager4", "manager5" };
        String[] passwords = { "adminpass1", "adminpass2", "adminpass3", "adminpass4", "adminpass5", "managerpass1",
                "managerpass2", "managerpass3", "managerpass4", "managerpass5" };
        String[] userLevels = { "Admin", "Admin", "Admin", "Admin", "Admin", "Manager", "Manager", "Manager", "Manager",
                "Manager" };

        String[] fullNames = new String[10]; // Nama lengkap
        String[] roles = new String[10]; // Role
        String[] domisilis = new String[10]; // Domisili
        String[] riwayatPenyakits = new String[10]; // Riwayat Penyakit
        String[] riwayatPendidikans = new String[10]; // Riwayat Pendidikan
        double[] salaries = new double[10]; // Gaji
        double[] totalSalary = new double[10]; // total gaji
        int[] izin = new int[10]; // Izin
        int[] lembur = new int[10]; // Lembur

        String[] roleList = { "admin", "manajer", "chef", "pelayan" };

        fullNames[0] = "Duta Kurnia A";
        fullNames[1] = "Nakita Gayuh C";
        fullNames[2] = "Pramudya Surya A";
        fullNames[3] = "Rensi Meila Y";

        roles[0] = "admin";
        roles[1] = "manager";
        roles[2] = "chef";
        roles[3] = "pelayan";

        domisilis[0] = "Malang";
        domisilis[1] = "Malang";
        domisilis[2] = "Malang";
        domisilis[3] = "Malang";

        riwayatPenyakits[0] = "-";
        riwayatPenyakits[1] = "-";
        riwayatPenyakits[2] = "-";
        riwayatPenyakits[3] = "-";

        riwayatPendidikans[0] = "SMK";
        riwayatPendidikans[1] = "SMK";
        riwayatPendidikans[2] = "SMA";
        riwayatPendidikans[3] = "SMK";

        int employeeCount = 4;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Sistem Penggajian Restoran 1C");
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            int userIndex = -1;
            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i].equals(username) && passwords[i].equals(password)) {
                    userIndex = i;
                    break;
                }
            }

            if (userIndex != -1) {
                String userLevel = userLevels[userIndex];
                System.out.println("Login berhasil sebagai " + userLevel);

                if (userLevel.equalsIgnoreCase("Admin")) {

                } else if (userLevel.equalsIgnoreCase("Manager")) {

                }
            } else {
                System.out.println("Login Gagal. " + (3 - attempt) + " kali percobaan lagi");
                if (attempt == 3) {
                    System.out.println("Maximum percobaan login telah tercapai. Silahkan coba lagi nanti");
                }
            }

        }

    }
}