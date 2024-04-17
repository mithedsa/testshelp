import org.junit.After;
import org.junit.Before;

public class TestBase {
    AccountData user = new AccountData("mithedsa", "qw5172718");

    GroupData groupData = new GroupData("Это текст для новой записи", "1111") ;

    ApplicationManager manager;

    @Before
    public void setUp() {
        manager = ApplicationManager.GetInstance();
    }

//    @After
//    public void tearDown() {
//        manager.Stop();
//    }
}
