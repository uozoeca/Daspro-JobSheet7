import java.util.Scanner;

public class SiakadFor10Modif1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus = 0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan Nilai Mahasiswa Ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } if (nilai < terendah) {
                terendah = nilai;
            } if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
    }
}
