public class BangunDemo {
    public static void main(String[] args) {
        BangunDatar[] daftar = {
                new Persegi(5),
                new PersegiPanjang(6, 4),
                new Lingkaran(8)
        };

        for (BangunDatar b : daftar) {
            b.tampilkanInfo();
            System.out.println();
        }
    }
}


 /*
    Pengujian Latihan 1:
    Saat memasukkan code ini: BangunDatar bangun = new BangunDatar("Bangun");
    Hasilnya: BangunDatar is abstract; cannot be instantiated
    Dikarenakan BangunDatar merupakan abstract class (tidak dapat dibuat objek secara langsung)
 */