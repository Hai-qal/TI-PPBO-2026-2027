public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[]  daftarBangun = {
             new Lingkaran(5),
             new Persegi(7),
             new PersegiPanjang(8, 5),
             new Lingkaran(6),
             new PersegiPanjang(10, 7),
             new Persegi(9),
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        String namaBangunTerbesar = " ";

        for (BangunDatar bd : daftarBangun) {
            bd.tampilkanInfo();
            System.out.println();
            double luas = bd.hitungLuas();
            totalLuas += luas;

            if (luas > luasTerbesar) {
                luasTerbesar = luas;
                namaBangunTerbesar = bd.namaBangun;
            }
        }

        System.out.println("Total luas: " + String.format("%.2f", totalLuas));
        System.out.println("Bangun datar terbesar adalah " + namaBangunTerbesar + " dengan Luas " + String.format("%.2f",luasTerbesar));
    }
}
