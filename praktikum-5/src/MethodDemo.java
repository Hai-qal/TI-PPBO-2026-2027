public class MethodDemo {
    // Method void: tidak mengembalikan nilai apapun
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Panggil method main
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" +umur + " tahun) - " + kota);
    }

    // Panggil method main
    public static void main(String[] args) {
        sapa("Budi");
        sapa("Siti");

        tampilkanBiodata("Budi", 20, "Bandung");
    }
}
