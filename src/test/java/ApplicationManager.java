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

    public static ThreadLocal<ApplicationManager> applicationManagerThreadLocal = new ThreadLocal<ApplicationManager>();

    private ApplicationManager(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        String baseURL = "https://diary.anek.ws/";

        NavigationHelper navigation = new NavigationHelper(this, baseURL);
        LoginHelper login = new LoginHelper(this);
        NoteHelper note = new NoteHelper(this);

        navigation.OpenHomePage(baseURL);
        navigation.SetWindowSize();

        login.LoginFielsClick();
        login.LoginField();
        login.PasswordFieldClick();
        login.PasswordField();
        login.AuthBtn();

        note.TextEditCkick();
        note.TextEdit();
        note.KeuWordClick();
        note.KeuWordEdit();
        note.SaveBtn();

        try {driver.quit();}
        catch (Exception e){}
    }

    public static ApplicationManager GetInstance(){;
        if (applicationManagerThreadLocal.get() == null) {
            ApplicationManager newInstance = new ApplicationManager();
            newInstance.getNavigation();
            applicationManagerThreadLocal.set(newInstance);
        }
        return applicationManagerThreadLocal.get();
    }

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

//    public void  Stop(){
//        driver.quit();
//    }
}
