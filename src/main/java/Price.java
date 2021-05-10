public class Price {
  private final int priceCode;

  public Price(int priceCode) {
    this.priceCode = priceCode;
  }

  public int priceCode() {
    return priceCode;
  }

  double amount(int daysRented) {
    double amount = 0;
    switch (priceCode()) {
      case Movie.REGULAR:
        amount += 2;
        if (daysRented > 2)
          amount += (daysRented - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        amount += daysRented * 3;
        break;
      case Movie.CHILDRENS:
        amount += 1.5;
        if (daysRented > 3)
          amount += (daysRented - 3) * 1.5;
        break;
    }
    return amount;
  }
}
