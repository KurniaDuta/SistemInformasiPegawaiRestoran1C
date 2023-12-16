package Penggajian;

import java.util.Scanner;

public class PenggajianPegawaiV2 {
    static Scanner sc = new Scanner(System.in);
    static String[] usernames = new String[10];
    static String[] passwords = new String[10];
    static String[][] data = new String[7][10];
    static String[] role = new String[10];
    static int[] gajiPokok = new int[10];
    static int[] gajiRole = new int[10];
    static int[] tunjanganMakan = new int[10];
    static int[] bonus = new int[10];
    static int[] gajiKotor = new int[10];
    static double[] totalGaji = new double[10]; // total gaji
    static int[] izin = new int[10]; // Izin
    static int[] lembur = new int[10]; // Lembur
    static double[][] riwayatGaji = new double[10][4];

    // Menu
    static String[] menuLogin = { "Login", "Exit" };
    static String[] menuAdmin = { "List Data", "Tambah Data", "Hapus Data Pegawai",
            "Edit Data Pegawai", "Penggajian Pegawai", "Cetak Slip Gaji", "Laporan Pegawai", "Riwayat Gaji", "Logout" };
    static String[] menuListData = { "Data Pegawai", "Data Admin", "Data Role & Gaji Pokok" };
    static String[] menuPegawai = { "Profil", "Edit Data Pegawai", "Slip Gaji", "Riwayat Gaji", "Logout" };
    static String[] menueditPegawai = { "Domisili", "Nomor Telepon" };

    // Data
    static int counterData = 5, counterIDPegawai = 4, counterIDAdmin = 1, counterGaji = 5, counterPegawai = 4,
            counterAdmin = 1;

    // Variabels
    static int userIndex = -1, choiceLogin, choice, choiceListData, ChoiceEditPegawai;
    static char back = 'n';
    static boolean found, edited;
    static String idSearch;

    static {
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
        data[4][1] = "-";
        data[4][2] = "-";
        data[4][3] = "-";
        data[4][4] = "-";

        // Educational Background
        data[5][0] = "-";
        data[5][1] = "SMK";
        data[5][2] = "SMK";
        data[5][3] = "SMA";
        data[5][4] = "SMK";

        // Nomor Telepon
        data[6][0] = "08123456789";
        data[6][1] = "08123456789";
        data[6][2] = "08123456789";
        data[6][3] = "08123456789";
        data[6][4] = "08123456789";

        // Role
        role[0] = "Manager";
        role[1] = "Chef";
        role[2] = "Cashier";
        role[3] = "Waiter";
        role[4] = "Receptionist";

    }

    static {
        gajiRole[0] = 5_000_000;
        gajiRole[1] = 4_000_000;
        gajiRole[2] = 3_000_000;
        gajiRole[3] = 3_000_000;
        gajiRole[4] = 3_000_000;

        gajiPokok[0] = gajiRole[0];
        gajiPokok[1] = gajiRole[1];
        gajiPokok[2] = gajiRole[2];
        gajiPokok[3] = gajiRole[3];
        gajiPokok[4] = gajiRole[4];

    }

    static {
        riwayatGaji[0][0] = 6_250_000; // admin
        riwayatGaji[0][1] = 6_550_000;
        riwayatGaji[0][2] = 6_775_000;

        riwayatGaji[1][0] = 5_800_000; // duta
        riwayatGaji[1][1] = 5_075_000;
        riwayatGaji[1][2] = 4_775_000;

        riwayatGaji[2][0] = 3_825_000; // gayuh
        riwayatGaji[2][1] = 3_300_000;
        riwayatGaji[2][2] = 4_050_000;

        riwayatGaji[3][0] = 4_050_000; // pram
        riwayatGaji[3][1] = 3_750_000;
        riwayatGaji[3][2] = 3_975_000;

        riwayatGaji[4][0] = 3_825_000; // rensi
        riwayatGaji[4][1] = 3_825_000;
        riwayatGaji[4][2] = 4_500_000;
    }

