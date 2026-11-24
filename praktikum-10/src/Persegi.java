public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

  /*
   Pengujian Latihan 2:
   - Menghapus method hitungKeliling
   - Muncul pesan error: reached end of file while parsing

   Java menolak kode tersebut karena class Persegi belum memiliki method hitungKeliling()
   yang diwajibkan oleh BangunDatar, sehingga aturan ini membantu programmer memastikan
   setiap subclass memiliki method yang diperlukan.
   */