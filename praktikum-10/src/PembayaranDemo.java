import java.util.Scanner;

// Class utama untuk menjalankan program pembayaran
public class PembayaranDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah pembelian yang akan dihitung
        System.out.print("Masukkan total pembelian: ");
        double jumlah = input.nextDouble();

        // Array bertipe MetodePembayaran yang berisi beberapa jenis pembayaran
        MetodePembayaran[] daftar = {
                new Tunai("Tunai"),
                new KartuKredit("Kartu Kredit"),
                new EWallet("E-Wallet"),
                new EWallet("E-Wallet")
        };

        // Menyimpan total pembayaran terendah dan nama metodenya
        double totalTerendah = Double.MAX_VALUE;
        String metodeTerbaik = "";

        System.out.println("\n=== Daftar Metode Pembayaran ===");

        // Mengulang setiap objek pembayaran yang ada di dalam array
        for (MetodePembayaran mp : daftar) {
            mp.prosesPembayaran(jumlah);
            double cashback = 0;

            // Memeriksa apakah metode pembayaran mendukung cashback
            if (mp instanceof BisaCashback) {
                BisaCashback pembayaran = (BisaCashback) mp;
                cashback = pembayaran.hitungCashback(jumlah);

                System.out.println("Cashback         : " + cashback);
            }

            // Menghitung total akhir setelah biaya admin dan cashback
            double totalBersih = jumlah + mp.hitungBiayaAdmin(jumlah) - cashback;
            System.out.println("Total Bersih     : " + totalBersih);
            System.out.println();

            // Membandingkan total pembayaran untuk mencari yang paling rendah
            if (totalBersih < totalTerendah) {
                totalTerendah = totalBersih;
                metodeTerbaik = mp.namaMetode;
            }
        }

        // Menampilkan metode pembayaran dengan total akhir paling rendah
        System.out.println("=== Metode Pembayaran Terbaik ===");
        System.out.println("Metode           : " + metodeTerbaik);
        System.out.println("Total Bersih     : " + totalTerendah);
    }
}
