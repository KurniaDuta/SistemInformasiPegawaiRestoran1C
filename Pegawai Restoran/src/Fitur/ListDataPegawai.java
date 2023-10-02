import java.util.Scanner;

public class ListDataPegawai {

    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);

        System.out.println("***** Menu List Data Pegawai *****\n");
        System.out.println("====================================================================================================================");
        System.out.println("| Pegawai Satu\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Dua\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Tiga\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Empat\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Lima\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("====================================================================================================================");


        char back;
        
        System.out.print("Kembali ke menu (y/n)");
        back = mn.next().charAt(0);
        
        if (back == 'y' || back == 'Y') {
            System.out.print("List Menu");
        } else if (back == 'n' || back == 'N') {
            System.out.print("Tetap pada menu");
            
        }
    }
}
