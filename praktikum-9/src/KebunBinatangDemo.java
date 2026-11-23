public class KebunBinatangDemo {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
                new Bebek("Donald"),
                new Kucing("Milo"),
                new Anjing("Rex"),
                new Kucing("Oyen"),
                new Bebek("Nick"),
        };

        for (Hewan h : daftarHewan) {
            h.bersuara(); // versi method sesuai object aslinya
        }
    }
}
