package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoRerun {
	
	@Test
	private void tc01() {
	System.out.println("TestingSample1:  Test1");
	String s="Arun";
	boolean contains = s.contains("k");
	Assert.assertEquals(contains, true);
	System.out.println(contains+"\t"+s);

}
	@Test
	private void tc02() {
		System.out.println("Testing Sample 2 : Test 2");

	}
	@Test
	private void tc03() {
		System.out.println("Testing Sample 3 : Test3 ");
	}
}
