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
                    do {

                        System.out.println("Menu:");
                        System.out.println("1. Data Pegawai");
                        System.out.println("2. Tambah Data Pegawai");
                        System.out.println("3. Hapus Pegawai");
                        System.out.println("4. Update Data Pegawai");
                        System.out.println("5. Pencarian");
                        System.out.println("6. Keluar");
                        System.out.print("Pilihan: ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }
                                break;
                            case 2:
                                if (employeeCount < fullNames.length) {
                                    scanner.nextLine(); // Membersihkan newline
                                    System.out.print("Nama Lengkap: ");
                                    fullNames[employeeCount] = scanner.nextLine();
                                    System.out.print("Role (admin/manajer/chef/pelayan): ");
                                    roles[employeeCount] = scanner.nextLine();
                                    System.out.print("Domisili: ");
                                    domisilis[employeeCount] = scanner.nextLine();
                                    System.out.print("Riwayat Penyakit: ");
                                    riwayatPenyakits[employeeCount] = scanner.nextLine();
                                    System.out.print("Riwayat Pendidikan: ");
                                    riwayatPendidikans[employeeCount] = scanner.nextLine();

                                    employeeCount++;
                                } else {
                                    System.out.println("Batas maksimum pegawai telah tercapai.");
                                }
                                break;
                            case 3:
                                // menampilkan data pegawai
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }

                                // proses hapus data pegawai
                                System.out.print("Nomor Pegawai yang Akan Dihapus: ");
                                int numberToDelete = scanner.nextInt();
                                if (numberToDelete >= 1 && numberToDelete <= employeeCount) {
                                    int indexToDelete = numberToDelete - 1;
                                    for (int i = indexToDelete; i < employeeCount - 1; i++) {
                                        fullNames[i] = fullNames[i + 1];
                                        roles[i] = roles[i + 1];
                                        domisilis[i] = domisilis[i + 1];
                                        riwayatPenyakits[i] = riwayatPenyakits[i + 1];
                                        riwayatPendidikans[i] = riwayatPendidikans[i + 1];
                                    }
                                    // Membersihkan data pegawai yang terakhir
                                    fullNames[employeeCount - 1] = null;
                                    roles[employeeCount - 1] = null;
                                    domisilis[employeeCount - 1] = null;
                                    riwayatPenyakits[employeeCount - 1] = null;
                                    riwayatPendidikans[employeeCount - 1] = null;
                                    employeeCount--;
                                    System.out.println("Pegawai berhasil dihapus.");
                                } else {
                                    System.out.println("Indeks pegawai tidak valid.");
                                }
                                break;
                            case 4:
                                // menampilkan data pegawai
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }

                                // Proses update data pegawai
                                System.out.print("Nomor Pegawai yang Akan Diedit: ");
                                int numberToEdit = scanner.nextInt();
                                if (numberToEdit >= 1 && numberToEdit <= employeeCount) {
                                    int indexToEdit = numberToEdit - 1;
                                    System.out.println(
                                            "1. Nama Lengkap\n2. Role\n3. Domisili\n4. Riwayat Penyakit\n5. Riwayat Pendidikan");
                                    System.out.println("Pilih kolom yang akan diedit(1-5): ");
                                    int columnToEdit = scanner.nextInt();
                                    scanner.nextLine(); // Membersihkan newline
                                    switch (columnToEdit) {
                                        case 1:
                                            System.out.print("Nama Lengkap: ");
                                            fullNames[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 2:
                                            System.out.print("Role (admin/manajer/chef/pelayan): ");
                                            roles[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 3:
                                            System.out.print("Domisili: ");
                                            domisilis[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 4:
                                            System.out.print("Riwayat Penyakit: ");
                                            riwayatPenyakits[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 5:
                                            System.out.print("Riwayat Pendidikan: ");
                                            riwayatPendidikans[indexToEdit] = scanner.nextLine();
                                            break;
                                        default:
                                            break;
                                    }
                                    System.out.println("Pegawai berhasil diedit.");
                                } else {
                                    System.out.println("Nomor pegawai tidak valid.");
                                }
                                break;
                            case 5:
                                scanner.nextLine(); // Membersihkan newline
                                boolean found = false;
                                System.out.print("Masukkan Nama Pegawai yang Dicari: ");
                                String search = scanner.nextLine();
                                for (int i = 0; i < employeeCount; i++) {
                                    if (fullNames[i].toLowerCase().contains(search.toLowerCase())) {
                                        System.out.println("Data Pegawai dengan Nama yang Dicari:");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "Urutan",
                                                "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                                "Riwayat Pendidikan");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                                i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                                riwayatPendidikans[i]);
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Data tidak ditemukan.");
                                }
                                break;
                            case 6:
                                System.out.println("Terima kasih");
                                System.exit(0);
                                break;

                            default:
                                break;
                        }

                        System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                        back = scanner.next().charAt(0);
                    } while (back == 'y' || back == 'Y');

                } else if (userLevel.equalsIgnoreCase("Manager")) {
                    do {

                        System.out.println("Menu:");
                        System.out.println("1. Data Pegawai");
                        System.out.println("2. Tambah Data Pegawai");
                        System.out.println("3. Hapus Pegawai");
                        System.out.println("4. Update Data Pegawai");
                        System.out.println("5. Input Gaji Pokok");
                        System.out.println("6. Penggajian Karyawan");
                        System.out.println("7. Cetak Slip gaji");
                        System.out.println("8. Pencarian");
                        System.out.println("9. Keluar");
                        System.out.print("Pilihan: ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }
                                break;
                            case 2:
                                if (employeeCount < fullNames.length) {
                                    scanner.nextLine(); // Membersihkan newline
                                    System.out.print("Nama Lengkap: ");
                                    fullNames[employeeCount] = scanner.nextLine();
                                    System.out.print("Role (" + roleList[0] + "/" + roleList[1] + "/" + roleList[2]
                                            + "/" + roleList[3] + "): ");
                                    roles[employeeCount] = scanner.nextLine();
                                    System.out.print("Domisili: ");
                                    domisilis[employeeCount] = scanner.nextLine();
                                    System.out.print("Riwayat Penyakit: ");
                                    riwayatPenyakits[employeeCount] = scanner.nextLine();
                                    System.out.print("Riwayat Pendidikan: ");
                                    riwayatPendidikans[employeeCount] = scanner.nextLine();

                                    employeeCount++;
                                } else {
                                    System.out.println("Batas maksimum pegawai telah tercapai.");
                                }
                                break;
                            case 3:
                                // menampilkan data pegawai
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }

                                // proses hapus data pegawai
                                System.out.print("Nomor Pegawai yang Akan Dihapus: ");
                                int numberToDelete = scanner.nextInt();
                                if (numberToDelete >= 1 && numberToDelete <= employeeCount) {
                                    int indexToDelete = numberToDelete - 1;
                                    for (int i = indexToDelete; i < employeeCount - 1; i++) {
                                        fullNames[i] = fullNames[i + 1];
                                        roles[i] = roles[i + 1];
                                        domisilis[i] = domisilis[i + 1];
                                        riwayatPenyakits[i] = riwayatPenyakits[i + 1];
                                        riwayatPendidikans[i] = riwayatPendidikans[i + 1];
                                    }
                                    // Membersihkan data pegawai yang terakhir
                                    fullNames[employeeCount - 1] = null;
                                    roles[employeeCount - 1] = null;
                                    domisilis[employeeCount - 1] = null;
                                    riwayatPenyakits[employeeCount - 1] = null;
                                    riwayatPendidikans[employeeCount - 1] = null;
                                    employeeCount--;
                                    System.out.println("Pegawai berhasil dihapus.");
                                } else {
                                    System.out.println("Indeks pegawai tidak valid.");
                                }
                                break;
                            case 4:
                                // menampilkan data pegawai
                                System.out.println("Data Pegawai:");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "No",
                                        "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit", "Riwayat Pendidikan");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------");
                                for (int i = 0; i < employeeCount; i++) {
                                    System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                            i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                            riwayatPendidikans[i]);
                                }

                                // Proses update data pegawai
                                System.out.print("Nomor Pegawai yang Akan Diedit: ");
                                int numberToEdit = scanner.nextInt();
                                if (numberToEdit >= 1 && numberToEdit <= employeeCount) {
                                    int indexToEdit = numberToEdit - 1;
                                    System.out.println(
                                            "1. Nama Lengkap\n2. Role\n3. Domisili\n4. Riwayat Penyakit\n5. Riwayat Pendidikan");
                                    System.out.println("Pilih kolom yang akan diedit(1-5): ");
                                    int columnToEdit = scanner.nextInt();
                                    scanner.nextLine(); // Membersihkan newline
                                    switch (columnToEdit) {
                                        case 1:
                                            System.out.print("Nama Lengkap: ");
                                            fullNames[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 2:
                                            System.out.print("Role (" + roleList[0] + "/" + roleList[1] + "/"
                                                    + roleList[2] + "/" + roleList[3] + "): ");
                                            roles[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 3:
                                            System.out.print("Domisili: ");
                                            domisilis[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 4:
                                            System.out.print("Riwayat Penyakit: ");
                                            riwayatPenyakits[indexToEdit] = scanner.nextLine();
                                            break;
                                        case 5:
                                            System.out.print("Riwayat Pendidikan: ");
                                            riwayatPendidikans[indexToEdit] = scanner.nextLine();
                                            break;
                                        default:
                                            break;
                                    }
                                    System.out.println("Pegawai berhasil diedit.");
                                } else {
                                    System.out.println("Nomor pegawai tidak valid.");
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                scanner.nextLine(); // Membersihkan newline
                                boolean found = false;
                                System.out.print("Masukkan Nama Pegawai yang Dicari: ");
                                String search = scanner.nextLine();
                                for (int i = 0; i < employeeCount; i++) {
                                    if (fullNames[i].toLowerCase().contains(search.toLowerCase())) {
                                        System.out.println("Data Pegawai dengan Nama yang Dicari:");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10s | %-20s | %-10s | %-20s | %-20s | %-30s%n", "Urutan",
                                                "Nama Lengkap", "Role", "Domisili", "Riwayat Penyakit",
                                                "Riwayat Pendidikan");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------");
                                        System.out.printf("%-10d | %-20s | %-10s | %-20s | %-20s | %-30s%n",
                                                i + 1, fullNames[i], roles[i], domisilis[i], riwayatPenyakits[i],
                                                riwayatPendidikans[i]);
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Data tidak ditemukan.");
                                }
                                break;
                            case 9:
                                System.out.println("Terima kasih");
                                System.exit(0);
                                break;
                            default:
                                break;
                        }

                        System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                        back = scanner.next().charAt(0);
                    } while (back == 'y' || back == 'Y');
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