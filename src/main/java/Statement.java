import java.util.List;

public abstract class Statement {
    String statement(String name, List<Rental> rentals, double totalAmount, int frequentRenterPoints) {
        StringBuilder result = new StringBuilder(header(name));
        for (Rental each : rentals) {
            result.append(lineItem(each.getMovie().getTitle(), each.amount()));
        }

        result.append(footer(totalAmount, frequentRenterPoints));
        return result.toString();
    }

    protected abstract String lineItem(String title, double amount);

    protected abstract String footer(double totalAmount, int frequentRenterPoints);

    protected abstract String header(String name);
}
