package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueElementPage {
	
WebDriver driver;
	
	
	public SkyBlueElementPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Finding WebElements
	
	@FindBy(how=How.XPATH,using="//button[text()='Set SkyBlue Background']") WebElement SKY_BLUE_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//body[@style='background-color: skyblue;']") WebElement SKY_BLUE_VALIDATION;
	@FindBy(how=How.XPATH,using="//button[text()='Set White Background']") WebElement WHITE_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//body[@style='background-color: white;']") WebElement WHITE_VALIDATION;
	
	public String skyBlueButton()
	{
		String actualSkyButton = SKY_BLUE_BUTTON_ELEMENT.getText();
		return actualSkyButton;
	}
	
	public void clickSkyBlueButton()
	{
		SKY_BLUE_BUTTON_ELEMENT.click();
	}
	
	public String colorValidation()
	{
		String actualcolor = SKY_BLUE_VALIDATION.getCssValue("background-color");
		System.out.println("colorcode :" + actualcolor);
		return actualcolor;
	}
	
	public String whiteButton()
	{
		String actualwhite = WHITE_BUTTON_ELEMENT.getText();
		return actualwhite;
	}
	
	public void clickwhiteButton()
	{
		WHITE_BUTTON_ELEMENT.click();
	}
	
	public String colorWhitevalidation()
	{
		String actualcolorwhite = WHITE_VALIDATION.getCssValue("background-color");
		System.out.println("colorcode :" + actualcolorwhite);
		return actualcolorwhite;
	}
	
	
}
