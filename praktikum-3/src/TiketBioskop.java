import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Membaca status mahasiswa (true/false)
        System.out.print("Apakah Mahasiswa?: ");
        boolean mahasiswa = input.nextBoolean();

        int hargaTiket;

        if (mahasiswa && umur < 25) {
            hargaTiket = 30000;
        } else {
            hargaTiket = 50000;
        }

        System.out.println("Umur: " + umur);
        System.out.println("Mahasiswa: " + mahasiswa);
        System.out.println("Harga Tiket: " +hargaTiket);
    }
}
