package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BrowserFactory;
import page.SkyBlueElementPage;

public class StepDefinition {

	SkyBlueElementPage skyblue;
	// BrowserFactory bp;
	WebDriver driver;

	@Before
	public void setup() {
		driver = BrowserFactory.init();
		skyblue = PageFactory.initElements(driver, SkyBlueElementPage.class);
	}

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String Button) throws Throwable {
		if (Button == "Set Skyblue Background") {
			String actualButton = skyblue.skyBlueButton();
			String expectedButton = "Set Skyblue Background";
			Assert.assertEquals("Button is not existed", expectedButton, actualButton);
		} else {
			String actualButton = skyblue.whiteButton();
			String expectedButton = "Set White Background";
			Assert.assertEquals("Button is not existed", expectedButton, actualButton);
		}

	}

	@When("^I click on the button as \"([^\"]*)\"$")
	public void i_click_on_the_button_as(String button) throws Throwable {
		switch (button) {
		case "Set Skyblue Background":
			skyblue.clickSkyBlueButton();
			Thread.sleep(3000);
			break;

		case "Set White background":
			skyblue.clickwhiteButton();
			Thread.sleep(3000);
			break;

		default:
			break;

		}
	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		String expectedColorcode = "rgba(135, 206, 235, 1)";
		String actualcolor = skyblue.colorValidation();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Assert.assertEquals("Page color is not matching ", expectedColorcode, actualcolor);
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		String expectedColorCode = "rgba(255, 255, 255, 1)";
		String actualcolor = skyblue.colorWhitevalidation();

		try {
			Thread.sleep(3000);
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

		Assert.assertEquals("Page color is not matching", expectedColorCode, actualcolor);

	}

	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}

}
