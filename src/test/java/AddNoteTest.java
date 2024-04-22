import org.junit.Test;



public class AddNoteTest extends TestBase{

  @Test
  public void secondTest() {
    manager.navigationHelper.OpenHomePage();
    manager.navigationHelper.SetWindowSize();

    AccountData user = new AccountData("mithedsa", "qw5172718");

    manager.loginHelper.LoginFielsClick();
    manager.loginHelper.LoginField(user.getUsername());
    manager.loginHelper.PasswordFieldClick();
    manager.loginHelper.PasswordField(user.getPassword());
    manager.loginHelper.AuthBtn();

    GroupData data = new GroupData("CАМАЯ Новая запись", "ключ записи");

    manager.noteHelper.KeuWordClick();
    manager.noteHelper.KeuWordEdit(data.getKeyWord());
    manager.noteHelper.TextEditCkick();
    manager.noteHelper.TextEdit(data.getAddText());
    manager.noteHelper.SaveBtn();

//    manager.getNote().selectLastCreatedGroup();
//    manager.getNote().openSelectedGroup();
//
//    GroupData newgroup = manager.getNote().getCreatedGroupData(groupData.getAddText());

//    Assert.assertArrayEquals(groupData.getAddText(), newgroup.getAddText());
//    Assert.assertArrayEquals(groupData.getKeyWord(), newgroup.getKeyWord());
  }
}
