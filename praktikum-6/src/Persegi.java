public class Persegi {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung luas persegi
    public double Luas() {
        return sisi * sisi;
    }

    // Menghitung keliling
    public double Keliling() {
        return 4 * sisi;
    }

    // Menampilkan informasi persegi
    public void tampilkanData() {
        System.out.println("Sisi     : " + sisi);
        System.out.println("Luas     : " + Luas());
        System.out.println("Keliling : " + Keliling());
    }
}
