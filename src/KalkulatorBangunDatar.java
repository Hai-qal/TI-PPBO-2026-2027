import java.util.Scanner;

/*
 * Nama          : Haiqal
 * NIM           : 2025573010035
 * Program Studi : Teknik Informatika
 * Kelas         : TI 2E
 * Mata Kuliah   : Praktikum PBO
 */

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        // Untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Memasukkan panjang persegi panjang
        System.out.print("Masukkan nilai panjang: ");
        double panjang = sc.nextDouble();

        // Memasukkan lebar persegi panjang
        System.out.print("Masukkan nilai lebar: ");
        double lebar = sc.nextDouble();

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        // Menghitung keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil persegi panjang
        System.out.println("\n === Persegi Panjang ===");
        System.out.println("Luas    : " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);

        // Menentukan apakah luas lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("Luas lebih dari 100: " + luasBesar);

        // Input jari - jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jarijari = sc.nextDouble();

        // Menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jarijari * jarijari;

        // Menghitung keliling lingkaran
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        // Menampilkan hasil lingkaran
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas: " + luasLingkaran);
        System.out.println("Keliling: " + kelilingLingkaran);

        // Menutup Scanner
        sc.close();
    }
}
