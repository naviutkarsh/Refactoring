import java.util.List;

public class TextStatement extends Statement {

    @Override
    protected String lineItem(String title, double amount) {
        return "\t" + title + "\t" + amount + "\n";
    }

    @Override
    protected String footer(double totalAmount, int frequentRenterPoints) {
        String footer1 = "You owed " + totalAmount + "\n";
        String footer2 = "You earned " + frequentRenterPoints + " frequent renter points";
        return footer1 + footer2;
    }

    @Override
    protected String header(String name) {
        return "Rental Record for " + name + "\n";
    }
}
