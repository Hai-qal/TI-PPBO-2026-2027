import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //=======================================================
        // Latihan 1
        System.out.println("Latihan 1: Tabel Perkalian 1-10");

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        System.out.println("=== TABEL PERKALIAN ===");

        for (int i = 1; i <= 10; i++) {
            System.out.println(bil + " x " + i + " = " + (bil * i));
        }
        System.out.println();

        //=======================================================
        // Latihan 2
        System.out.println();
        System.out.println("Latihan 2: Mencetak Pola Segitiga Terbalik dan Persegi");
        System.out.print("Masukkan ukuran pola: ");
        int ukuran = input.nextInt();

        // Menampilkan Segitiga Terbalik
        System.out.println("=== SEGITIGA TERBALIK ===");
        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Menampilkan Persegi
        System.out.println("=== PERSEGI ===");
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
