package week5.day2Assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadPara extends BaseClassParameters{
@Test(dataProvider = "fetchData")
	public void runCreatePara(String cname,String fname,String lname,String pnum) 
{
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
	}
@DataProvider(name="fetchData")

public String[][] getdata() {
	String [][] data =new String[2][4];
	//1st set
	data[0][0]="CTS";
	data[0][1]="Princila";
	data[0][2]="Edward";
	data[0][3]="99";
	
	//2nd set
		data[1][0]="Qeagle";
		data[1][1]="Babu";
		data[1][2]="M";
		data[1][3]="98";
	
	return data;
	
}

}
