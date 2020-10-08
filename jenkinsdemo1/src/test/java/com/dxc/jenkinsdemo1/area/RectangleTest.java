package com.dxc.jenkinsdemo1.area;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	Rectangle rect=null;
	@Before
	public void setUp() throws Exception
	{
		rect=new Rectangle();
	}
	@After
	public void tearDown() throws Exception
	{
		rect=null;
	}
	@Test
	public void testarea()
	{
		assertEquals(30,rect.area(10,20));
	}
}
