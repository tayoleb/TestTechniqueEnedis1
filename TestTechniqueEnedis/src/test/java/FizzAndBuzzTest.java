import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FizzAndBuzzTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzAndBuzz.getResult(1));
        Assert.assertEquals("2", FizzAndBuzz.getResult(2));
        Assert.assertEquals("4", FizzAndBuzz.getResult(4));
    }

}
