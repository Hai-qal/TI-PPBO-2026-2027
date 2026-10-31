public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua objek rekening
        RekeningBank rek1 = new RekeningBank("1943", "Haiqal", 2000000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("1945", "Alvin Maulana", 1000000, "Giro");

        // Skenario 1: Setor dan tarik rekening Haiqal
        System.out.println("=== Skenario 1: Setor dan Tarik Rekening Haiqal ===");
        rek1.setor(500000);
        rek1.tarik(300000);
        System.out.println("Saldo Akhir Haiqal: Rp" + rek1.getSaldo());

        // Skenario 2: Setor dan tarik rekening Alvin Maulana
        System.out.println("\n=== Skenario 2: Setor dan Tarik Rekening Alvin Maulana ===");
        rek2.tarik(300000);
        rek2.setor(20000);
        System.out.println("Saldo Akhir Alvin Maulana: Rp" + rek2.getSaldo());

        // Skenario 3: Transfer berhasil
        System.out.println("\n=== Skenario 3: Transfer Berhasil ===");
        rek1.transferKe(rek2, 40000);

        // Skenario 4: Transfer gagal karena saldo tidak mencukupi
        System.out.println("\n=== Skenario 4: Transfer Gagal (Saldo Tidak Cukup) ===");
        rek1.transferKe(rek2, 7000000);

        // Skenario 5: Transfer ke rekening sendiri
        System.out.println("\n=== Skenario 5: Transfer ke Rekening Sendiri ===");
        rek1.transferKe(rek1, 100000);

        // Skenario 6: Transfer tanpa rekening tujuan
        System.out.println("\n=== Skenario 6: Transfer Tanpa Rekening Tujuan ===");
        rek1.transferKe(null, 100000);

        // Pengujian validasi setor dan tarik
        System.out.println("\n=== Pengujian Validasi Setor dan Tarik ===");
        rek1.setor(-1000);
        rek2.tarik(0);
        rek2.tarik(500000);

        // Mutasi akhir rekening Haiqal
        System.out.println("\n=== Mutasi Akhir Haiqal ===");
        rek1.cetakMutasi();

        // Mutasi akhir rekening Alvin MAULANA
        System.out.println("\n=== Mutasi Akhir Alvin Maulana ===");
        rek2.cetakMutasi();
    }
}