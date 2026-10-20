public class DemoToko {
    public static void main(String[] args) {

        // Array of object produk
        Produk[] daftar = new Produk[5];

        daftar[0] = new Produk("P001", "Mouse", 150000, 10);
        daftar[1] = new Produk("P002", "Keyboard", 300000, 8);
        daftar[2] = new Produk("P003", "Monitor", 2000000, 5);
        daftar[3] = new Produk("P004", "Headset", 350000, 9);
        daftar[4] = new Produk("P005", "WebCam", 1000000, 7);

        System.out.println("Daftar Produk");
        for (Produk p : daftar) {
            p.tampilkanData();
            System.out.println();
        }

        System.out.println("Simulasi Pembelian Pertama");
        int jumlahBeli1 = 2;
        System.out.println("Nama Produk : " + daftar[0].namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli1);
        System.out.println("Total Harga : Rp." + daftar[0].hitungTotalBeli(jumlahBeli1));
        daftar[0].kurangiStok(jumlahBeli1);
        System.out.println();

        System.out.println("Simulasi Pembelian Kedua");
        int jumlahBeli2 = 10;
        System.out.println("Nama Produk : " + daftar[1].namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli2);
        System.out.println("Total Harga : Rp." + daftar[1].hitungTotalBeli(jumlahBeli2));
        daftar[1].kurangiStok(jumlahBeli2);
        System.out.println();

        Produk termahal = daftar[0];
        for (Produk p : daftar) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }

        System.out.println("Produk dengan Harga Termahal");
        termahal.tampilkanData();
    }
}
