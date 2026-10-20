public class PersegiTerbesar {
    public static void main(String[] args) {

        // Membuat array of object untuk Persegi
        Persegi[] daftar = new Persegi[4];

        daftar[0] = new Persegi(4);
        daftar[1] = new Persegi(6);
        daftar[2] = new Persegi(8);
        daftar[3] = new Persegi(10);

        // Menampilkan semua persegi
        for (int i = 0; i < daftar.length; i++) {
            System.out.println("Persegi ke-" + (i + 1));
            daftar[i].tampilkanData();
            System.out.println();
        }

        Persegi terbesar = daftar[0]; // Menyimpan persegi pertama sebagai pembanding awal
        // Mencari persegi terbesar
        for (Persegi p : daftar) {
            if (p.Luas() > terbesar.Luas()) {
                terbesar = p;
            }
        }

        System.out.println("Persegi Terbesar");
        System.out.println("Sisi     : " + terbesar.sisi);
        System.out.println("Luas     : " + terbesar.Luas());
        System.out.println("Keliling : " + terbesar.Keliling());
    }
}
