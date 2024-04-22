import org.openqa.selenium.By;

public class LoginHelper extends HelperBase{
    ApplicationManager manager;

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    public void AuthBtn() {
        driver.findElement(By.id("login_subm")).click();
    }

    public void PasswordField(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    public void PasswordFieldClick() {
        driver.findElement(By.id("Password")).click();
    }

    public void LoginField(String username) {
        driver.findElement(By.id("Nik")).sendKeys(username);
    }

    public void LoginFielsClick() {
        driver.findElement(By.id("Nik")).click();
    }
}
