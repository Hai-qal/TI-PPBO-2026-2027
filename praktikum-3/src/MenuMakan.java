import java.util.Scanner;

public class MenuMakan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Nasi Uduk");
        System.out.println("4. Mie Goreng");

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Kamu memilih Nasi Uduk");
                break;
            case 4:
                System.out.println("Kamu memilih Mie Goreng");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
