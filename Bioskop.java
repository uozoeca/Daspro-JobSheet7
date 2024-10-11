import java.util.Scanner;

public class Bioskop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, totalTiket = 0, hargaTiket = 50000;
        double totalPenjualan = 0;

        while (true) {
            System.err.print("Masukkan Jumlah Tiket Yang Terjual (Masukkan 0 Untuk Selesai): ");
        jmlTiket = sc.nextInt();
        if (jmlTiket == 0) {
            break;
        } if (jmlTiket < 0) {
            System.out.println("Jumlah Tiket Tidak Valid");
            continue;
        }
        double totalHarga = jmlTiket * hargaTiket;

        if (jmlTiket > 10) {
            totalHarga *= 0.85;
        } else if (jmlTiket > 4) {
            totalHarga *= 0.90;
        }
        totalTiket += jmlTiket;
        totalPenjualan = totalHarga;
        System.out.println("Total Harga Tiket Untuk " + jmlTiket + " Tiket: Rp " + totalHarga);
        }
        System.out.println("Total Tiket Yang Terjual Hari Ini: " + totalTiket);
        System.out.println("Total Penjualan Tiket: Rp " + totalPenjualan);
    }
}
