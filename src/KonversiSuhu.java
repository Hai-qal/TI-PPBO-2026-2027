import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String [] args) {

        // Membuat scanner untuk menerima input
        Scanner sc = new Scanner(System.in);

        // Meminta user memasukkan nilai suhu (dalam Celcius)
        System.out.print("Masukkan suhu Celsius: ");
        double celsius = sc.nextDouble();

        // Mengubah suhu Celcius ke suhu Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Menampilkan hasil konversi
        System.out.println("Suhu Fahrenheit: " + fahrenheit);

        System.out.println("Jadi suhu " + celsius + "°C sama dengan " + fahrenheit + "°F");

        // Menutup scanner
        sc.close();
    }

}
