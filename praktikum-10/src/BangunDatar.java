public abstract class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilkanInfo() {
        System.out.println("Bangun   : " + namaBangun);
        System.out.printf("Luas     : %.2f%n", hitungLuas());
        System.out.printf("Keliling : %.2f%n", hitungKeliling());
    }
}
