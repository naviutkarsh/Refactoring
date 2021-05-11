public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String _title;
  private Price price;

  public Movie(String title, Price price) {
    _title = title;
    this.price = price;
  }

  public int getPriceCode() {
    return price.priceCode();
  }


  public String getTitle() {
    return _title;
  }

  double amount(int daysRented) {
    return price.amount(daysRented);
  }

}
