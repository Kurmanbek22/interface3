import java.util.Arrays;

public class Basket {
    private Produkt[] produkts;

    public Basket() {
    }

    public Basket(Produkt[] produkts) {
        this.produkts = produkts;
    }

    public double getSumma() {
        Produkt produkt = new Produkt();
        double summa =0;
        for (Produkt produkt1:produkts){
            summa+=produkt1.getPrice();
        }
return summa;
    }

    @Override
    public String toString() {
        return " " + Arrays.toString(produkts);
    }
}
