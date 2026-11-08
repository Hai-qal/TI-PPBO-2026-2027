public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        Staff stf = new Staff("Sulti Syawal", "S002", 4500000, 2000000);
        Direktur drt = new Direktur("Haiqal", "D001", 15000000, 5000000, 20000000);

        System.out.println("=== MANAGER ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan : " +mgr.getTunjanganJabatan());
        System.out.println();

        System.out.println("=== STAFF ===");
        stf.tampilkanData();
        System.out.println("Tunjangan Kinerja : " +stf.getTunjanganKinerja());
        System.out.println();

        System.out.println("=== DIREKTUR ===");
        drt.tampilkanData();
        System.out.println("Tunjangan Saham   : " + drt.getTunjanganSaham());
    }
}
