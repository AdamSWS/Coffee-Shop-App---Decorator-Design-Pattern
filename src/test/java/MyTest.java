import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MyTest {
	Coffee order;

	@Test
	void testOrderingBasicCoffee() {
		order = new BasicCoffee();
		assertEquals("BasicCoffee", order.getClass().getName(), "This basic coffee is not ordering properly");
	}

	@Test
	void testOrderingBasicCoffeeWithSugar() {
		order = new Sugar(new BasicCoffee());
		assertEquals("Sugar", order.getClass().getName(), "Sugar was not added to the order properly");
	}

	@Test
	void testOrderingBasicCoffeeWithCream() {
		order = new Cream(new BasicCoffee());
		assertEquals("Cream", order.getClass().getName(), "Cream was not added to the order properly");
	}

	@Test
	void testOrderingBasicCoffeeWithCaramel() {
		order = new Caramel(new BasicCoffee());
		assertEquals("Caramel", order.getClass().getName(), "Cream was not added to the order properly");
	}

	@Test
	void testOrderingBasicCoffeeWithOreos() {
		order = new Oreos(new BasicCoffee());
		assertEquals("Oreos", order.getClass().getName(), "This basic coffee is not ordering properly");
	}

	@Test
	void testOrderingBasicCoffeeWithExtraShot() {
		order = new ExtraShot(new BasicCoffee());
		assertEquals("ExtraShot", order.getClass().getName(), "This basic coffee is not ordering properly");
	}

	@Test
	void checkPricingBasicCoffee() {
		order = new BasicCoffee();
		double cost = order.makeCoffee();
		assertEquals(3.99, cost, "This basic coffee is not ordering properly");
	}

	@Test
	void checkPricingBasicCoffeeWithSugar() {
		order = new Sugar(new BasicCoffee());
		double cost = order.makeCoffee();
		assertEquals(4.49, cost, "This basic coffee is not ordering properly");
	}

	@Test
	void checkPricingBasicCoffeeWithCream() {
		order = new Cream(new BasicCoffee());
		double cost = order.makeCoffee();
		assertEquals(4.49, cost, "This basic coffee is not ordering properly");
	}

	@Test
	void checkPricingBasicCoffeeWithOreos() {
		order =new Oreos(new BasicCoffee());
		double cost = order.makeCoffee();
		assertEquals(4.99, cost, "This basic coffee is not ordering properly");
	}

	@Test
	void checkPricingBasicCoffeeWithOreosandCream() {
		order =new Cream(new Oreos(new BasicCoffee()));
		double cost = order.makeCoffee();
		assertEquals(5.49, cost, "This basic coffee is not ordering properly");
	}

}
