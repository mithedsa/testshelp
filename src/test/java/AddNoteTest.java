import org.junit.Assert;
import org.junit.Test;

public class AddNoteTest extends TestBase{

  @Test
  public void secondTest() {
    manager.getNavigation();
    manager.getLogin();
    manager.getNote();

    manager.noteHelper.openSelectedGroup();

    GroupData newgroup = manager.noteHelper.getCreatedGroupData(groupData.getAddText());

//    Assert.assertArrayEquals(groupData.getAddText(), newgroup.getAddText());
//    Assert.assertArrayEquals(groupData.getKeyWord(), newgroup.getKeyWord());
  }
}
