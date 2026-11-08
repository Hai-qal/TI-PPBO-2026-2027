public class KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Innova","Toyota", 180, 4);
        Motor motor = new Motor("Sonic","Honda", 120, "Matic");

        mobil.tampilkanInfo();
        System.out.println();
        System.out.println("Nama               : " + motor.nama);
        System.out.println("Merek              : " + motor.merek);
        System.out.println("Kecepatan Maksimum : " + motor.kecepatanMaks);
        System.out.println("Jenis Motor        : " + motor.jenisMotor);
    }
}