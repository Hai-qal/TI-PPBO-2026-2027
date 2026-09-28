import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menentukan KKM sebagai batas nilai kelulusan
        final double KKM = 70;

        // Membaca jumlah Mahasiswa dari input-an pengguna
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlah_mahasiswa = input.nextInt();

        // Membuat array untuk menyimpan nilai setiap Mahasiswa
        double[] nilai = new double[jumlah_mahasiswa];

        // Membaca nilai masing-masing Mahasiswa menggunakan for loop
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();

        }

        // Menampilkan nilai sebelum diurutkan
        System.out.println("\n=== NILAI SEBELUM DIURUTKAN ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Mahasiswa ke-%d : %.2f%n", i + 1, nilai[i]
            );
        }

        // Menentukan nilai tertinggi dan terendah
        double nilai_tertinggi = nilai[0];
        double nilai_terendah = nilai[0];

        // Variabel untuk menghitung total nilai dan jumlah kelulusan
        double totalNilai = 0;
        int jumlah_lulus = 0;
        int jumlah_tidak_lulus = 0;

        // Mangolah seluruh nilai Mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            totalNilai += nilai[i];

            //Mencari nilai tertinggi
            if (nilai[i] > nilai_tertinggi) {
                nilai_tertinggi = nilai[i];
            }

            // Mencari nilai terendah.
            if (nilai[i] < nilai_terendah) {
                nilai_terendah = nilai[i];
            }

            // Menghitung Mahasiswa yang lulus dan tidak lulus
            if (nilai[i] >= KKM) {
                jumlah_lulus++;
            } else {
                jumlah_tidak_lulus++;
            }
        }

        // Menghitung nilai rata-rata kelas
        double rataRata = totalNilai / nilai.length;

        /*
         * Mengurutkan nilai secara ascending menggunakan bubble sort
         * Tidak menggunakan method sorting bawaan Java
         */
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                // Menukar nilai jika urutannya masih dari besar ke kecil
                if (nilai[j] > nilai[j + 1]) {
                    double sementara = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = sementara;
                }
            }
        }

        // Menampilkan nilai setelah diurutkan
        System.out.println("\n=== NILAI SETELAH DIURUTKAN ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%.2f ", nilai[i]);
        }

        // Menampilkan seluruh hasil pengolahan nilai
        System.out.println("\n\n==========================================");
        System.out.println("          LAPORAN NILAI KELAS            ");
        System.out.println("==========================================");
        System.out.println("Jumlah Mahasiswa   : " + jumlah_mahasiswa);
        System.out.printf("Nilai Rata-Rata    : %.2f%n", rataRata);
        System.out.printf("Nilai Tertinggi    : %.2f%n", nilai_tertinggi);
        System.out.printf("Nilai Terendah     : %.2f%n", nilai_terendah);
        System.out.println("KKM                : " + KKM);
        System.out.println("Jumlah Lulus       : " + jumlah_lulus);
        System.out.println("Jumlah Tidak Lulus : " + jumlah_tidak_lulus);
    }
}
