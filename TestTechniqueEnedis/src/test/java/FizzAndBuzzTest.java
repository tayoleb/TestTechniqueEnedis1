


import org.junit.Assert;
import org.junit.Test;


public class FizzAndBuzzTest {

	 @Test
	    public void getResultWhenDividedBy15() {
	        Assert.assertEquals("fizzbuzz", FizzAndBuzz.divisionResult(15));
	        Assert.assertEquals("fizzbuzz", FizzAndBuzz.divisionResult(30));
	    }

}
