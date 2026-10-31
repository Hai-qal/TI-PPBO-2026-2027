public class Siswa {
    private double nilai;

    // Setter untuk memvalidasi nilai
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai di luar rentang 0-100 ditolak!");
        }
    }

    // Getter untuk mengambil nilai
    public double getNilai() {
        return nilai;
    }

    // Method untuk menentukan nilai huruf
    public String getNilaiHuruf() {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}