package Test_NG_Demo.testng;

import org.testng.annotations.Test;

public class PriorityDemo {
	public class Annotation_Test 
	
	{
		@Test(priority=0,enabled=true)
		public void m1() {
			System.out.println("m1");
		}
		@Test(priority=0)
		public void m2() {
			System.out.println("a1");
		}
		@Test(priority=-2)
		public void m3() {
			System.out.println("b1");
		}
		@Test(priority=-1)
		public void m4() {
			System.out.println("z1");
		}
		

	}
	}
