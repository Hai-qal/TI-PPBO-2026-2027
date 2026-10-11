import java.util.Scanner;

public class Latihan {

    // Latihan 1
    // Luas Persegi Panjang dan Luas Lingkaran
    // ========================================

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }
    static void latihan1() {
        System.out.println("      LATIHAN 1      ");
        System.out.println("=====================");

        System.out.println("Luas Persegi Panjang: ");
        System.out.println("10 x 5 = " + luasPersegiPanjang(10, 5));
        System.out.println("8 x 4  = " + luasPersegiPanjang(8, 4));

        System.out.println("\nLuas Lingkaran:");
        System.out.println("r = 7  -> " + luasLingkaran(7));
        System.out.println("r = 10 -> " + luasLingkaran(10));
    }
    // Latihan 2
    // Menentukan Bilangan Prima 1 - 50
    // ========================================
    static boolean isPrima(int n) {

        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void latihan2() {
        System.out.println("\n      LATIHAN 2      ");
        System.out.println("=====================");
        System.out.println("Bilangan Prima dari 1 sampai 50: ");

        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
    // Latihan 3
    // Konversi Suhu dengan Method Overloading
    // ========================================
    // Celcius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Celcius ke Fahrenheit atau Kelvin
    static double konversiSuhu(double celsius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else {
            return Double.NaN;
        }
    }

    static void latihan3() {
        System.out.println("\n      LATIHAN 3      ");
        System.out.println("=====================");

        double celsius = 32;

        System.out.println("Suhu Celsius    : " + celsius);
        System.out.println("Fahrenheit      : " + konversiSuhu(celsius));
        System.out.println("Kelvin          : " + konversiSuhu(celsius, "Kelvin"));
        System.out.println("Fahrenheit      : " + konversiSuhu(celsius, "Fahrenheit"));
    }


    // Latihan 4
    // Nilai Minimum dan Nilai Maksimum
    // ========================================

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    static void latihan4(Scanner input) {

        System.out.println("\n      LATIHAN 4      ");
        System.out.println("=====================");

        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = input.nextInt();
        int[] nilaiUjian = new int[jumlah];

        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }
        System.out.println("\nHasil:");
        System.out.println("Nilai minimum : " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai maksimum : " + cariNilaiMaksimum(nilaiUjian));
    }

    // Latihan 5
    // Total Array dan Filter Diatas Rata-Rata
    // ========================================

    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;
        int jumlah = 0;

        // Menghitung jumlah nilai diatas rata-rata
        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }
        // Membuat array baru
        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }

    static void latihan5() {
        System.out.println("\n      LATIHAN 5      ");
        System.out.println("=====================");
        int[] data = {98, 74, 81, 56, 69};
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("Data nilai:");

        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
        System.out.println();
        System.out.println("Total nilai : " + total);
        System.out.println("Rata-rata   : " + rataRata);

        int[] hasil = filterDiAtasRataRata(data);

        System.out.print("Nilai di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
    // Main
    // ========================================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        latihan1();
        latihan2();
        latihan3();
        latihan4(input);
        latihan5();

        input.close();
    }
}