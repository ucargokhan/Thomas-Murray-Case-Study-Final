import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThomasMurray {
    private WebDriver driver;

    public By loginButton  = By.cssSelector("a[class='login']");
    public By usernameField = By.id("username");
    public By passwordField = By.id("password");
    public By loginButtonForSignIn = By.cssSelector("input[name='login']");
    public By loginCheckField = By.cssSelector("a[class='user active']");
    public String loginCheckString = "gokhan_ucar";
    public By myAccountButton = By.cssSelector("a[class='my-account']");
    public By firstNameFild = By.id("user_firstname");
    public By emailNotificationField = By.id("pref_no_self_notified");
    public By saveChangesButton = By.cssSelector("input[name='commit']");
    public By accountDetailsField = By.cssSelector("strong>a[class='user active']");
    public By signOutButton = By.cssSelector("a[class='logout']");


    public ThomasMurray(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        String text = element.toString();
        element.click();
        System.out.println(text + " is clicked./N");
    }

    public String generateRandomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    public void sendKeysToTheElement(By elementPath, String keyText){
        WebElement element = driver.findElement(elementPath);
        String text = element.toString();
        element.click();
        element.sendKeys(keyText);
        System.out.println(keyText + " is typed into " + text + "/N");
    }

    public void clearThenSendKeysToTheElement(By elementPath, String keyText) throws InterruptedException {
        WebElement element = driver.findElement(elementPath);
        String text = element.toString();
        element.click();
        element.clear();
        waitSeconds(2);
        element.sendKeys(keyText);
        System.out.println(keyText + " is typed into " + text +"/N");
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
        System.out.println(seconds + " second waited./N");
    }

    public void validateIsEquals(By elementToCheck, String expectedCondition)
    {
        WebElement element = driver.findElement(elementToCheck);
        Assert.assertEquals(element.getText(), expectedCondition);
        System.out.println("Assertion was successful for: " + expectedCondition + "/N");
    }

    public void checkIfVisible (By elementPath){
        WebElement element = driver.findElement(elementPath);
        Assert.assertTrue("Element is visible: /N" + element,element.isDisplayed());
    }




}