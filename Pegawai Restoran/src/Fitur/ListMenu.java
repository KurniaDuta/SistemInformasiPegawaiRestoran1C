import java.util.Scanner;

public class ListMenu {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Print line
        System.out.println("=========================================");
        System.out.println("           MENU SISTEM KARYAWAN          ");
        System.out.println("=========================================");
        System.out.println("1. List Data Karyawan");
        System.out.println("2. Tambah Data Karyawan");
        System.out.println("3. Ubah Data Karyawan");
        System.out.println("4. Hapus Data Karyawan");
        System.out.println("5. Sistem Gaji");
        System.out.println("=========================================");
        System.out.println("   Pilih menu yang anda inginkan (1-5) : ");

        char pilihMenu = sc.next().charAt(0);
        switch (pilihMenu) {
            case '1':
                System.out.println("***** Menu List Data Pegawai *****");
                System.out.println("=========================================");
                System.out.println("\t    Work In Progress");
                System.out.println("=========================================");
                break;
            case '2':
                System.out.println("***** Menu Tambah Data Pegawai *****");
                System.out.println("=========================================");
                System.out.println("\t    Work In Progress");
                System.out.println("=========================================");
                break;
            case '3':
                System.out.println("***** Menu Ubah Data Pegawai *****");
                System.out.println("=========================================");
                System.out.println("\t    Work In Progress");
                System.out.println("=========================================");
                break;
            case '4':
                System.out.println("***** Menu Hapus Data Karyawan ****");
                System.out.println("=========================================");
                System.out.println("\t    Work In Progress");
                System.out.println("=========================================");
                break;
            case '5':
                System.out.println("***** Menu Sistem Gaji *****");
                System.out.println("=========================================");
                System.out.println("\t    Work In Progress");
                System.out.println("=========================================");
                break;
            default:
                System.out.println("Menu yang anda pilih tidak ditemukan! Mohon re-run codingan anda");
        }
        // System.out.println("=========================================");
        // System.out.println(" Menu yang dipilih nomor: " + pilihMenu);
        // System.out.println("=========================================");

    }
}
