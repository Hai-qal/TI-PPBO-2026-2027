import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konstanta tarif listrik untuk setiap golongan daya listrik
        final double tarif_450 = 415;
        final double tarif_900 = 1352;
        final double tarif_1300 = 1444.70;
        final double tarif_2200 = 1444.70;
        final double tarif_lebih_2200 = 1699.33;

        // Menampilkan pilihan golongan daya listrik
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 22O0 VA");
        System.out.println("5. Lebih dari 2200 VA");

        // User diminta memilih golongan daya listrik (1-5)
        System.out.print("Pilih golongan daya: ");
        int pilihan = input.nextInt();

        // User diminta memasukkan besar pemakaian daya listrik
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        double tarif;
        String golongan;

        // Menentukan golongan dan tarif menggunakan switch-case
        switch (pilihan) {
            case 1:
                golongan = "450 VA";
                tarif = tarif_450;
                break;
            case 2:
                golongan = "900 VA";
                tarif = tarif_900;
                break;
            case 3:
                golongan = "1300 VA";
                tarif = tarif_1300;
                break;
            case 4:
                golongan = "2200 VA";
                tarif = tarif_2200;
                break;
            case 5:
                golongan = "Lebih dari 2200 VA";
                tarif = tarif_lebih_2200;
                break;
            default:
                System.out.println("Error: Pilihan tidak tersedia");
                return;
        }

        // Mengecek inputan user bagian besar pemakaian
        if (kwh < 0 || kwh == 0) {
            System.out.println("Error: Harap masukkan nilai melebihi 0");
            return;
        }

        // Menghitung total tagihan
        double total = tarif * kwh;

        // Menampilkan hasil
        System.out.println();
        System.out.println("  Rincian Tagihan Listrik  ");
        System.out.println("===========================");
        System.out.println("Golongan Daya : " + golongan);
        System.out.println("Pemakaian     : " + kwh + " kWh");
        System.out.println("Tarif per kWh :Rp " +tarif);
        System.out.println("Total Tagihan :Rp " + total);

        input.close();
    }
}