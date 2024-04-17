import org.openqa.selenium.By;

public class LoginHelper extends HelperBase{
    ApplicationManager manager;

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    public void AuthBtn() {
        driver.findElement(By.id("login_subm")).click();
    }

    public void PasswordField() {
        driver.findElement(By.id("Password")).sendKeys(user.getPassword());
    }

    public void PasswordFieldClick() {
        driver.findElement(By.id("Password")).click();
    }

    public void LoginField() {
        driver.findElement(By.id("Nik")).sendKeys(user.getUsername());
    }

    public void LoginFielsClick() {
        driver.findElement(By.id("Nik")).click();
    }
}
