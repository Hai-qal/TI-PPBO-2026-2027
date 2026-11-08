public class Motor extends Kendaraan {
    protected String jenisMotor;

    public Motor(String nama, String merek, double kecepatanMaks, String jenis) {
        super(nama, merek, kecepatanMaks);
        this.jenisMotor = jenis;
    }
}
