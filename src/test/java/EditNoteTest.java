import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

public class EditNoteTest extends TestBase {

    @Test
    public void thirdTest() {
        manager.navigationHelper.OpenHomePage();
        manager.navigationHelper.SetWindowSize();

        AccountData user = new AccountData("mithedsa", "qw5172718");

        manager.loginHelper.LoginFielsClick();
        manager.loginHelper.LoginField(user.getUsername());
        manager.loginHelper.PasswordFieldClick();
        manager.loginHelper.PasswordField(user.getPassword());
        manager.loginHelper.AuthBtn();

        GroupData data = new GroupData("еще САМАЯ новая запись", "ключ записи");

        manager.noteHelper.selectLastCreatedGroup();
        manager.noteHelper.openSelectedGroup();

        manager.noteHelper.KeuWordClick();
        manager.noteHelper.KeuWordEdit(data.getKeyWord());
        manager.noteHelper.TextEditCkick();
        manager.noteHelper.TextEdit(data.getAddText());
        manager.noteHelper.SaveBtn();

        GroupData newGroup = manager.noteHelper.getCreatedGroupData();

        System.out.println(data.getAddText());
        System.out.println(data.getKeyWord());
        System.out.println(newGroup.getAddText());
        System.out.println(newGroup.getKeyWord());

        Assert.assertEquals(data.getAddText(),newGroup.getAddText());
        Assert.assertEquals(data.getKeyWord(),newGroup.getKeyWord());

    }
}
