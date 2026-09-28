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

        //=======================================================
        // Latihan 3
        System.out.println();
        System.out.println("Latihan 3: Array Urutan Terbalik");
        int[] angka = new int[10];

        System.out.println("Masukkan bilangan: ");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("Diurutkan Terbalik:");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.println(angka[i]);
        }

        //=======================================================
        // Latihan 4
        System.out.println();
        System.out.println("Latihan 4: Matriks 3x3");

        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3: ");

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print("Matriks[" + baris + "][" + kolom + "]: ");

                matriks[baris][kolom] = input.nextInt();
            }
        }

        // Menampilkan matriks.
        System.out.println("Matriks 3x3:");

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print(matriks[baris][kolom] + "\t");
            }
            System.out.println();
        }

        // Menghitung jumlah setiap baris.
        System.out.println("Jumlah setiap baris:");

        for (int baris = 0; baris < matriks.length; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                jumlahBaris += matriks[baris][kolom];
            }

            System.out.println("Baris " + (baris + 1) + " = " + jumlahBaris);
        }

        // Menghitung jumlah seluruh elemen matriks.
        int totalMatriks = 0;

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                totalMatriks += matriks[baris][kolom];
            }
        }

        System.out.println("Jumlah seluruh elemen = " + totalMatriks);


        input.close();
    }
}
