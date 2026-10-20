public class cekProduk {
    public static void main(String[] args) {

        Produk p1 = new Produk("Mouse", 150000);
        Produk p2 = new Produk("Keyboard", 350000);
        Produk p3 = new Produk("Monitor", 2000000);

        // Menentukan batas harga
        double batasHarga = 500000;

        System.out.println("Batas Harga : " + batasHarga);
        System.out.println();

        System.out.println("Nama Produk : " + p1.namaProduk);
        System.out.println("Harga       : Rp." + p1.harga);
        System.out.println("Mahal       : " + p1.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama Produk : " + p2.namaProduk);
        System.out.println("Harga       : Rp." + p2.harga);
        System.out.println("Mahal       : " + p2.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama Produk : " + p3.namaProduk);
        System.out.println("Harga       : Rp." + p3.harga);
        System.out.println("Mahal       : " + p3.isMahal(batasHarga));
    }
}
