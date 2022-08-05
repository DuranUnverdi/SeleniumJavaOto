import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void setName(){
        pracForm.setName("Duran");
        Assertions.assertEquals("Duran",pracForm.getName(),"name values is not assert");
    }
    @Test
    public void setLastName(){
        pracForm.setLastName("Ünverdi");
        Assertions.assertEquals("Ünverdi",pracForm.getLastName(),"lastname values is not assert");
    }
    @Test
    public void setEmail(){
        pracForm.setEmail("duranunverdi1905@gmail.com");
        Assertions.assertEquals("duranunverdi1905@gmail.com",pracForm.getEmail(),"email values is not assert");
    }
}
