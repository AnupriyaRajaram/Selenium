package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class PickupPage extends ProjectSpecificMethods {

	public PickupPage clickTomorrow() {
		driver.findElementByXPath("//div[text()='Mon']").click();
		return this;
	}

	public DropOffPage clickNext() {
		driver.findElementByClassName("proceed").click();
		return new DropOffPage();
	}
}


