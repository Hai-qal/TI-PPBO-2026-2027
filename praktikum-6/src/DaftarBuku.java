public class DaftarBuku {
    public static void main(String[] args) {

        // Membuat array of object untuk Buku
        Buku[] daftar = new Buku[4];

        daftar[0] = new Buku("Sang Pemimpi", "Andrea Hirata", 2005);
        daftar[1] = new Buku("Laut Bercerita", "Leila S. Chudori", 2017);
        daftar[2] = new Buku("Tapak Jejak", "Fiersa Besari", 2019);
        daftar[3] = new Buku("Episode Hujan", "Lucia Priandarini", 2022);

        // Menampilkan buku berdasarkan tahun terbit
        System.out.println("Daftar Buku");
        System.out.println();
        for (Buku b : daftar) {
            if (b.tahunTerbit > 2015) {
                System.out.println("Judul        : " + b.judul);
                System.out.println("Pengarang    : " + b.pengarang);
                System.out.println("Tahun Terbit : " + b.tahunTerbit);
                System.out.println();

            }
        }
    }
}
