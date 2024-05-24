public class Card {
    private String firstName;
    private  String lastName;
    private long cardNumber;
    private double balance;
    private int password;

    public Card() {
    }

    public Card(String firstName, String lastName, long cardNumber, double balance, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalans() {
        return balance;
    }

    public void setBalans(double balans) {
        this.balance = balans;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Card{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber=" + cardNumber +
                ", balans=" + balance +
                ", password=" + password +
                '}';
    }
}
