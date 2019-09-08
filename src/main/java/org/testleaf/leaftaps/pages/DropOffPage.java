package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class DropOffPage extends ProjectSpecificMethods{
	
	public CarBookPage clickDone() {
		driver.findElementByClassName("proceed").click();
		return new CarBookPage();
	}

}
