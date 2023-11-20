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
        usernames[2] = "gayuh";
        usernames[3] = "pram";
        usernames[4] = "rensi";

        // passwords
        passwords[0] = "admin";
        passwords[1] = "duta";
        passwords[2] = "gayuh";
        passwords[3] = "pram";
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
        String[] menuPegawai = { "Profil", "Slip Gaji" };

        // Data
        int counterData = 5, counterPegawai = 4, counterAdmin = 1, counterGaji = 5;

        // Variabels
        int userIndex = -1, choiceLogin, choice, choiceListData;
        char back = 'n';
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
                    System.out.println("Terima Kasih");
                    System.exit(0);
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
                                System.out.println("==========================================");
                                System.out.println("               TAMBAH DATA                ");
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
                                        if (counterData < data[0].length) {
                                            counterPegawai++;
                                            data[0][counterData] = "P10" + counterPegawai;
                                            System.out.println("ID Pegawai: " + data[0][counterData]);
                                            System.out.print("Nama Lengkap: ");
                                            data[1][counterData] = sc.nextLine();
                                            System.out.print("Role(Chef/Cashier/Waiter/Receptionist): ");
                                            data[2][counterData] = sc.nextLine();
                                            System.out.print("Domisili: ");
                                            data[3][counterData] = sc.nextLine();
                                            System.out.print("Riwayat Penyakit: ");
                                            data[4][counterData] = sc.nextLine();
                                            System.out.print("Riwayat Pendidikan: ");
                                            data[5][counterData] = sc.nextLine();
                                            System.out.print("Username: ");
                                            usernames[counterData] = sc.nextLine();
                                            System.out.print("Password: ");
                                            passwords[counterData] = sc.nextLine();

                                            counterData++;
                                        } else {
                                            System.out.println("Batas maksimum pegawai telah tercapai.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("==========================================");
                                        System.out.println("                DATA ADMIN                ");
                                        System.out.println("==========================================");
                                        if (counterData < data[0].length) {
                                            counterAdmin++;
                                            data[0][counterData] = "A10" + counterAdmin;
                                            System.out.println("ID Admin: " + data[0][counterData]);
                                            System.out.print("Nama Lengkap: ");
                                            data[1][counterData] = sc.nextLine();
                                            data[2][counterData] = data[2][0];
                                            System.out.print("Domisili: ");
                                            data[3][counterData] = sc.nextLine();
                                            System.out.print("Riwayat Penyakit: ");
                                            data[4][counterData] = sc.nextLine();
                                            System.out.print("Riwayat Pendidikan: ");
                                            data[5][counterData] = sc.nextLine();
                                            System.out.print("Username: ");
                                            usernames[counterData] = sc.nextLine();
                                            System.out.print("Password: ");
                                            passwords[counterData] = sc.nextLine();

                                            counterData++;
                                        } else {
                                            System.out.println("Batas maksimum pegawai telah tercapai.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("==========================================");
                                        System.out.println("             Data Role & Gaji Pokok       ");
                                        System.out.println("==========================================");
                                        if (counterGaji < role.length) {
                                            System.out.print("Role: ");
                                            role[counterGaji] = sc.nextLine();
                                            System.out.print("Gaji Pokok: ");
                                            gajiPokok[counterGaji] = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("Data berhasil ditambahkan");
                                            counterGaji++;
                                        } else {
                                            System.out.println("Batas maksimum role telah tercapai.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Input Tidak Valid");
                                        break;
                                }
                                break;
                            case 3:
                                // Delete Data
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                        "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                            data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                            data[5][i]);
                                }
                                System.out.print("Masukkan ID yang ingin dihapus: ");
                                String idDelete = sc.nextLine();
                                found = false;
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idDelete.toLowerCase())) {
                                        for (int j = i; j < counterData - 1; i++) {
                                            data[0][j] = data[0][j + 1];
                                            data[1][j] = data[0][j + 1];
                                            data[2][j] = data[0][j + 1];
                                            data[3][j] = data[0][j + 1];
                                            data[4][j] = data[0][j + 1];
                                            data[5][j] = data[0][j + 1];
                                        }
                                        data[0][counterData - 1] = null;
                                        data[1][counterData - 1] = null;
                                        data[2][counterData - 1] = null;
                                        data[3][counterData - 1] = null;
                                        data[4][counterData - 1] = null;
                                        data[5][counterData - 1] = null;
                                        counterData--;
                                        System.out.println("Pegawai berhasil dihapus.");
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Data tidak ditemukan.");
                                }
                                break;
                            case 4:
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                        "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                            data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                            data[5][i]);
                                }
                                System.out.print("Masukkan ID yang ingin diedit: ");
                                String idUpdate = sc.nextLine();
                                found = false;
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idUpdate.toLowerCase())) {
                                        System.out.println(
                                                "1. Nama Lengkap\n2. Role\n3. Domisili\n4. Riwayat Penyakit\n5. Riwayat Pendidikan");
                                        System.out.println("Pilih kolom yang akan diedit(1-5): ");
                                        int columnToEdit = sc.nextInt();
                                        sc.nextLine(); // Membersihkan newline
                                        switch (columnToEdit) {
                                            case 1:
                                                System.out.print("Nama Lengkap: ");
                                                data[1][i] = sc.nextLine();
                                                break;
                                            case 2:
                                                System.out.print("Role (Chef/Cashier/Waiter/Receptionist): ");
                                                data[2][i] = sc.nextLine();
                                                break;
                                            case 3:
                                                System.out.print("Domisili: ");
                                                data[3][i] = sc.nextLine();
                                                break;
                                            case 4:
                                                System.out.print("Riwayat Penyakit: ");
                                                data[4][i] = sc.nextLine();
                                                break;
                                            case 5:
                                                System.out.print("Riwayat Pendidikan: ");
                                                data[5][i] = sc.nextLine();
                                                break;
                                            default:
                                                break;
                                        }
                                        System.out.println("Data berhasil diedit!");
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Data tidak ditemukan.");
                                }
                                break;
                            case 5:
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                        "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                            data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                            data[5][i]);
                                }
                                System.out.println("Masukkan ID yang ingin digaji: ");
                                String idGaji = sc.nextLine();
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idGaji.toLowerCase())) {
                                        int indexToPay = i;
                                        System.out.println("Masukkan Jumlah Izin: ");
                                        izin[indexToPay] = sc.nextInt();
                                        System.out.println("Masukkan Jumlah Lembur: ");
                                        lembur[indexToPay] = sc.nextInt();

                                        totalGaji[indexToPay] = (int) gajiPokok[indexToPay]
                                                + (lembur[indexToPay] * 50000)
                                                - (izin[indexToPay] * 50000);
                                        System.out.println("Total Gaji: " + totalGaji[indexToPay]);
                                    }
                                }
                                break;
                            case 6:
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                        "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-30s%n",
                                            data[0][i], data[1][i], data[2][i], data[3][i], data[4][i],
                                            data[5][i]);
                                }
                                System.out.println("Masukkan ID yang ingin slip gaji dicetak: ");
                                String idSlip = sc.nextLine();
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idSlip.toLowerCase())) {
                                        int indexToPrint = i;
                                        System.out.println("\n========== SLIP GAJI ==========");
                                        System.out.println("ID Karyawan: " + data[0][indexToPrint]);
                                        System.out.println("Nama Karyawan: " + data[1][indexToPrint]);
                                        System.out.println("===============================");
                                        System.out.println("Gaji Pokok: Rp" + gajiPokok[indexToPrint]);
                                        System.out.println("Lembur: Rp" + (lembur[indexToPrint] * 50000));
                                        System.out.println("Potongan: Rp" + (izin[indexToPrint] * 50000));
                                        System.out.println("===============================");
                                        System.out.println("Total Gaji: Rp" + totalGaji[indexToPrint]);
                                        System.out.println("========== TERIMA KASIH =========");
                                    }
                                }
                                break;
                            case 7:
                                System.out.println("Logging out...");
                                userIndex = -1;
                                break;
                        }
                    } else {
                        System.out.println("Selamat Datang " + data[1][userIndex]);
                        System.out.println("Pilih Menu:");
                        for (int i = 0; i < menuPegawai.length; i++) {
                            System.out.println((i + 1) + ". " + menuPegawai[i]);
                        }
                        System.out.print("--> ");
                        choice = sc.nextInt();
                        sc.nextLine();
                        switch (choice) {
                            case 1:
                                System.out.println("ID Pegawai: " + data[0][userIndex]);
                                System.out.println("Nama Lengkap: " + data[1][userIndex]);
                                System.out.println("Role: " + data[2][userIndex]);
                                System.out.println("Domisili: " + data[3][userIndex]);
                                System.out.println("Riwayat Penyakit: " + data[4][userIndex]);
                                System.out.println("Riwayat Pendidikan: " + data[5][userIndex]);
                                break;
                            case 2:
                                System.out.println("\n========== SLIP GAJI ==========");
                                System.out.println("ID Karyawan: " + data[0][userIndex]);
                                System.out.println("Nama Karyawan: " + data[1][userIndex]);
                                System.out.println("===============================");
                                System.out.println("Gaji Pokok: Rp" + gajiPokok[userIndex]);
                                System.out.println("Lembur: Rp" + (lembur[userIndex] * 50000));
                                System.out.println("Potongan: Rp" + (izin[userIndex] * 50000));
                                System.out.println("===============================");
                                System.out.println("Total Gaji: Rp" + totalGaji[userIndex]);
                                System.out.println("========== TERIMA KASIH ==========");
                                break;

                            default:
                                break;
                        }
                    }

                    if (userIndex != -1) {
                        System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                        back = sc.next().charAt(0);
                    }
                } while ((back == 'y' || back == 'Y') && userIndex != -1);
            } else {
                System.out.println("Terima Kasih");
                break;
            }
        } while (choiceLogin != 2);
    }
}
