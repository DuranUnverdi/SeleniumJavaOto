import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public  class BaseTest {

    protected WebDriver driver;
    PracticeFormPage pracForm;
    @BeforeAll
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        pracForm=new PracticeFormPage(driver);
    }
    @AfterAll
    public  void tearDown(){
        //driver.close();
        System.out.println("Test Finished");
    }
}
