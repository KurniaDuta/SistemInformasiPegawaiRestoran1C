package Penggajian;

import java.util.Scanner;

public class PenggajianPegawai {
    public static void main(String[] args) {

        // Inisialisasi Scanner
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);

        // Inisialisasi variabel
        String username = "admin1", password = "admin1", namaPegawai, domisili, pendidikan, penyakit, role;
        char pilihMenu, back;
        int gajiPokok = 4000000, jmlIzin, nominalIzin = 100000, gajiAkhir, potIzin,
                intensifLembur = 25000, jmlLembur,
                gajiLembur, shiftMasuk, pilihRole;

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

            pilihMenu = inputNum.next().charAt(0);
            switch (pilihMenu) {
                case '1':
                    System.out.println("\n***** Menu List Data Pegawai *****");
                    System.out.println("=========================================");
                    System.out.println("\t    Work In Progress");
                    System.out.println("=========================================");
                    break;
                case '2':
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
