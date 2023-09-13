import java.util.Scanner;

public class IntensifPegawai {
    public static void main(String[] args) {

        Scanner kata = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        String namaPegawai;
        int gajiAwal = 4000000, jumlahIzin, nominalIzin = 100000, gajiAkhir, potonganIzin, intensifPegawai = 100000, lembur,
                gajiLembur, shiftMasuk;

        System.out.println("======================================");
        System.out.println("          Penggajian Pegawai         ");
        System.out.println("======================================");
        System.out.print("Masukkan Nama Pegawai: ");
        namaPegawai = kata.nextLine();
        System.out.print("Masukkan jumlah izin (shift) : ");
        jumlahIzin = number.nextInt();
        System.out.print("Masukkan jumlah lembur (jam): ");
        lembur = number.nextInt();

        potonganIzin = jumlahIzin * nominalIzin;
        gajiLembur = lembur * intensifPegawai;
        gajiAkhir = gajiAwal - potonganIzin + gajiLembur;
        shiftMasuk = 30 - jumlahIzin;

        System.out.println("\n\n\n==============================================================");
        System.out.println("                 Slip Gaji Pegawai Restoran 1C                ");
        System.out.println("==============================================================\n");
        System.out.println("Nama Pegawai\t: " + namaPegawai);
        System.out.println("Shift Masuk\t: " + shiftMasuk + " shift");
        System.out.println("Shift Izin\t: " + jumlahIzin + " shift");
        System.out.println("Lembur\t\t: " + lembur + " jam\n");
        System.out.println("==============================================================\n");
        System.out.println("Gaji Pokok\t: " + gajiAwal);
        System.out.println("Potongan izin\t: " + potonganIzin);
        System.out.println("Gaji Lembur\t: " + gajiLembur + "\n");
        System.out.println("==============================================================\n");
        System.out.println("Total Gaji Akhir: " + "Rp " + gajiAkhir + "\n");
        System.out.println("==============================================================");
    }
}
