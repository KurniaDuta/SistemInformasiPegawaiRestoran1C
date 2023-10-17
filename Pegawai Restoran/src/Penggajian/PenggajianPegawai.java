package Penggajian;

import java.util.Scanner;

public class PenggajianPegawai {
    public static void main(String[] args) {

        // Inisialisasi Scanner
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);

        // Inisialisasi variabel
        String username1 = "admin1", password1 = "admin1", username2 = "admin2", password2 = "admin2", namaPegawai,
                domisili, pendidikan, penyakit, role;
        char pilihMenu, back, pilihPegawaiPenggajian, pilihPegawaiSlip;
        int pilihRole;

        // Nama Pegawai
        String namaPegawai1 = "Duta Kurnia Ardhani", namaPegawai2 = "Nakita Gayuh Cakrawala",
                namaPegawai3 = "Pramudya Surya Anggara Putra", namaPegawai4 = "Rensi Meila Yulvinata";

        // Role
        String role1 = "Direktur", role2 = "Manager", role3 = "Kasir", role4 = "Koki";

        // Gaji per role
        int gajiRole1 = 0, gajiRole2 = 0, gajiRole3 = 0, gajiRole4 = 0;

        // Penggajian
        int gajiPokok = 0, gajiAkhir, tunjangan = 0, potongan = 0, totalPotongan = 0, gajiLembur = 0, totalLembur,
                bonus = 0;

        // izin/lembur
        int izin, lembur, masuk;
        int izin1 = 0, izin2 = 0, lembur1 = 0, lembur2 = 0, lembur3 = 0, lembur4 = 0;

        // tunjangan
        int tunjangan1 = 0, tunjangan2 = 0, tunjangan3 = 0, tunjangan4 = 0;

        // bonus
        int bonus3 = 0, bonus4 = 0;

        // Masuk
        int masuk3 = 0, masuk4 = 0;

        // Gaji lembur
        int totalLembur1 = 0, totalLembur2 = 0, totalLembur3 = 0, totalLembur4 = 0;

        // Potongan
        int totalPotongan1 = 0, totalPotongan2 = 0;

        // Gaji pokok
        int gajiPokok1 = 0, gajiPokok2 = 0, gajiPokok3 = 0, gajiPokok4 = 0;

        // Gaji Cashier & Chef
        int gaji;

        // Login
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println(
                    "\n================================== Sistem Pegawai Restoran 1C =================================");
            System.out.print("\t\t\t        Enter username: ");
            String enteredUsername = inputText.nextLine();

            System.out.print("\t\t\t        Enter password: ");
            String enteredPassword = inputText.nextLine();

