public abstract class Price {
  private final int priceCode;

  private Price(int priceCode) {
    this.priceCode = priceCode;
  }

  public static Price regularPrice() {
    return new RegularPrice();
  }

  public static Price newReleasePrice() {
    return new NewReleasePrice(Movie.NEW_RELEASE);
  }

  public static Price childrensPrice() {
    return new ChildrenPrice();
  }

  public int priceCode() {
    return priceCode;
  }

  abstract double amount(int daysRented);

  private static class ChildrenPrice extends Price {
    public ChildrenPrice() {
      super(Movie.CHILDRENS);
    }

    double amount(int daysRented) {
      double amount = 0;
      amount += 1.5;
      if (daysRented > 3)
        amount += (daysRented - 3) * 1.5;
      return amount;
    }
  }

  private static class NewReleasePrice extends Price {
    public NewReleasePrice(int newRelease) {
      super(Movie.NEW_RELEASE);
    }

    double amount(int daysRented) {
      double amount = 0;
      amount += daysRented * 3;
      return amount;
    }
  }

  private static class RegularPrice extends Price {
    public RegularPrice() {
      super(Movie.REGULAR);
    }

    double amount(int daysRented) {
      double amount = 0;
      amount += 2;
      if (daysRented > 2)
        amount += (daysRented - 2) * 1.5;
      return amount;
    }
  }
}
