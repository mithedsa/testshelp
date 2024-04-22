import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager  {
    public WebDriver driver;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public NavigationHelper navigationHelper;
    public LoginHelper loginHelper;
    public NoteHelper noteHelper;

//    public static ThreadLocal<ApplicationManager> applicationManagerThreadLocal = new ThreadLocal<>();
//    private static ThreadLocal<AppManager> app = new ThreadLocal<>();
////    public static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private static ApplicationManager instance = new ApplicationManager();

    private ApplicationManager(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        String baseURL = "https://diary.anek.ws/";


        NavigationHelper navigation = new NavigationHelper(this, baseURL);
        this.navigationHelper = navigation;

        LoginHelper login = new LoginHelper(this);
        this.loginHelper = login;

        NoteHelper note = new NoteHelper(this);
        this.noteHelper = note;

        Destructor.addManagerDestructor(this);


//        try {driver.quit();}
//        catch (Exception e){}
    }

//    public static ApplicationManager GetInstance(){;
//        if (applicationManagerThreadLocal.get() == null) {
//            ApplicationManager newInstance = new ApplicationManager();
//            newInstance.navigationHelper.OpenHomePage();
//            applicationManagerThreadLocal.set(newInstance);
//        }
//        return applicationManagerThreadLocal.get();
//        if (webDriverThreadLocal.get() == null){
//            System.setProperty()
//        }
//        WebDriver currentDriver = webDriverThreadLocal.get();
//        if (currentDriver != null) {
//           currentDriver.quit();
//           webDriverThreadLocal.remove();
//        }


    public WebDriver getDriver() {
        return driver;
    }

    public NavigationHelper getNavigation() {
        return navigationHelper;
    }

    public LoginHelper getLogin() {
        return loginHelper;
    }

    public NoteHelper getNote() {
        return noteHelper;
    }

    public static ApplicationManager getInstance () {
        return instance;
    }


//    public void  Stop(){
//        driver.quit();
//    }
}
