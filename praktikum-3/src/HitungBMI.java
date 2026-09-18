import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): "); // memasukkan nilai berat badan
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (meter): "); // memasukkan nilai tinggi badan
        double tinggi = input.nextDouble();

        double bmi = berat / (tinggi * tinggi); // Menghitung BMI

        // Menentukan kategori BMI
        String kategori;

        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }

        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Kategori: " + kategori);
    }
}
