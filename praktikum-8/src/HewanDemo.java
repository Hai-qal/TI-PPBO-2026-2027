public class HewanDemo {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kucing";
        System.out.println("" +k.nama);
        k.bersuara();

        Anjing a = new Anjing();
        a.nama = "Anjing";
        System.out.println("" +a.nama);
        a.bersuara();
    }
}