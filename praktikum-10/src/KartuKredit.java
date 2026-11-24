// Class KartuKredit mewarisi MetodePembayaran dan menerapkan interface BisaCashback
public class KartuKredit extends MetodePembayaran implements BisaCashback{

    // Mengisi nama metode pembayaran melalui constructor class induk
    public KartuKredit(String namaMetode) {
        super(namaMetode);
    }

    // Menghitung biaya admin senilai 2% dari jumlah pembelian
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return jumlah * 0.02;
    }

    // Menghitung cashback senilai 1% dari jumlah pembelian
    @Override
    public double hitungCashback(double jumlah) {
        return jumlah * 0.01;
    }
}
