package pages.headerFeaturesPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;

public class EklipseStudioPage {

    private final WebDriver driver;

    public EklipseStudioPage(){
        this.driver = Hooks.driver;
    }

    private By h1 = By.xpath("//h1[@class='elementor-heading-title elementor-size-default']");


    public String getLandingPage () {
        return driver.findElement(h1).getText();
    }

    public void verifyLandingPageOfEklispe(){
        String expectedHeading = "Repurpose Video Content, Instantly with Eklipse Studio!";
        String actualHeading = driver.findElement(h1).getText();
        Assert.assertEquals("Heading does not match",expectedHeading,actualHeading);
    }

}
