import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    //an instance of ThomasMurray class
    ThomasMurray thomasMurray;

    //things to do before test is launched
    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver is launching.../N");
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_new.exe");
        driver = new ChromeDriver();
        System.out.println("Driver is launched./N");

        thomasMurray = new ThomasMurray(driver);

        driver.manage().window().maximize();
        driver.get("http://demo.redmine.org/");
        System.out.println("Demo Redmine Website is opened./N");

    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver is shut down./N");
    }

}
