import java.util.Scanner;

public class Parkir {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, jamParkir, totalBayar = 0;
        double biayaParkir = 0;
        while (true) {
            System.out.print("Masukkan Jenis Kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0) {
                break;
            } if (jenisKendaraan != 1 && jenisKendaraan != 2) {
            System.out.println("Jenis Kendaraan Tidak Valid");
            continue;
            }
            System.out.print("Masukkan Jam Parkir: ");
            jamParkir = sc.nextInt();
            if (jamParkir > 5) {
                biayaParkir = 12500;
            } else if (jenisKendaraan == 1) {
                biayaParkir = jamParkir * 3000;
            } else if (jenisKendaraan == 2) {
                biayaParkir = jamParkir * 2000;
            }
            totalBayar += biayaParkir;
            System.out.println("Total Pembayaran Parkir: Rp " + totalBayar);
        }
    }
}
