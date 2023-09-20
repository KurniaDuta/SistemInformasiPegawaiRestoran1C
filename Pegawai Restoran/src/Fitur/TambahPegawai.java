import java.util.Scanner;

public class TambahPegawai {
    public static void main(String[] args) {

        Scanner pg = new Scanner(System.in);
        Scanner rl = new Scanner(System.in);
        Scanner mn = new Scanner(System.in);

        String namaPegawai, domisili, pendidikan, penyakit, role = "";
        char back;
        int pilihRole;
        System.out.println("****Menu Menambah Data Pegawai****");

        System.out.println("\nMasukkan nama pegawai : ");
        namaPegawai = pg.nextLine();

        System.out.println("\nPilih Role : ");
        System.out.println("1. Role 1");
        System.out.println("2. Role 2");
        System.out.println("3. Role 3");
        System.out.println("4. Role 4");
        pilihRole = rl.nextInt();

        System.out.println("\nMasukkan Domisili pegawai : ");
        domisili = pg.nextLine();

        System.out.println("\nMasukkan Riwayat Pendidikan : ");
        pendidikan = pg.nextLine();
        System.out.println("\nMasukkan Riwayat Penyakit : ");
        penyakit = pg.nextLine();

        System.out.println("================================");
        System.out.println("| Nama Pegawai        : " + namaPegawai);
        System.out.println("| Role                : " + pilihRolerole);
        System.out.println("| Domisili            : " + domisili);
        System.out.println("| Riwayat Pendidikan  : " + pendidikan);
        System.out.println("| Riwayat penyakit    : " + penyakit);
        System.out.println("================================");

        System.out.println("\n***Data telah ditambahkan***");

        System.out.println("\nKembali ke menu awal? (y/n)");
        back = mn.next().charAt(0);

    }
}