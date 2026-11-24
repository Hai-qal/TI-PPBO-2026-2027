// Abstract class sebagai induk untuk semua metode pembayaran
public abstract class MetodePembayaran {
    protected String namaMetode; // Menyimpan nama metode pembayaran

    // Constructor untuk mengisi nama metode pembayaran
    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    // Abstract method: perhitungan biaya admin ditentukan oleh setiap subclass
    public abstract double hitungBiayaAdmin(double jumlah);

    // Method biasa: menampilkan rincian pembayaran
    public void prosesPembayaran(double jumlah) {
        double biayaAdmin = hitungBiayaAdmin(jumlah);
        double totalPembayaran = jumlah + biayaAdmin;

        System.out.println("Metode Pembayaran: " + namaMetode);
        System.out.println("Jumlah Pembelian : " + jumlah);
        System.out.println("Biaya Admin      : " + biayaAdmin);
        System.out.println("Total Pembayaran : "  + totalPembayaran);
    }
}
