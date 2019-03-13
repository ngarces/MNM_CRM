/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author MeganWilliamson
 */
class SalesTest {
	Sales saleOne;

	@Before
	public void initialize() {
		saleOne = new Sales("Candy", 800, 405.30);
		saleOne.printSales();
	}
	
	@Test
	public void testWhatWasSold() {
		assertEquals("Candy", saleOne.getWhatWasSold());
	}
	
	@Test
	public void testHowMuchWasSold() {
		assertEquals(800, saleOne.getHowMuchWasSold());
	}
	
	@Test
	public void testProfit() {
		assertEquals(405.30, saleOne.getProfit());
	}

}
