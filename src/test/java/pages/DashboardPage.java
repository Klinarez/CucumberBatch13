package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.driver;

public class DashboardPage {

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    public DashboardPage() {
        PageFactory.initElements(driver, this);


    }
}