public class LatihanEncapsulation {
    public static void main(String[] args) {

        // --- Latihan 1 dan 2: Buku ---
        System.out.println("=== Latihan 1 & 2: ===");

        Buku b1 = new Buku("Hujan", "Tere Liye", 2016);
        System.out.println("Judul     : " + b1.getJudul());
        System.out.println("Pengarang : " + b1.getPengarang());
        System.out.println("Tahun     : " + b1.getTahunTerbit());

        b1.setJudul("Laskar Pelangi");
        b1.setPengarang("Andrea Hirata");
        System.out.println("Setelah diubah:");
        System.out.println("Judul     : " + b1.getJudul());
        System.out.println("Pengarang : " + b1.getPengarang());
        System.out.println("Tahun     : " + b1.getTahunTerbit());
        // Setter tahunTerbit tidak tersedia karena atribut read-only
        // b1.setTahunTerbit(2005); // Error kompilasi: jika diaktifkan

        // --- Latihan 3: Waktu ---
        System.out.println("\n=== Latihan 3 ===");
        Waktu w1 = new Waktu(12, 25, 45);
        System.out.println("Waktu awal     : " + w1.tampilkanWaktu());
        w1.setJam(14);
        w1.setMenit(60); // Tidak Valid
        w1.setDetik(23);
        System.out.println("Waktu saat ini : " + w1.tampilkanWaktu());

        // --- Latihan 4: Siswa ---
        System.out.println("\n=== Latihan 4 ===");
        // Membuat objek siswa
        Siswa s1 = new Siswa();
        // Mengatur nilai siswa
        s1.setNilai(85); // nilai awal
        System.out.println("Nilai : " + s1.getNilai() + " = " + s1.getNilaiHuruf());
        s1.setNilai(65); // setelah diubah
        // menguji validasi
        System.out.println("Nilai : " + s1.getNilai() + " = " + s1.getNilaiHuruf());
        s1.setNilai(110); // ditolak
        s1.setNilai(-2); // ditolak
        s1.setNilai(77);
        System.out.println("Nilai : " + s1.getNilai() + " = " + s1.getNilaiHuruf());

        // --- Latihan 5: Produk ---
        System.out.println("\n=== Latihan 5 ===");
        Produk p1 = new Produk ("P001", "WebCam", 500000, 10);
        System.out.println("Kode Produk : " + p1.getKodeProduk());
        System.out.println("Nama Produk : " + p1.getNamaProduk());
        System.out.println("Harga       : " + p1.getHarga());
        System.out.println("Stok        : " + p1.getStok());

        p1.setHarga(625000);
        p1.setHarga(-500000); // ditolak
        p1.tambahStok(5);
        p1.kurangiStok(7);
        p1.tambahStok(0); // ditolak, penambahan diatas 0
        p1.kurangiStok(12); // ditolak, stok tidak mencukupi
        p1.tambahStok(-5); // ditolak
        System.out.println("Sisa stok  : " + p1.getStok());
    }
}
