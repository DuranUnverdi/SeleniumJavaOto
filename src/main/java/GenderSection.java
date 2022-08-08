import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection  {
    private WebDriver driver;
    private final By maleRadioButtonLocator = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioButtonLocator = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioButtonLocator = new By.ByCssSelector("label[for='gender-radio-3']");
    public enum Genders{MALE,FEMALE,OTHER}
    public GenderSection(WebDriver driver){
            this.driver=driver;

    }
    public void clickRadioButton(Genders gender){
            switch (gender){
                case MALE:
                    driver.findElement(maleRadioButtonLocator).click();
                    break;
                case FEMALE:
                    driver.findElement(femaleRadioButtonLocator).click();
                    break;
                case OTHER:
                    driver.findElement(otherRadioButtonLocator).click();
                    break;
            }
    }
    public boolean isRadioButtonChecked(Genders genders){
        return true;
    }
}
