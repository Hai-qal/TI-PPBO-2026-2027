// Class Tunai sebagai salah satu turunan dari MetodePembayaran
public class Tunai extends MetodePembayaran {

    // Mengisi nama metode pembayaran melalui constructor class induk
    public Tunai(String namaMetode) {
        super(namaMetode);
    }

    // Implementasi hitungBiayaAdmin() untuk pembayaran tunai tanpa biaya admin
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0;
    }
}
