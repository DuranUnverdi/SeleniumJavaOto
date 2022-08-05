import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {
    private WebDriver driver;
    private final By name= By.id("firstName");
    private final By lastName= By.id("lastName");
    private final By email= By.id("userEmail");
    public  PracticeFormPage(WebDriver driver){
        this.driver=driver;
    }
    public void setName(String nameText){
        WebElement nameSpace=driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameText);
    }
    public String getName(){
        WebElement nameSpcae=driver.findElement(name);
        return nameSpcae.getAttribute("value");
    }

    public void setLastName(String lastNameText){
        WebElement lastNameSpace=driver.findElement(lastName);
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastNameText);
    }
    public String getLastName(){
        WebElement lastNameSpcae=driver.findElement(lastName);
        return lastNameSpcae.getAttribute("value");
    }
    public void setEmail(String emailText){
        WebElement emailSpace=driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailText);
    }
    public String getEmail(){
        WebElement emailSpcae=driver.findElement(email);
        return emailSpcae.getAttribute("value");
    }
}
