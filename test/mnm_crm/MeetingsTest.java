package mnm_crm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

class MeetingTest {
	
	Meeting meetOne;
	Person John = new Person("John", "Doe",);
	

	@Before
	public void initalization() {
		meetOne = new Meeting(07/17/1990, "To plan the project", John );
	}
	
	@Test
	public void testWhenWeMeet() {
		assertEquals(07/17/1990, meetOne.getDate());
	}
	
	@Test
	public void testWhyWeMeet() {
		assertEquals("To plan the project", meetOne.getWhy());
	}
	
	@Test
	public void testPrintAttendees() {
		meetOne.printAttendees();
	}

}
