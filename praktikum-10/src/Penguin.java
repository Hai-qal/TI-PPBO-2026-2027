public class Penguin extends Hewan implements BisaBerenang {
    public Penguin(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + ": Hoonk Hoonk!");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang di Air Es");
    }

}
