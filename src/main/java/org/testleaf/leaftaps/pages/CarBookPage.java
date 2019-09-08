package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CarBookPage  extends ProjectSpecificMethods{
	
	public CarBookPage clickDesSort() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[text()= ' Price: High to Low ']").click();
		Thread.sleep(3000);
		
		return this;
	}
	
	public CarBookPage getFirstCarNmae() {
		String text1 = driver.findElementByXPath("(//div[@class='details'])[1]").getText();
		
		System.out.println(text1);
		return this;
	}

}
