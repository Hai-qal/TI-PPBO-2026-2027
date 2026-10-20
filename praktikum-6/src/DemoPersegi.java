public class DemoPersegi {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(4);
        Persegi p2 = new Persegi(6);
        Persegi p3 = new Persegi(8);

        System.out.println("Daftar Hasil Persegi");
        System.out.println();

        System.out.println("Persegi 1");
        System.out.println("Sisi     : " + p1.sisi);
        System.out.println("Luas     : " + p1.Luas());
        System.out.println("Keliling : " + p1.Keliling());
        System.out.println();

        System.out.println("Persegi 2");
        System.out.println("Sisi     : " + p2.sisi);
        System.out.println("Luas     : " + p2.Luas());
        System.out.println("Keliling : " + p2.Keliling());
        System.out.println();

        System.out.println("Persegi 3");
        System.out.println("Sisi     : " + p3.sisi);
        System.out.println("Luas     : " + p3.Luas());
        System.out.println("Keliling : " + p3.Keliling());
    }
}
