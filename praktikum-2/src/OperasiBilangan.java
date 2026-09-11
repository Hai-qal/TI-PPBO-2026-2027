import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String[] args) {

        // Untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Membaca input-an pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();

        //Membaca imput-an kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();

        // Menampilkan hasil setiap operasi aritmatika
        System.out.println("Penjumlahan: " + (bil1 + bil2)); // Hasil penjumlahan
        System.out.println("Pengurangan: " + (bil1 - bil2)); // Hasil pengurangan
        System.out.println("Perkalian: " + (bil1 * bil2)); // Hasil perkalian
        System.out.println("Pembagian: " + (bil1 / bil2)); // Hasil pembagian
        System.out.println("Sisa Bagi: " + (bil1 % bil2)); // Hasil sisa bagi

        // Membandingkan kedua bilangan
        System.out.println("\n======== Hasil Perbandingan =======");

        // Jika bilangan pertama lebih besar dari bilangan kedua
        System.out.println("Bilangan pertama > Bilangan kedua: " + (bil1 > bil2));

        // Jika bilangan pertama lebih kecil dari bilangan kedua
        System.out.println("Bilangan pertama < Bilangan kedua: " + (bil1 < bil2));

        // Jika bilangan pertama sama dengan bilangan kedua
        System.out.println("Bilangan pertama == Bilangan kedua: " + (bil1 == bil2));

        // Menutup scanner
        sc.close();
    }
}
