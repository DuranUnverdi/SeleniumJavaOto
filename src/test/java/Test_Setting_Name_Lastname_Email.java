import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void setName(){
        pracForm.setName("Duran");
    }
    @Test
    public void setLastName(){
        pracForm.setLastName("Ünverdi");

    }
    @Test
    public void setEmail(){
        pracForm.setEmail("duranunverdi1905@gmail.com");

    }
}
