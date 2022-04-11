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
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        String expected = "Drink";
        //When
        String actual = grocery.getType();
        //Then
        Assert.assertEquals(expected, actual);
    }

    public void testGetExpirationDate() {
        //Given
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        String expected = "05/13/2022";
        //When
        String actual = grocery.getExpirationDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    public void testTestSetName() {
        //Given
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        //When
        grocery.setName("Cookies");
        String expected = "Cookies";
        String actual = grocery.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetPrice() {
        //Given
        Groceries grocery = new Groceries("Milk",2.99,"Drink", "05/13/2022");
        //When
        grocery.setPrice(4.99);
        Double expected = 4.99;
        Double actual = grocery.getPrice();
        //Then
        Assert.assertEquals(expected, actual);
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