import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NoteHelper extends HelperBase {
    ApplicationManager manager;

    public NoteHelper(ApplicationManager manager) {
        super(manager);
    }

    public void SaveBtn() {
        driver.findElement(By.id("btn_save")).click();
    }

    public void KeuWordEdit(String keyWord) {
        driver.findElement(By.name("Word[]")).sendKeys(keyWord);
    }

    public void KeuWordClick(){
        driver.findElement(By.name("Word[]")).click();
    }

    public void TextEdit(String addText) {
        driver.findElement(By.id("DiText")).sendKeys(addText);
    }

    public void TextEditCkick() {
        driver.findElement(By.id("DiText")).click();
    }

    public void selectLastCreatedGroup() {
        driver.findElement(By.linkText("Все записи")).click();
    }

    public void openSelectedGroup() {
        driver.findElement(By.linkText("Править")).click();
    }

    public GroupData getCreatedGroupData() {
        String textEdit = driver.findElement(By.id("DiText")).getText();
        String keyWord = driver.findElement(By.name("Word[]")).getText();
        return new GroupData(textEdit, keyWord);

//            WebElement groupNameelem = driver.findElement(By.id("DiText"));
//            addText = groupNameelem.getText();
//
//            WebElement keyWordelem = driver.findElement(By.name("Word[]"));
//            keyWord = keyWordelem.getText();

//            return new GroupData() {
//                public String keyWord() {
//                    return keyWord();
//                }
//                public String addText() {return addText();}
//            };
    }



}
