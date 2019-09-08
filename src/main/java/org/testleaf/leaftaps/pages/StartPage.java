package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class StartPage  extends ProjectSpecificMethods{
	
	public StartPage clickThoraipakkam()
	{
	
	driver.findElementByXPath("//div[@class='component-popular-locations']//div[4]").click();
	return this;

}
	
	public PickupPage clickNext()
	{
		driver.findElementByClassName("proceed").click();
		return new PickupPage();
	}
}
