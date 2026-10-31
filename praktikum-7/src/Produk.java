public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        this.stok = stok;
    }

    // Getter untuk kode produk
    public String getKodeProduk() {
        return kodeProduk;
    }

    // Getter untuk nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter untuk harga dengan validasi
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }

    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("Jumlah penambahan harus diatas 0!");
        }
    }

    // Method untuk mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Pengurangan stok harus melebihi 0");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi!");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi");
        }
    }
}