            if (enteredUsername.equals(username1) && enteredPassword.equals(password1)
                    || enteredUsername.equals(username2) && enteredPassword.equals(password2)) {
                System.out.println("\n\t\t\t      Welcome to Sistem Pegawai, " + enteredUsername + "!");

                // List Menu
                do {

                    System.out.println(
                            "\n===============================================================================================");
                    System.out.println("\t\t\t\tMENU SISTEM PEGAWAI RESTORAN 1C");
                    System.out.println(
                            "===============================================================================================");
                    System.out.println("\t\t\t\t1. List Data Pegawai");
                    System.out.println("\t\t\t\t2. Tambah Data Pegawai");
                    System.out.println("\t\t\t\t3. Ubah Data Pegawai");
                    System.out.println("\t\t\t\t4. Hapus Data Pegawai");
                    System.out.println("\t\t\t\t5. Penggajian Pegawai");
                    System.out.println("\t\t\t\t6. Slip Gaji Pegawai");
                    System.out.println(
                            "===============================================================================================");
                    System.out.print("\t\t\t   Pilih menu yang anda inginkan (1-5) : ");

                    pilihMenu = inputNum.next().charAt(0);

                    switch (pilihMenu) {
                        case '1':
                            // Data Pegawai
                            System.out.println("***** Menu List Data Pegawai *****\n");
                            System.out.println(
                                    "====================================================================================================================");
                            System.out.println(
                                    "| Pegawai Satu\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
                            System.out.println(
                                    "| Pegawai Dua\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
                            System.out.println(
                                    "| Pegawai Tiga\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
                            System.out.println(
                                    "| Pegawai Empat\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
                            System.out.println(
                                    "| Pegawai Lima\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
                            System.out.println(
                                    "====================================================================================================================");
                            break;
                        case '2':
                            // Tambah Data
                            char tambahPegawai;
                            do {
                                System.out.println("Menu Menambah Data Pegawai");

                                System.out.println("\nMasukkan nama pegawai : ");
                                namaPegawai = inputText.nextLine();

                                System.out.println("\nPilih Role : ");
                                System.out.println("1. Role 1");
                                System.out.println("2. Role 2");
                                System.out.println("3. Role 3");
                                System.out.println("4. Role 4");
                                pilihRole = inputNum.nextInt();

                                System.out.println("\nMasukkan Domisili pegawai : ");
                                domisili = inputText.nextLine();

                                System.out.println("\nMasukkan Riwayat Pendidikan : ");
                                pendidikan = inputText.nextLine();
                                System.out.println("\nMasukkan Riwayat Penyakit : ");
                                penyakit = inputText.nextLine();

                                switch (pilihRole) {
                                    case 1:
                                        role = "Role 1";
                                        break;
                                    case 2:
                                        role = "Role 2";
                                        break;
                                    case 3:
                                        role = "Role 3";
                                        break;
                                    case 4:
                                        role = "Role 4";
                                        break;
                                    default:
                                        role = "Role Invalid";
                                        break;
                                }

                                System.out.println("================================");
                                System.out.println("| Nama Pegawai        : " + namaPegawai);
                                System.out.println("| Role                : " + role);
                                System.out.println("| Domisili            : " + domisili);
                                System.out.println("| Riwayat Pendidikan  : " + pendidikan);
                                System.out.println("| Riwayat penyakit    : " + penyakit);
                                System.out.println("================================");

                                System.out.println("\nData telah ditambahkan");
                                System.out.print("Apakah anda ingin menambakan data lagi (y/t)");
                                tambahPegawai = inputNum.next().charAt(0);
                            } while (tambahPegawai == 'y' || tambahPegawai == 'Y');
                            break;
                        case '3':
                            System.out.println("\n***** Menu Ubah Data Pegawai *****");
                            System.out.println("=========================================");
                            System.out.println("\t    Work In Progress");
                            System.out.println("=========================================");
                            break;
                        case '4':
                            System.out.println("\n***** Menu Hapus Data Pegawai ****");
                            System.out.println("=========================================");
                            System.out.println("\t    Work In Progress");
                            System.out.println("=========================================");
                            break;
                        case '5':
                            System.out.println("======================================");
                            System.out.println("          Penggajian Pegawai         ");
                            System.out.println("======================================");
                            System.out.println("1. " + namaPegawai1 + "\t\t - " + role1);
                            System.out.println("2. " + namaPegawai2 + "\t - " + role2);
                            System.out.println("3. " + namaPegawai3 + "\t - " + role3);
                            System.out.println("4. " + namaPegawai4 + "\t - " + role4);

                            System.out.println("\n\n======================================");
                            System.out.print("Pilih Pegawai(1-4): ");
                            pilihPegawaiPenggajian = inputText.nextLine().charAt(0);
                            System.out.println("======================================");

                            switch (pilihPegawaiPenggajian) {
                                case '1':
                                    System.out.print("Masukkan jumlah izin: ");
                                    izin = inputNum.nextInt();
                                    System.out.print("Masukkan jumlah lembur: ");
                                    lembur = inputNum.nextInt();

                                    gajiPokok = 15_000_000;
                                    tunjangan = 5_000_000;
                                    gajiLembur = 100_000;
                                    potongan = 100_000;

                                    totalPotongan = izin * potongan;
                                    totalLembur = lembur * gajiLembur;

                                    gajiAkhir = gajiPokok + tunjangan - totalPotongan + totalLembur;
                                    System.out.println("Total Gaji: " + gajiAkhir);

                                    lembur1 = lembur;
                                    izin1 = izin;
                                    totalPotongan1 = totalPotongan;
                                    totalLembur1 = totalLembur;
                                    tunjangan1 = tunjangan;
                                    gajiPokok1 = gajiPokok;
                                    gajiRole1 = gajiAkhir;
                                    break;

                                case '2':
                                    System.out.print("Masukkan jumlah izin: ");
                                    izin = inputNum.nextInt();
                                    System.out.print("Masukkan jumlah lembur: ");
                                    lembur = inputNum.nextInt();

                                    gajiPokok = 15_000_000;
                                    tunjangan = 5_000_000;
                                    gajiLembur = 100_000;
                                    potongan = 100_000;

                                    totalPotongan = izin * potongan;
                                    totalLembur = lembur * gajiLembur;

                                    gajiAkhir = gajiPokok + tunjangan - totalPotongan + totalLembur;
                                    System.out.println("Total Gaji: " + gajiAkhir);

                                    lembur2 = lembur;
                                    izin2 = izin;
                                    totalPotongan2 = totalPotongan;
                                    totalLembur2 = totalLembur;
                                    tunjangan2 = tunjangan;
                                    gajiPokok2 = gajiPokok;
                                    gajiRole2 = gajiAkhir;
                                    break;

                                case '3':
                                    System.out.print("Masukkan jumlah masuk: ");
                                    masuk = inputNum.nextInt();
                                    System.out.print("Masukkan jumlah lembur: ");
                                    lembur = inputNum.nextInt();

                                    gaji = 100_000;
                                    gajiPokok = masuk * gaji;
                                    gajiLembur = 100_000;
                                    totalLembur = lembur * gajiLembur;
                                    tunjangan = 0;

                                    if (masuk > 30) {
                                        bonus = 300_000;
                                        tunjangan = 1_000_000;
                                    }

                                    gajiAkhir = gajiPokok + tunjangan + totalLembur + bonus;
                                    System.out.println("Total Gaji: " + gajiAkhir);

                                    lembur3 = lembur;
                                    totalLembur3 = totalLembur;
                                    tunjangan3 = tunjangan;
                                    gajiPokok3 = gajiPokok;
                                    bonus3 = bonus;
                                    masuk3 = masuk;
                                    gajiRole3 = gajiAkhir;

                                    break;
                                case '4':
                                    System.out.print("Masukkan jumlah masuk: ");
                                    masuk = inputNum.nextInt();
                                    System.out.print("Masukkan jumlah lembur: ");
                                    lembur = inputNum.nextInt();

                                    gaji = 100_000;
                                    gajiPokok = masuk * gaji;
                                    gajiLembur = 100_000;
                                    totalLembur = lembur * gajiLembur;
                                    tunjangan = 0;

                                    if (masuk > 30) {
                                        bonus = 300_000;
                                        tunjangan = 1_000_000;
                                    }

                                    gajiAkhir = gajiPokok + tunjangan + totalLembur + bonus;
                                    System.out.println("Total Gaji: " + gajiAkhir);
                                    lembur4 = lembur;
                                    totalLembur4 = totalLembur;
                                    tunjangan4 = tunjangan;
                                    bonus4 = bonus;
                                    masuk4 = masuk;
                                    gajiPokok4 = gajiPokok;
                                    gajiRole4 = gajiAkhir;
                                    break;

                                default:
                                    System.out.println("Karyawan tidak ditemukan!");
                                    break;
                            }
                            break;
                        case '6':
                            System.out.println("======================================");
                            System.out.println("        Cetak Slip Gaji Pegawai       ");
                            System.out.println("======================================");
                            System.out.println("1. " + namaPegawai1 + "\t\t - " + role1);
                            System.out.println("2. " + namaPegawai2 + "\t - " + role2);
                            System.out.println("3. " + namaPegawai3 + "\t - " + role3);
                            System.out.println("4. " + namaPegawai4 + "\t - " + role4);

                            System.out.println("\n\n======================================");
                            System.out.print("Pilih Pegawai(1-4): ");
                            pilihPegawaiSlip = inputText.nextLine().charAt(0);
                            System.out.println("======================================");

                            switch (pilihPegawaiSlip) {
                                case '1':
                                    System.out.println("Nama Pegawai\t: " + namaPegawai1);
                                    System.out.println("Total Izin\t: " + izin1 + " shift");
                                    System.out.println("Lembur\t\t: " + lembur1 + " jam\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Gaji Pokok\t: " + gajiPokok1);
                                    System.out.println("Potongan\t: " + totalPotongan1);
                                    System.out.println("Tunjangan\t: " + tunjangan1);
                                    System.out.println("Gaji Lembur\t: " + totalLembur1 + "\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Total Gaji Akhir: " + "Rp " + gajiRole1 + "\n");
                                    System.out
                                            .println("======================================");
                                    break;
                                case '2':
                                    System.out.println("Nama Pegawai\t: " + namaPegawai2);
                                    System.out.println("Total Izin\t: " + izin2 + " shift");
                                    System.out.println("Lembur\t\t: " + lembur2 + " jam\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Gaji Pokok\t: " + gajiPokok2);
                                    System.out.println("Potongan\t: " + totalPotongan2);
                                    System.out.println("Tunjangan\t: " + tunjangan2);
                                    System.out.println("Gaji Lembur\t: " + totalLembur2 + "\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Total Gaji Akhir: " + "Rp " + gajiRole2 + "\n");
                                    System.out
                                            .println("======================================");
                                    break;
                                case '3':
                                    System.out.println("Nama Pegawai\t: " + namaPegawai3);
                                    System.out.println("Shift Masuk\t: " + masuk3 + " shift");
                                    System.out.println("Lembur\t\t: " + lembur3 + " jam\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Gaji Pokok\t: " + gajiPokok3);
                                    System.out.println("Tunjangan\t: " + tunjangan3);
                                    System.out.println("Bonus\t\t: " + bonus3);
                                    System.out.println("Gaji Lembur\t: " + totalLembur3 + "\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Total Gaji Akhir: " + "Rp " + gajiRole3 + "\n");
                                    System.out
                                            .println("======================================");
                                    break;
                                case '4':
                                    System.out.println("Nama Pegawai\t: " + namaPegawai4);
                                    System.out.println("Shift Masuk\t: " + masuk4 + " shift");
                                    System.out.println("Lembur\t\t: " + lembur4 + " jam\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Gaji Pokok\t: " + gajiPokok4);
                                    System.out.println("Tunjangan\t\t: " + tunjangan4);
                                    System.out.println("Bonus\t\t: " + bonus4);
                                    System.out.println("Gaji Lembur\t: " + totalLembur4 + "\n");
                                    System.out.println(
                                            "======================================\n");
                                    System.out.println("Total Gaji Akhir: " + "Rp " + gajiRole4 + "\n");
                                    System.out
                                            .println("======================================");
                                    break;

                                default:
                                    System.out.println("Karyawan tidak ditemukan!");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("\nMenu yang anda pilih tidak ditemukan! Mohon re-run codingan anda");
                    }
                    System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                    back = inputNum.next().charAt(0);
                } while (back == 'y' || back == 'Y');
                break;
            } else {
                System.out.println("\n\t\t\t  Login Gagal. " + (3 - attempt) + " kali percobaan lagi");
                if (attempt == 3) {
                    System.out.println("\n\t\t Maximum percobaan login telah tercapai. Silahkan coba lagi nanti");
                }
            }
        }
    }
}
