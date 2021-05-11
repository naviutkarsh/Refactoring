import java.util.List;

public class Statement {

  String statement(String name, List<Rental> rentals, double totalAmount, int frequentRenterPoints) {
    StringBuilder result = new StringBuilder(header(name));
    for (Rental each : rentals) {
      result.append(lineItem(each.getMovie().getTitle(), each.amount()));
    }

    result.append(footer(totalAmount, frequentRenterPoints));
    return result.toString();
  }

  private String lineItem(String title, double amount) {
    return "\t" + title + "\t" + amount + "\n";
  }

  private String footer(double totalAmount, int frequentRenterPoints) {
    String footer1 = "You owed " + totalAmount + "\n";
    String footer2 = "You earned " + frequentRenterPoints + " frequent renter points";
    return footer1 + footer2;
  }

  private String header(String name) {
    return "Rental Record for " + name + "\n";
  }
}
