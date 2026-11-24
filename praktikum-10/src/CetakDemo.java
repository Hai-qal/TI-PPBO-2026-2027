public class CetakDemo {
    public static void main(String[] args) {
        Cetak[] daftar = {
                new Laporan(),
                new Struk()
        };

        for (Cetak c : daftar) {
            c.cetak();
        }
    }
}
