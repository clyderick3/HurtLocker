import junit.framework.TestCase;
import org.junit.Assert;

public class GroceriesTest extends TestCase {

    public void testTestGetName() {
        //Given
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        String expected = "Milk";
        //When
        String actual = grocery.getName();
        //Then
        Assert.assertEquals(expected, actual);

    }

    public void testGetPrice() {
        //Given
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        Double expected = 2.99;
        //When
        Double actual = grocery.getPrice();
        //Then
        Assert.assertEquals(expected, actual);

    }

    public void testGetType() {
        //Given

        //When

        //Then

    }

    public void testGetExpirationDate() {
        //Given

        //When

        //Then

    }

    public void testTestSetName() {
        //Given

        //When

        //Then

    }

    public void testSetPrice() {
        //Given

        //When

        //Then

    }

    public void testSetType() {
        //Given

        //When

        //Then

    }

    public void testSetExpirationDate() {
        //Given

        //When

        //Then

    }
}