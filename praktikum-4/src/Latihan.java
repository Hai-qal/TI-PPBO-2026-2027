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

        input.close();
    }
}
