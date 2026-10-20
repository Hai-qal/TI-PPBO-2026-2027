public class DataBuku {
    public static void main(String[] args) {

        // Object
        Buku b1 = new Buku("Sang Pemimpi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Laut Bercerita", "Leila S. Chudori", 2017);

        // Menampilkan informasi buku
        System.out.println("Daftar Buku: ");
        System.out.println("Judul        : " + b1.judul);
        System.out.println("Pengarang    : " + b1.pengarang);
        System.out.println("Tahun Terbit : " + b1.tahunTerbit);
        System.out.println("---------------------------");
        System.out.println("Judul        : " + b2.judul);
        System.out.println("Pengarang    : " + b2.pengarang);
        System.out.println("Tahun Terbit : " + b2.tahunTerbit);
    }
}
