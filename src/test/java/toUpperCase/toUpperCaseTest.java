package toUpperCase;
import org.junit.Test;
import org.junit.Assert;


public class toUpperCaseTest {
	@Test
	public void shouldChangeToUpperCase() {
	//arrange
	toUpperCase underTest = new toUpperCase();
	String input = "This Is A String!";
	//act
	String result = underTest.makeUpperCase(input);
	//assert
	Assert.assertEquals("THIS IS A STRING!", result);
	}
	
}
