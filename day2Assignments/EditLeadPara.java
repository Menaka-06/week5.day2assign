package week5.day2Assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLeadPara extends BaseClassParameters{
@Test(dataProvider = "getinputs")
	public void runEditLead(String phnum,String compname) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compname);
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider
	public String[][] getinputs()
	{
		String[][] data=new String[2][2];
		data[0][0]="TestLeaf";
		data[0][1]="9876";
		
		data[1][0]="QEagle";
		data[1][1]="8769";
		return data;
	}

}
