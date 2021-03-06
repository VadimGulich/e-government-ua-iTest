package pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import appLogic.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPortalPage extends ApplicationManager {

    private WebDriver driver;


    public AboutPortalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //    ------------------- Элементы ID Bank------------------------------//

    @FindBy(xpath = "//div/div/div/p[1]")
    public WebElement infoBlockOne;          // блок инфо1

    @FindBy(xpath = "//div/div/div/p[2]")
    public WebElement infoBlockTwo;          // блок инфо2

    @FindBy(xpath = "//div/div/div/p[3]")
    public WebElement infoBlockThree;          // блок инфо3

    @FindBy(xpath = "//div/div/div/p[4]")
    public WebElement infoBlockFour;          // блок инфо4




    // =============================================== МЕТОДЫ  =================================================//

}
