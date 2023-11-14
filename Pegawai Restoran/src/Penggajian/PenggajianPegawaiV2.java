package Penggajian;

import java.util.Scanner;

public class PenggajianPegawaiV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = new String[10];
        String[] passwords = new String[10];
        String[][] data = new String[6][10];
        String[] role = new String[10];
        int[] gajiPokok = new int[10];
        double[] totalGaji = new double[10]; // total gaji
        int[] izin = new int[10]; // Izin
        int[] lembur = new int[10]; // Lembur

        // usernames
        usernames[0] = "admin";
        usernames[1] = "duta";
        usernames[2] = "pram";
        usernames[3] = "gayuh";
        usernames[4] = "rensi";

        // passwords
        passwords[0] = "admin";
        passwords[1] = "duta";
        passwords[2] = "pram";
        passwords[3] = "gayuh";
        passwords[4] = "rensi";

        // ID
        data[0][0] = "A101";
        data[0][1] = "P101";
        data[0][2] = "P102";
        data[0][3] = "P103";
        data[0][4] = "P104";

        // Name
        data[1][0] = "admin";
        data[1][1] = "Duta Kurnia A";
        data[1][2] = "Nakita Gayuh C";
        data[1][3] = "Pramudya Surya A";
        data[1][4] = "Rensi Meila Y";

        // role
        data[2][0] = "Manager";
        data[2][1] = "Chef";
        data[2][2] = "Cashier";
        data[2][3] = "Waiter";
        data[2][4] = "Receptionist";

        // Domicile
        data[3][0] = "Default";
        data[3][1] = "Malang";
        data[3][2] = "Malang";
        data[3][3] = "Malang";
        data[3][4] = "Malang";

        // Medical History
        data[4][0] = "-";
        data[4][1] = "Kesleo";
        data[4][2] = "-";
        data[4][3] = "-";
        data[4][4] = "-";

        // Educational Background
        data[5][0] = "-";
        data[5][1] = "SMK";
        data[5][2] = "SMK";
        data[5][3] = "SMA";
        data[5][4] = "SMK";

        // Role
        role[0] = "Manager";
        role[1] = "Chef";
        role[2] = "Cashier";
        role[3] = "Waiter";
        role[4] = "Receptionist";

        // Gaji Pokok
        gajiPokok[0] = 5_000_000;
        gajiPokok[1] = 4_000_000;
        gajiPokok[2] = 3_000_000;
        gajiPokok[3] = 3_000_000;
        gajiPokok[4] = 3_000_000;

        // Menu
        String[] menuLogin = { "Login", "Exit" };
        String[] menuAdmin = { "List Data", "Tambah Data", "Hapus Data Pegawai",
                "Edit Data Pegawai", "Penggajian Pegawai", "Cetak Slip Gaji", "Logout" };
        String[] menuListData = { "Data Pegawai", "Data Admin", "Data Role & Gaji Pokok" };

        // Data
        int counterData = 5, counterPegawai = 4, counterAdmin = 1, counterGaji = 5;

        // Variabels
        int userIndex = -1, choiceLogin, choice, choiceListData, back = 'n';
        boolean found;

        do {
            System.out.println("==========================================");
            System.out.println("      SELAMAT DATANG DI RESTORAN 1C       ");
            System.out.println("==========================================");
            for (int i = 0; i < menuLogin.length; i++) {
                System.out.println((i + 1) + ". " + menuLogin[i]);
            }
            System.out.print("--> ");
            choiceLogin = sc.nextInt();
            sc.nextLine();

            switch (choiceLogin) {
                case 1:
                    for (int attempt = 1; attempt <= 3; attempt++) {
                        // Login
                        System.out.print("Masukkan username: ");
                        String username = sc.nextLine();
                        System.out.print("Masukkan password: ");
                        String password = sc.nextLine();

                        // Check Login
                        boolean validCredentials = false;
                        for (int i = 0; i < usernames.length; i++) {
                            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                                validCredentials = true;
                                userIndex = i;
                                break;
                            }
                        }

                        if (validCredentials) {
                            break;
                        } else {
                            System.out.println("==========================================");
                            System.out.println("= Login Gagal. " + (3 - attempt) + " kali percobaan lagi =");
                            System.out.println("==========================================");
                            if (attempt == 3) {
                                System.out.println("==========================================");
                                System.out.println("= Maximum percobaan login telah tercapai. =");
                                System.out.println("=     Silahkan coba lagi nanti            =");
                                System.out.println("==========================================");
                                break;
                            }
                        }

                    }
                    break;
                case 2:
                    break;

                default:
                    System.out.println("Menu Salah Masukkan Ulang!");
                    break;
            }

            if (userIndex != -1) {
                do {
                    if (data[2][userIndex].equals(data[2][0])) {
                        System.out.println("Selamat Datang " + data[1][userIndex]);
                        System.out.println("Pilih Menu:");
                        for (int i = 0; i < menuAdmin.length; i++) {
                            System.out.println((i + 1) + ". " + menuAdmin[i]);
                        }
                        System.out.print("--> ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        switch (choice) {
                            case 1:
                                System.out.println("==========================================");
                                System.out.println("                LIST DATA                 ");
                                System.out.println("==========================================");
                                for (int i = 0; i < menuListData.length; i++) {
                                    System.out.println((i + 1) + ". " + menuListData[i]);
                                }
                                System.out.print("--> ");
                                choiceListData = sc.nextInt();
                                sc.nextLine();
                                switch (choiceListData) {
                                    case 1:
                                        System.out.println("==========================================");
                                        System.out.println("               DATA PEGAWAI               ");
                                        System.out.println("==========================================");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                                "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                                "Riwayat Pendidikan");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        for (int i = 0; i < counterData; i++) {
                                            if (!(data[2][i].equalsIgnoreCase(data[2][0]))) {
                                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                                        data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                                        data[5][i]);
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("==========================================");
                                        System.out.println("                DATA ADMIN                ");
                                        System.out.println("==========================================");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                                "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                                "Riwayat Pendidikan");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        for (int i = 0; i < counterData; i++) {
                                            if (data[2][i].equalsIgnoreCase(data[2][0])) {
                                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                                        data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                                        data[5][i]);
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("==========================================");
                                        System.out.println("             Data Role & Gaji Pokok       ");
                                        System.out.println("==========================================");
                                        System.out.println(
                                                "-----------------------------------------------");
                                        System.out.printf("| %-20s | %-20s | %n", "Role", "Gaji Pokok");
                                        System.out.println(
                                                "-----------------------------------------------");
                                        for (int i = 0; i < counterGaji; i++) {
                                            System.out.printf("| %-20s | %-20d | %n", role[i], gajiPokok[i]);
                                        }
                                        System.out.println(
                                                "-----------------------------------------------");
                                        break;

                                    default:
                                        System.out.println("Data yang Anda masukkan salah");
                                        break;
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                        }
                    } else {
                        System.out.println("Selamat Datang " + data[1][userIndex]);
                        System.out.println("Pilih Menu:");
                        System.out.println("on progress");
                        System.out.print("--> ");
                        choice = sc.nextInt();
                        sc.nextLine();
                    }

                    if (userIndex != -1) {
                        System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                        back = sc.next().charAt(0);
                    }
                } while ((back == 'y' || back == 'Y') && userIndex != -1);
            } else {
                System.out.println("Terima Kasih");
            }
        } while (choiceLogin != 2);
    }
}
