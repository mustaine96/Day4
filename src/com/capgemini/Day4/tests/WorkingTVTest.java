package com.capgemini.Day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day4.WorkingTV;

class WorkingTVTest {
	WorkingTV test1;
	
	@BeforeEach
	void setUp() {
		test1=new WorkingTV(true,67,300);
	}

	@Test
	void testPowerChange() {
		assertEquals(true,test1.PowerChange(true));
		assertEquals(false,test1.PowerChange(false));
	}
	
	@Test
	void testChangeVolume() {
		assertEquals(72,WorkingTV.ChangeVolume(5));
		assertEquals(67,WorkingTV.ChangeVolume(-5));		
	}
	@Test
	void testChangeChannel() {
		assertEquals(242,test1.ChangeChannel(242));
		assertEquals(0,test1.ChangeChannel(1000));
		
	}
	
	

}
