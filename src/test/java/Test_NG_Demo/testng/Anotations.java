package Test_NG_Demo.testng;

import org.testng.annotations.Test;

public class Anotations {	
	@Test
	public void launchBrowser() throws Exception {
		System.out.println("launch Browser with selenium code");
		throw new Exception("sads");
	
		
	}
		
		@Test
		public void longinToWebsite() {
			System.out.println("logged succesfully to Browse");
			
			
			
		
	}

}
