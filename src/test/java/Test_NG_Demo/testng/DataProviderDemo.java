package Test_NG_Demo.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="Demo_credentials")
	public void loginToBrowser(String sUsername,String spassword) {
		System.out.println("Username"+sUsername+"\t password"+spassword);
		
	}
	@DataProvider(name="Demo_credentials")
	public Object[][] credentials() {
		String[][]strcre= {{"u1","p1"},{"u2","p2"},{"u3","p3"}};
		return strcre;
	}

}
