import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void amountShouldBe5ForRegularMovieRentedFor5days() {
        Movie jaws = new Movie("Jaws", Price.regularPrice());
        assertEquals(6.5, jaws.amount(5), 0.01);
    }

    @Test
    public void renterPointsForRegularMovieFor5days() {
        Movie jaws = new Movie("Jaws", Price.regularPrice());
        assertEquals(1.0, jaws.renterPoints(5), 0.01);
    }
}

//New Requirement

