import java.util.ArrayList;
import java.util.List;

public class Customer {
  private final String _name;
  private final List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this._name = name;
  }

  public void addRental(Rental rental) {
    rentals.add(rental);
  }

  public String getName() {
    return _name;
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
      int renterPoint = each.renterPoints(each.getDaysRented());
      totalRenterPoints += renterPoint;
    }
    return totalRenterPoints;
  }

  public String statement(Statement statement) {
    return statement.statement(getName(), this.rentals, totalAmount(this.rentals), frequentRenterPoints(this.rentals));
  }

}
