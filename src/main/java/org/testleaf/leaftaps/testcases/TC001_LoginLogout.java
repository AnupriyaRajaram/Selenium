package org.testleaf.leaftaps.testcases;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.leaftaps.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{



	@Test
	/*(dataProvider="fetchData")*/
	public void runTC001() throws InterruptedException {
		new HomePage()
		.clickstart()
		.clickThoraipakkam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickDesSort()
		.getFirstCarNmae();
	}

	/*new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();*/
}









