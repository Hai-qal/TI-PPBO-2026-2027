public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String nama, String merek, double kecepatanMaks, int jumlah) {
        super(nama, merek, kecepatanMaks);
        this.jumlahPintu = jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama               : " + nama);
        System.out.println("Merek              : " + merek);
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks);
        System.out.println("Jumlah Pintu       : " + jumlahPintu);
    }
}
