import java.util.Scanner;

public class ListDataPegawai {

    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        char back;

        System.out.println("***** Menu List Data Pegawai *****\n");
        System.out.println("====================================================================================================================");
        System.out.println("| Pegawai Satu\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Dua\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Tiga\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Empat\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("| Pegawai Lima\t|\tRole\t|\tDomisili\t|\tRiwayat Penyakit\t|\tRiwayat Pendidikan |");
        System.out.println("====================================================================================================================");


        System.out.println("\nKembali ke menu awal? (y/n)");
        back = mn.next().charAt(0);

        String ketikY = "y";
        String ketikN = "n";
        
        System.out.println("Kembali ke menu (y/n)");
        String enteredketikY = mn.nextLine();
        String enteredketikN = mn.nextLine();
        
        if (enteredketikY.equals(enteredketikY)) {
            System.out.println("List Menu");
        } else if (enteredketikN.equals(enteredketikN)) {
            System.out.println("Tetap pada menu");
            
        }
    }
}
