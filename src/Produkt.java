public class Produkt {
    private String produkt;
    private  double price;

    public Produkt() {
    }

    public Produkt(String produkt, double price) {
        this.produkt = produkt;
        this.price = price;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " " + produkt +
                ", price=" + price +"\n";
    }
}
