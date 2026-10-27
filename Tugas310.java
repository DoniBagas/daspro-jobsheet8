import java.util.Scanner;

public class Tugas310


{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int maxBarang = -1;      // -1 agar toko pertama (walau 0 barang) tercatat
        int tokoTerbanyak = 0;

        for (int t = 1; t <= jumlahToko; t++) {
            int pelanggan;
            do {
                System.out.print("Toko " + t + " - jumlah pelanggan: ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Tidak boleh negatif!");
                }
            } while (pelanggan < 0);

            int totalBarang = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif!");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarang);
            totalSemua += totalBarang;

            if (totalBarang > maxBarang) {   // '>' : seri tetap toko bernomor kecil
                maxBarang = totalBarang;
                tokoTerbanyak = t;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}