import java.util.Scanner;

public class KalkulatorMethod {

    // METHOD OPERASI PERHITUNGAN
    // ============================================================

    // Method tambah dengan 2 parameter
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method tambah dengan 3 parameter
    // Ini merupakan method overloading
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double angka) {
        return Math.sqrt(angka);
    }

    // METHOD MENCARI RIWAYAT NILAI MAKSIMUM
    // ============================================================

    static double riwayatKeMaksimum(double[] riwayatHasil) {

        double maksimum = riwayatHasil[0];
        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    // METHOD MAIN
    // ============================================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan seluruh hasil perhitungan
        double[] riwayatHasil = new double[100];

        // Menyimpan jumlah hasil yang sudah dimasukkan ke array
        int jumlahRiwayat = 0;
        int pilihan;

        // Menu akan terus ditampilkan sampai pengguna memilih 8
        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println("        KALKULATOR METHOD");
            System.out.println("=================================");
            System.out.println("1. Penjumlahan 2 angka");
            System.out.println("2. Penjumlahan 3 angka");
            System.out.println("3. Pegurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih operasi: ");

            pilihan = input.nextInt();
            double hasil = 0;
            boolean perhitunganBerhasil = true;

            // PEMILIHAN OPERASI
            // ====================================================

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- PENJUMLAHAN 2 ANGKA ---");
                    System.out.print("Masukkan angka pertama : ");
                    double a = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    double b = input.nextDouble();
                    hasil = tambah(a, b);
                    break;

                case 2:
                    System.out.println("\n--- PENJUMLAHAN 3 ANGKA ---");
                    System.out.print("Masukkan angka pertama : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    b = input.nextDouble();
                    System.out.print("Masukkan angka ketiga  : ");
                    double c = input.nextDouble();
                    hasil = tambah(a, b, c);
                    break;


                case 3:
                    System.out.println("\n--- PENGURANGAN ---");
                    System.out.print("Masukkan angka pertama : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    b = input.nextDouble();
                    hasil = kurang(a, b);
                    break;

                case 4:
                    System.out.println("\n--- PERKALIAN ---");
                    System.out.print("Masukkan angka pertama : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    b = input.nextDouble();
                    hasil = kali(a, b);
                    break;

                case 5:
                    System.out.println("\n--- PEMBAGIAN ---");
                    System.out.print("Masukkan angka pertama : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    b = input.nextDouble();
                    // Memeriksa pembagian dengan nol
                    if (b == 0) {
                        System.out.println(
                                "Error: Pembagian dengan nol tidak diperbolehkan."
                        );
                        perhitunganBerhasil = false;
                    } else {
                        hasil = bagi(a, b);
                    }
                    break;

                case 6:
                    System.out.println("\n--- PERPANGKATAN ---");
                    System.out.print("Masukkan bilangan : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan pangkat   : ");
                    b = input.nextDouble();
                    hasil = pangkat(a, b);
                    break;

                case 7:

                    System.out.println("\n--- AKAR KUADRAT ---");
                    System.out.print("Masukkan angka : ");
                    a = input.nextDouble();
                    // Akar kuadrat bilangan negatif tidak dihitung
                    if (a < 0) {
                        System.out.println(
                                "Error: Akar kuadrat bilangan negatif tidak dapat dihitung."
                        );
                        perhitunganBerhasil = false;
                    } else {
                        hasil = akarKuadrat(a);
                    }
                    break;

                case 8:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    perhitunganBerhasil = false;
            }

            if (perhitunganBerhasil && pilihan >= 1 && pilihan <= 7) {

                System.out.println("---------------------------------");
                System.out.println("Hasil = " + hasil);
                System.out.println("---------------------------------");

                // Memasukkan hasil ke dalam array riwayat
                riwayatHasil[jumlahRiwayat] = hasil;

                jumlahRiwayat++;
            }

        } while (pilihan != 8);

        // MENAMPILKAN HASIL TERBESAR DARI RIWAYAT
        // ============================================================

        if (jumlahRiwayat > 0) {

            // Membuat array yang hanya berisi hasil yang digunakan
            double[] hasilAkhir = new double[jumlahRiwayat];

            for (int i = 0; i < jumlahRiwayat; i++) {

                hasilAkhir[i] = riwayatHasil[i];
            }

            // Memanggil method untuk mencari hasil terbesar
            double maksimum = riwayatKeMaksimum(hasilAkhir);

            System.out.println();
            System.out.println("=================================");
            System.out.println("       RINGKASAN RIWAYAT");
            System.out.println("=================================");
            System.out.println("Jumlah perhitungan : " + jumlahRiwayat);
            System.out.println("Hasil terbesar     : " + maksimum);
            System.out.println("=================================");

        } else {

            System.out.println("Tidak ada perhitungan yang dilakukan.");
        }

        input.close();
    }
}