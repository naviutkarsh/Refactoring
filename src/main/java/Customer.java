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
    double totalAmount = 0;


    for (Rental each : myRentals) {
      double thisAmount = amountFor(each);
      result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
      totalAmount += thisAmount;
    }

    totalAmount = totalAmount(this.myRentals);

    int frequentRenterPoints = frequentRenterPoints(this.myRentals);

    // add footer lines
    result += footer(totalAmount, frequentRenterPoints);

    return result;
  }

  private double totalAmount(List<Rental> rentals) {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += amountFor(each);
    }
    return totalAmount;
  }

  private double amountFor(Rental rental) {
    double thisAmount = 0;
    switch (rental.getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmount += 2;
        if (rental.getDaysRented() > 2)
          thisAmount += (rental.getDaysRented() - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        thisAmount += rental.getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if (rental.getDaysRented() > 3)
          thisAmount += (rental.getDaysRented() - 3) * 1.5;
        break;
    }
    return thisAmount;
  }

  private int frequentRenterPoints(List<Rental> rentals) {
    int frequentRenterPoints = 0;
    for (Rental each : rentals) {
      frequentRenterPoints++;
      if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1)
        frequentRenterPoints++;
    }
    return frequentRenterPoints;
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
