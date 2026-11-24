// Class EWallet mewarisi MetodePembayaran dan menerapkan interface BisaCashback
public class EWallet extends MetodePembayaran implements BisaCashback {

    // Mengisi nama metode pembayaran melalui constructor class induk
    public EWallet(String namaMetode) {
        super(namaMetode);
    }

    // Menetapkan biaya admin sebesar 1.000
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    // Menghitung cashback senilai 5% ddari jumlah pembelian
    @Override
    public double hitungCashback(double jumlah) {
        double cashback = jumlah * 0.05;

        // Membatasi cashback agar tidak lebih dari 20.000
        if (cashback > 20000) {
            cashback = 20000;
        }

        return cashback;
    }
}
