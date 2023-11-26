package org.test;

import org.testng.annotations.Test;

public class DemoGroup {
	
	
	@Test(groups="@Regg")
	private void tc01() {
		System.out.println("Testing Sample 1  :Regg");
	

	}
	@Test(groups="@Sanity",dependsOnGroups="@Regg")
	private void tc02() {
		System.out.println("Testing Sample 2  :Sanity");
	

	}
	@Test(groups="@Smoke")
	private void tc03() {
		System.out.println("Testing Sample 3 :Smoke");
	

	}
	@Test(groups="@Sanity")
	private void tc04() {
		System.out.println("Testing Sample 4 :Sanity");
	

	}
	@Test(groups="@Smoke",dependsOnMethods="@Sanity")
	private void tc05() {
		System.out.println("Testing Sample 5 :Smoke");
	

	}
	@Test(groups="@Sanity")
	private void tc06() {
		System.out.println("Testing Sample 6 :Sanity");
	

	}
	@Test(groups="@Regg")
	private void tc07() {
		System.out.println("Testing Sample 7 :Regg");
	

	}
	@Test(groups="@Smoke")
	private void tc08() {
		System.out.println("Testing Sample 8  :Smoke");
	

	}
	@Test(groups="@Sanity")
	private void tc09() {
		System.out.println("Testing Sample 9 :Sanity");
	

	}
	@Test(groups="@Smoke")
	private void tc10() {
		System.out.println("Testing Sample 9 :Smoke");
	

	}

}
