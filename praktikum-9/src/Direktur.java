public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }
}