    public static void main(String[] args) {
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
                    userIndex = login();
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
                                        tabelListData("pegawai");
                                        break;
                                    case 2:
                                        System.out.println("==========================================");
                                        System.out.println("                DATA ADMIN                ");
                                        System.out.println("==========================================");
                                        tabelListData("admin");
                                        break;
                                    case 3:
                                        System.out.println("==========================================");
                                        System.out.println("             Data Role & Gaji Pokok       ");
                                        System.out.println("==========================================");
                                        tabelListData("role");
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
                                            counterIDPegawai++;
                                            counterPegawai = tambahData("pegawai", counterPegawai, counterIDPegawai);
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
                                            counterIDAdmin++;
                                            counterAdmin = tambahData("admin", counterAdmin, counterIDAdmin);
                                            counterData++;
                                        } else {
                                            System.out.println("Batas maksimum admin telah tercapai.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("==========================================");
                                        System.out.println("             Data Role & Gaji Pokok       ");
                                        System.out.println("==========================================");
                                        if (counterGaji < role.length) {
                                            tambahData("role", counterGaji, 0);
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
                                tabelListData("allData");
                                searchID();
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idSearch.toLowerCase())) {
                                        if (idSearch.toLowerCase().contains("a") && counterAdmin <= 1) {
                                            System.out.println(
                                                    "Batas minimum admin telah tercapai.\nData tidak dapat dihapus");
                                            found = true;
                                            break;
                                        }
                                        for (int j = i; j < counterData - 1; j++) {
                                            data[0][j] = data[0][j + 1];
                                            data[1][j] = data[1][j + 1];
                                            data[2][j] = data[2][j + 1];
                                            data[3][j] = data[3][j + 1];
                                            data[4][j] = data[4][j + 1];
                                            data[5][j] = data[5][j + 1];
                                            data[6][j] = data[6][j + 1];
                                            usernames[j] = usernames[j + 1];
                                            passwords[j] = passwords[j + 1];
                                        }
                                        for (int j = i; j < counterData; j++) {
                                            data[j][counterData - 1] = null;
                                            usernames[counterData - 1] = null;
                                            passwords[counterData - 1] = null;
                                        }
                                        if (idSearch.toLowerCase().contains("a")) {
                                            counterAdmin--;
                                        } else if (idSearch.toLowerCase().contains("p")) {
                                            counterPegawai--;
                                        }
                                        counterData--;
                                        System.out.println("Pegawai berhasil dihapus.");
                                        found = true;
                                        break;
                                    }
                                }
                                searchfalse();
                                break;
                            case 4:
                                tabelListData("allData");
                                searchID();
                                int columnToEdit;
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idSearch.toLowerCase())) {
                                        do {
                                            edited = true;
                                            System.out.println(
                                                    "1. Nama Lengkap\n2. Role\n3. Domisili\n4. Riwayat Penyakit\n5. Riwayat Pendidikan");
                                            System.out.println("==========================================");
                                            System.out.print("Pilih kolom yang akan diedit(1-5): ");
                                            columnToEdit = sc.nextInt();
                                            sc.nextLine(); // Membersihkan newline
                                            switch (columnToEdit) {
                                                case 1:
                                                    System.out.print("Nama Lengkap: ");
                                                    data[1][i] = sc.nextLine();
                                                    break;
                                                case 2:
                                                    System.out.print("Role (");
                                                    for (int j = 1; j < counterGaji; j++) {
                                                        System.out.print(
                                                                (j == counterGaji - 1) ? role[j] : role[j] + "/ ");
                                                    }
                                                    System.out.print("): ");
                                                    data[2][i] = sc.nextLine();
                                                    for (int j = 0; j < gajiRole.length; j++) {
                                                        if (data[2][i].equalsIgnoreCase(role[j])) {
                                                            gajiPokok[i] = gajiRole[j];
                                                        }
                                                    }
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
                                                    pilihanTidakValid();
                                                    break;
                                            }
                                            if (columnToEdit > 0 && columnToEdit <= 5) {
                                                System.out.println("Data berhasil diedit!");
                                            }
                                            found = true;
                                        } while (!edited);
                                    }
                                }
                                searchfalse();
                                break;
                            case 5:
                                tabelListData("allData");
                                searchID();
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idSearch.toLowerCase())) {
                                        int indexToPay = i;
                                        if (totalGaji[indexToPay] != 0) {
                                            System.out.println("Pegawai telah digaji sebelumnya");
                                        } else {
                                            do { // Izin
                                                System.out.print("Masukkan Jumlah Izin: ");
                                                izin[indexToPay] = sc.nextInt();
                                                if (izin[indexToPay] < 0 || izin[indexToPay] > 26) {
                                                    System.out.println("Mohon Masukkan Jumlah Izin yang Benar!");
                                                }
                                            } while (izin[indexToPay] < 0 || izin[indexToPay] > 26);

                                            do { // Lembur
                                                System.out.print("Masukkan Jumlah Lembur: ");
                                                lembur[indexToPay] = sc.nextInt();
                                                if (lembur[indexToPay] < 0 || lembur[indexToPay] > 4) {
                                                    System.out.println("Batasan lembur hanya mulai dari 0-4!");
                                                }
                                            } while (lembur[indexToPay] < 0 || lembur[indexToPay] > 4);
                                            tunjanganMakan[indexToPay] = gajiPokok[indexToPay] * 25 / 100;

                                            if (izin[indexToPay] == 0 && lembur[indexToPay] == 4) {
                                                bonus[indexToPay] = gajiPokok[indexToPay] * 5 / 100;
                                            } else {
                                                bonus[indexToPay] = 0;
                                            }

                                            gajiKotor[indexToPay] = (int) gajiPokok[indexToPay]
                                                    + tunjanganMakan[indexToPay]
                                                    + (lembur[indexToPay] * 150000) + bonus[indexToPay];

                                            totalGaji[indexToPay] = (int) gajiKotor[indexToPay]
                                                    - (izin[indexToPay] * 75000);
                                            System.out.println("Total Gaji: " + totalGaji[indexToPay]);
                                        }
                                        found = true;
                                    }
                                }
                                searchfalse();
                                break;
                            case 6:
                                tabelListData("allData");
                                searchID();
                                for (int i = 0; i < counterData; i++) {
                                    if (data[0][i].toLowerCase().contains(idSearch.toLowerCase())) {
                                        slipGaji(i);
                                        found = true;
                                    }
                                }
                                searchfalse();
                                break;
                            case 7:
                                System.out.println(
                                        "-------------------------------------------------------------------------------------");
                                System.out.printf("%-5s | %-20s | %-15s | %-15s | %-15s%n", "ID",
                                        "Nama Lengkap", "Total Lembur", "Total Izin", "Total Gaji");
                                System.out.println(
                                        "-------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-5s | %-20s | %-15s | %-15s | %-15s%n", data[0][i], data[1][i],
                                            lembur[i], izin[i], totalGaji[i]);
                                }
                                break;
                            case 8:
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------");
                                System.out.printf("%-5s | %-20s | %-13s | %-13s | %-13s | %-13s |%n", "ID",
                                        "Nama Lengkap", "September", "Oktober", "November", "Desember");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------");
                                for (int i = 0; i < counterData; i++) {
                                    System.out.printf("%-5s | %-20s | %-13s | %-13s | %-13s | %-13s |%n", data[0][i],
                                            data[1][i], riwayatGaji[i][0], riwayatGaji[i][1], riwayatGaji[i][2],
                                            totalGaji[i]);
                                }
                                break;
                            case 9:
                                System.out.println("Logging out...");
                                userIndex = -1;
                                break;
                            default:
                                System.out.println("Pilihan Tidak Valid");
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
                                System.out.println("ID Pegawai\t\t: " + data[0][userIndex]);
                                System.out.println("Nama Lengkap\t\t: " + data[1][userIndex]);
                                System.out.println("Role\t\t\t: " + data[2][userIndex]);
                                System.out.println("Nomor Telepon\t\t: " + data[6][userIndex]);
                                System.out.println("Domisili\t\t: " + data[3][userIndex]);
                                System.out.println("Riwayat Penyakit\t: " + data[4][userIndex]);
                                System.out.println("Riwayat Pendidikan\t: " + data[5][userIndex]);
                                break;

                            case 2:
                                edited = true;
                                do {
                                    System.out.println("\nID pegawai\t: " + data[0][userIndex]);
                                    System.out.println("Nama Pegawai\t: " + data[1][userIndex]);
                                    System.out.println("Domisili\t: " + data[3][userIndex]);
                                    System.out.println("Nomor Telepon\t: " + data[6][userIndex]);
                                    System.out.println();
                                    System.out.println("Masukkan data yang ingin di edit");
                                    for (int i = 0; i < menueditPegawai.length; i++) {
                                        System.out.println((i + 1) + ". " + menueditPegawai[i]);
                                    }
                                    System.out.print("--> ");
                                    ChoiceEditPegawai = sc.nextInt();
                                    sc.nextLine();

                                    switch (ChoiceEditPegawai) {
                                        case 1:
                                            System.out.println("Masukkan Domisili baru: ");
                                            data[3][userIndex] = sc.nextLine();
                                            System.out.println("Data Berhasil diedit");
                                            break;
                                        case 2:
                                            System.out.println("Masukkan Nomor Telepon baru: ");
                                            data[6][userIndex] = sc.nextLine();
                                            System.out.println("Data Berhasil diedit");
                                            break;
                                        default:
                                            pilihanTidakValid();
                                            break;
                                    }
                                } while (!edited);
                                break;
                            case 3:
                                slipGaji(userIndex);
                                break;
                            case 4:
                                System.out.println("ID Pegawai: " + data[0][userIndex]);
                                System.out.println("Nama Pegawai: " + data[1][userIndex]);
                                System.out.println(
                                        "----------------------------------------------------------------");
                                System.out.printf("| %-13s | %-13s | %-13s | %-13s |%n", "September", "Oktober",
                                        "November", "Desember");
                                System.out.println(
                                        "---------------------------------------------------------------");
                                System.out.printf("| %-13s | %-13s | %-13s | %-13s |%n", riwayatGaji[userIndex][0],
                                        riwayatGaji[userIndex][1], riwayatGaji[userIndex][2], totalGaji[userIndex]);
                                System.out.println(
                                        "----------------------------------------------------------------");
                                break;
                            case 5:
                                System.out.println("Logging out...");
                                userIndex = -1;
                                break;
                            default:
                                System.out.println("Pilihan Tidak Valid");
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
            }
        } while (choiceLogin != 2);
        sc.close();

    }

    static int login() {
        int userIndex = -1;
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Masukkan username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan password: ");
            String password = new String(System.console().readPassword());

            for (int i = 0; i < usernames.length; i++) {
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    userIndex = i;
                    break;
                }
            }

            if (userIndex != -1) {
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
        return userIndex;
    }

    static void tabelListData(String status) {
        if (status.equals("pegawai") || status.equals("admin") || status.equals("allData")) {
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-15s | %-15s | %-10s | %-18s | %-20s%n",
                    "ID",
                    "Nama Lengkap", "Nomor Telepon", "Role", "Domisili", "Riwayat Penyakit",
                    "Riwayat Pendidikan");
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------------");
            if (status.equalsIgnoreCase("pegawai")) {
                for (int i = 0; i < counterData; i++) {
                    if (!(data[2][i].equalsIgnoreCase(role[0]))) {
                        System.out.printf("%-5s | %-20s | %-15s | %-15s | %-10s | %-18s | %-30s%n",
                                data[0][i], data[1][i], data[6][i], data[2][i], data[3][i], data[4][i],
                                data[5][i]);
                    }
                }
            } else if (status.equalsIgnoreCase("admin")) {
                for (int i = 0; i < counterData; i++) {
                    if (data[2][i].equalsIgnoreCase(role[0])) {
                        System.out.printf("%-5s | %-20s | %-15s | %-15s | %-10s | %-18s | %-30s%n",
                                data[0][i], data[1][i], data[6][i], data[2][i], data[3][i], data[4][i],
                                data[5][i]);
                    }
                }
            } else {
                for (int i = 0; i < counterData; i++) {
                    System.out.printf("%-5s | %-20s | %-15s | %-15s | %-10s | %-18s | %-30s%n",
                            data[0][i], data[1][i], data[6][i], data[2][i], data[3][i], data[4][i],
                            data[5][i]);
                }
            }
        } else {
            System.out.println(
                    "-----------------------------------------------");
            System.out.printf("| %-20s | %-20s | %n", "Role", "Gaji Pokok");
            System.out.println(
                    "-----------------------------------------------");
            for (int i = 0; i < counterGaji; i++) {
                System.out.printf("| %-20s | %-20d | %n", role[i], gajiRole[i]);
            }
            System.out.println(
                    "-----------------------------------------------");
        }
    }

    static int tambahData(String status, int counter, int counterID) {
        counter++;
        if (status.equalsIgnoreCase("pegawai") || status.equalsIgnoreCase("admin")) {
            data[0][counterData] = (status.equalsIgnoreCase("pegawai")) ? "P10" + counterID : "A10" + counterID;
            System.out.println((status.equalsIgnoreCase("pegawai")) ? "ID Pegawai: " + data[0][counterData]
                    : "ID Admin: " + data[0][counterData]);
            if (status.equalsIgnoreCase("pegawai")) {
                System.out.print("Role (");
                for (int j = 1; j < counterGaji; j++) {
                    System.out.print((j == counterGaji - 1) ? role[j] : role[j] + "/ ");
                }
                System.out.print("): ");
                data[2][counterData] = sc.nextLine();
                for (int i = 0; i < role.length; i++) {
                    if (role[i].toLowerCase().contains(data[2][counterData].toLowerCase())) {
                        gajiPokok[counterData] = gajiRole[i];
                        break;
                    }
                }
            } else {
                data[2][counterData] = data[2][0];
                gajiPokok[counterData] = gajiRole[0];
            }

            System.out.print("Nama Lengkap: ");
            data[1][counterData] = sc.nextLine();
            System.out.print("Nomor Telepon: ");
            data[6][counterData] = sc.nextLine();
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
        } else {
            System.out.print("Role: ");
            role[counterGaji] = sc.nextLine();
            System.out.print("Gaji Pokok: ");
            gajiRole[counterGaji] = sc.nextInt();
            sc.nextLine();
        }
        return counter;
    }

    static void searchID() {
        System.out.println("Masukkan ID yang ingin dieksekusi: ");
        idSearch = sc.nextLine();
        found = false;
    }

    static void searchfalse() {
        if (!found) {
            System.out.println("Data tidak ditemukan!");
        }
    }

    static void pilihanTidakValid() {
        System.out.println("Pilihan tidak valid");
        System.out.println("Apakah anda ingin mengedit ulang? (y/n)");
        System.out.print("--> ");
        char edit = sc.next().charAt(0);
        if (edit == 'y' || edit == 'Y') {
            edited = false;
        } else {
            edited = true;
        }
    }

    static void slipGaji(int userIndex) {
        System.out.println("\n========== SLIP GAJI ==========");
        System.out.println("ID Karyawan: " + data[0][userIndex]);
        System.out.println("Nama Karyawan: " + data[1][userIndex]);
        System.out.println("===============================");
        System.out.println("Gaji Pokok: Rp" + gajiPokok[userIndex]);
        System.out.println("Tunjangan Makan: Rp" + tunjanganMakan[userIndex]);
        System.out.println("Lembur: " + lembur[userIndex] + " hari");
        System.out.println("Lembur : " + lembur[userIndex] + " hari x Rp150000 = Rp" + (lembur[userIndex] * 150000));
        System.out.println("Bonus: Rp" + bonus[userIndex]);
        System.out.println();
        System.out.println("Gaji Kotor: Rp" + gajiKotor[userIndex]);
        System.out.println("===============================");
        System.out.println("Rincian Potongan: ");
        System.out.println("Izin: " + izin[userIndex] + " hari");
        System.out.println("Potongan : " + izin[userIndex] + " hari x Rp75000 = Rp" + (izin[userIndex] * 75000));
        System.out.println("Total Potongan: Rp" + (izin[userIndex] * 75000));
        System.out.println("===============================");
        System.out.println("Total Gaji: Rp" + totalGaji[userIndex]);
        System.out.println("======== TERIMA  KASIH ========");
    }
}
