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
    }
}
