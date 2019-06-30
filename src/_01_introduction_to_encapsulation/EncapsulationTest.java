package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EncapsulationTest {
	//Tests Encapsulation
	
	@Test
	public void testItemsReceived() {
		EncapsulateTheData ed = new EncapsulateTheData(-5, 50, "drone", new ArrayList<String>());
		assertEquals(0, ed.itemsReceived);
	}
	
	@Test
	public void testDegreesTurned() {
		EncapsulateTheData ed = new EncapsulateTheData(5, 365, "drone", new ArrayList<String>());
		assertEquals(0, ed.degreesTurned);
	}
	
	@Test
	public void testNomenclature() {
		EncapsulateTheData ed = new EncapsulateTheData(5, 50, "", new ArrayList<String>());
		assertEquals(" ", ed.nomenclature);
	}
	
	@Test
	public void testMemberObject() {
		EncapsulateTheData ed = new EncapsulateTheData(5, 50, "drone", "I am me");
		if(!(ed.memberObj instanceof String)  && (ed.memberObj instanceof Object)) {
			
		}
		else {
			fail("Still a String or not an Object");
		}
	}
	
}
