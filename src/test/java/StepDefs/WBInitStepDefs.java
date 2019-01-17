package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class WBInitStepDefs {
   WebDriver dr;
    @Given("^Ran the Feature File$")
    public void step() {
        System.out.println("Initiating ChromeDriver");
        //dr = new ChromeDriver();

    }
    @When("^Set the Key & Value$")
    public void step1(){
        System.out.println("Opening Chrome after key & Value set ");
        System.out.println("");
        dr = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",".\\WBInit\\src\\test\\Utilities");
       // dr.get("https://www.google.com/intl/en-GB/gmail/about/#");
    }
    @Then("^Open Gmail in Chrome$")
    public void step2()
    {
        System.out.println("I'm Quitting Chrome");
        dr.get("https://www.google.com/intl/en-GB/gmail/about/#");
        dr.quit();
    }

}
