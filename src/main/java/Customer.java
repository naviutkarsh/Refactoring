import java.util.ArrayList;
import java.util.List;

public class Customer {
  private final String _name;
  private final List<Rental> myRentals = new ArrayList<Rental>();

  public Customer(String name) {
    this._name = name;
  }

  public void addRental(Rental rental) {
    myRentals.add(rental);
  }

  public String getName() {
    return _name;
  }

  public String statement() {
    String name = getName();
    String result = header(name);

    for (Rental each : myRentals) {
      result += "\t" + each.getMovie().getTitle() + "\t" + each.amount() + "\n";
    }

    double totalAmount = totalAmount(this.myRentals);

    int frequentRenterPoints = frequentRenterPoints(this.myRentals);

    // add footer lines
    result += footer(totalAmount, frequentRenterPoints);

    return result;
  }

  private double totalAmount(List<Rental> rentals) {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += each.amount();
    }
    return totalAmount;
  }

  private int frequentRenterPoints(List<Rental> rentals) {
    int totalRenterPoints = 0;
    for (Rental each : rentals) {
      int thisRenterPoints = each.renterPoints(each.getDaysRented());
      totalRenterPoints += thisRenterPoints;
    }
    return totalRenterPoints;
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
