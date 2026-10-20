public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor untuk mengisi atribut produk
    // Constructor untuk latihan no.3
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Constructor untuk Tugas
    public Produk(String kodeProduk, String namaProduct, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduct;
        this.harga = harga;
        this.stok = stok;
    }

    // Cek kategori harga
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

    // Total harga pembelian
    public double hitungTotalBeli(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Mengurangi stok
    public void kurangiStok (int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;

            System.out.println("Pembelian Berhasil.");
            System.out.println("Jumlah Dibeli : " + jumlah);
            System.out.println("Stok          : " + stok);
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    // Menampilkan informasi produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Stok        : " + stok);
    }
}
