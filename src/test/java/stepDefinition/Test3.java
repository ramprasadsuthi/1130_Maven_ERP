package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test3 {
	
	int a, b, sum; 
	
	@Given("Get the value of {int} and {int}")
	public void get_the_value_of_and(int num1, int num2) {
	    a = num1; 
	    b = num2; 
	}
	@When("Add a and b")
	public void add_a_and_b() {
	    sum = a+b;
	}
	@Then("Verify the addition with {int}")
	public void verify_the_addition_with(int expResult) {
	    Assert.assertEquals(sum, expResult);
	}

}
