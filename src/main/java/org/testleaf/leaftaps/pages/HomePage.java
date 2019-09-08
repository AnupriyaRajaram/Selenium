package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
public StartPage clickstart() {
	driver.findElementByClassName("search").click();
	return new StartPage();
}

}










