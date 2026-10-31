public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku (String judul, String pengarang, int tahunTerbit) {
      this.judul = judul;
      this.pengarang = pengarang;
      this.tahunTerbit = tahunTerbit;
    }

    // Getter untuk judul, pengarang, dan tahun terbit
    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter untuk judul dan pengarang
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
