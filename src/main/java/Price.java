public abstract class Price {

  public static Price regularPrice() {
    return new RegularPrice();
  }

  public static Price newReleasePrice() {
    return new NewReleasePrice();
  }

  public static Price childrensPrice() {
    return new ChildrenPrice();
  }

  abstract double amount(int daysRented);

  int renterPoints(int daysRented) {
    return 1;
  }

  private static class ChildrenPrice extends Price {

    double amount(int daysRented) {
      double amount = 1.5;
      if (daysRented > 3)
        amount += (daysRented - 3) * 1.5;
      return amount;
    }
  }

  private static class NewReleasePrice extends Price {
    int renterPoints(int daysRented) {
      return daysRented > 1 ? 2 : 1;
    }

    double amount(int daysRented) {
      return daysRented * 3;
    }
  }

  private static class RegularPrice extends Price {
    double amount(int daysRented) {
      double amount = 2;
      if (daysRented > 2)
        amount += (daysRented - 2) * 1.5;
      return amount;
    }
  }
}
