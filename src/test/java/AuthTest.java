import org.junit.Test;

public class AuthTest extends TestBase{
    @Test
    public void firstTest() {
        manager.navigationHelper.OpenHomePage();
        manager.navigationHelper.SetWindowSize();

        AccountData user = new AccountData("mithedsa", "qw5172718");

        manager.loginHelper.LoginFielsClick();
        manager.loginHelper.LoginField(user.getUsername());
        manager.loginHelper.PasswordFieldClick();
        manager.loginHelper.PasswordField(user.getPassword());
        manager.loginHelper.AuthBtn();
    }
}
