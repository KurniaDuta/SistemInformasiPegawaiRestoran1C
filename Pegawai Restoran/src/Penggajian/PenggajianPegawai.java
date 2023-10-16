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
        char pilihMenu, back;
        int gajiPokok = 4000000, jmlIzin, nominalIzin = 100000, gajiAkhir, potIzin,
                intensifLembur = 25000, jmlLembur,
                gajiLembur, shiftMasuk, pilihRole;

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
                            System.out.println("****Menu Menambah Data Pegawai****");

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

                            System.out.println("\n***Data telah ditambahkan***");

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

                            // Penggajian Pegawai
                            System.out.println("======================================");
                            System.out.println("          Penggajian Pegawai         ");
                            System.out.println("======================================");
                            System.out.print("Masukkan Nama Pegawai: ");
                            namaPegawai = inputText.nextLine();
                            System.out.print("Masukkan jumlah izin (shift) : ");
                            jmlIzin = inputNum.nextInt();
                            System.out.print("Masukkan jumlah lembur (jam): ");
                            jmlLembur = inputNum.nextInt();

                            shiftMasuk = 30 - jmlIzin;
                            potIzin = jmlIzin * nominalIzin;
                            gajiLembur = jmlLembur * intensifLembur;
                            gajiAkhir = gajiPokok - potIzin + gajiLembur;

                            System.out.println("\n\n\n==============================================================");
                            System.out.println("                 Slip Gaji Pegawai Restoran 1C                ");
                            System.out.println("==============================================================\n");
                            System.out.println("Nama Pegawai\t: " + namaPegawai);
                            System.out.println("Shift Masuk\t: " + shiftMasuk + " shift");
                            System.out.println("Shift Izin\t: " + jmlIzin + " shift");
                            System.out.println("Lembur\t\t: " + jmlLembur + " jam\n");
                            System.out.println("==============================================================\n");
                            System.out.println("Gaji Pokok\t: " + gajiPokok);
                            System.out.println("Potongan izin\t: " + potIzin);
                            System.out.println("Gaji Lembur\t: " + gajiLembur + "\n");
                            System.out.println("==============================================================\n");
                            System.out.println("Total Gaji Akhir: " + "Rp " + gajiAkhir + "\n");
                            System.out.println("==============================================================");

                            break;
                        default:
                            System.out.println("\nMenu yang anda pilih tidak ditemukan! Mohon re-run codingan anda");
                    }
                    System.out.println("Apakah anda ingin kembali ke menu? (y/n)");
                    back = inputNum.next().charAt(0);
                } while (back == 'y' || back == 'Y');
                
            } else {
                System.out.println("\n\t\t\t  Login Gagal. " + (3 - attempt) + " kali percobaan lagi");
                if (attempt == 3) {
                    System.out.println("\n\t\t Maximum percobaan login telah tercapai. Silahkan coba lagi nanti");
                }
            }
        }
    }
}
