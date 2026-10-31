public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    // Constructor
    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenis) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenis;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method penyetoran uang
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // Method penarikan uang
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Method transfer uang
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer Gagal! Harap Masukkan Rekening Tujuan");
        } else if (tujuan == this) {
            System.out.println("Transfer Gagal! Tidak bisa Transfer ke Rekening Sendiri");
        } else if (jumlah > saldo) {
            System.out.println("Transfer Gagal! Nominal melebihi Saldo");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer Berhasil: " + jumlah + " dari " + this.nomorRekening + " ke " + tujuan.nomorRekening);
        }
    }

    // Method untuk mencetak laporan mutasi rekening
    public void cetakMutasi() {
        System.out.println("\n         MUTASI REKENING");
        System.out.println("==================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println("==================================");
    }
}
