import java.util.Scanner;

public class TambahPegawai {
    public static void main(String[] args) {

        Scanner pg = new Scanner(System.in);
        Scanner rl = new Scanner(System.in);
        Scanner mn = new Scanner(System.in);

        String namaPegawai, domisili, pendidikan, penyakit, role = "";
        char back = 'y';
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

        System.out.println("\nKembali ke menu awal? (y/n)");
        back = mn.next().charAt(0);
        if (back == 'y'|| back == 'Y') {
            System.out.println("Kembali ke menu");
        } else {
            System.out.println("Balik atas");
        }

    }
}