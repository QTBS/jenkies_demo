package Test_NG_Demo.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation_Test {
	@Test
	public void aa1() {
		System.out.println("m1");
	}
	@Test
	public void aa2() {
		System.out.println("a1");
	}
	@Test
	public void AAa1() {
		System.out.println("b1");
	}
	@Test
	public void A1a2() {
		System.out.println("z1");
	}
	
	@BeforeSuite
	public void zz1() {
		System.out.println("zz1");
	}
	@BeforeSuite
	public void zz2() {
		System.out.println("zz2");
	}
}
