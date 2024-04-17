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

    public void KeuWordEdit() {
        driver.findElement(By.name("Word[]")).sendKeys(groupData.getKeyWord());
    }

    public void KeuWordClick(){
        driver.findElement(By.name("Word[]")).click();
    }

    public void TextEdit() {
        driver.findElement(By.id("DiText")).sendKeys(groupData.getAddText());
    }

    public void TextEditCkick() {
        driver.findElement(By.id("DiText")).click();
    }

    public GroupData getCreatedGroupData(String addText) {
//        String groupName = driver.findElement(By.id("DiText")).getAttribute("value");
//        String textEdit = driver.findElement(By.id("DiText")).getText();
//        String keyWord = driver.findElement(By.name("Word[]")).getText();
//        return new GroupData(groupName).setAddText(textEdit);

            WebElement groupName = driver.findElement(By.id("DiText"));
            String groupNameText = groupName.getAttribute("value");

            WebElement keyWord = driver.findElement(By.name("Word[]"));
            String keyWordText = keyWord.getText();

            return new GroupData(groupNameText) {
                public String keyWord() {
                    return keyWordText;
                }
            };
    }

//    public void selectLastCreatedGroup() {
//        List<WebElement> groupElements = driver.findElements(By.xpath("//input[contains(@name,'selected[]')]"));
//        WebElement lastGroupElement = groupElements.get(groupElements.size() - 1);
//        lastGroupElement.click();
//    }

    public void openSelectedGroup() {
        driver.findElement(By.linkText("Править")).click();
    }

}
