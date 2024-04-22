import org.junit.Before;

public class TestBase {

    ApplicationManager manager;

    @Before
    public void setUp() {
        manager = ApplicationManager.getInstance();
//        if (driver.get() == null) {
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//            driver.set(new ChromeDriver());
//        }
//        }
    }

//    @After
//    public void tearDown() {
//        manager.Stop();
//    }
}
