public class Main {
    public static void main(String[] args) {
        Produkt produkt1= new Produkt("alma",100.24);
        Produkt produkt2 = new Produkt("Chai",140.98);
        Produkt produkt3 = new Produkt("Nan",60.78);
        Produkt produkt4 = new Produkt("Su",50.45);
        Client client = new Client("Kurmanbek","Abdullaev",24,
                new Card("Kurmanbek","Abdullaev",12345678,2092.3,1234),
                new Basket(new Produkt[]{produkt2,produkt1}));

client.getCardBalance(client.getCard().getBalans());
    }
}