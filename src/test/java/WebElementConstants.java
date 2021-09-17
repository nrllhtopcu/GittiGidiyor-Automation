import org.openqa.selenium.By;

public class WebElementConstants {

    public static By loginButton = By.xpath("//div[@class='gekhq4-6 hnYHyk']");
    public static By login1 = By.cssSelector("[data-cy='header-login-button']");
    public static By userName = By.id("L-UserNameField");
    public static By password = By.id("L-PasswordField");
    public static By login2 = By.id("gg-login-enter");
    public static By homePage = By.xpath("//div[@class='left']//a[@class='logo_gg imglink logo-small']");
    //public static By accountName = By.cssSelector("div[class='gekhq4-4 hwMdSM']>:nth-child(2)");
    public static By searchWord = By.xpath("//input[@type='text']");
    public static By searchButton = By.cssSelector("[data-cy='search-find-button']");
    public static By secondPageButton = By.cssSelector("ul[class='sc-12aj18f-3 kLmKCh']>:nth-child(3)>a");
    public static By productPriceB = By.cssSelector("div[id='sp-price-container']>:nth-child(2)");
    public static By productDetailButton = By.cssSelector("img[src='https://mcdn01.gittigidiyor.net/55671/tn30/556712808_tn30_0.jpg']");
    public static By addToBasket = By.cssSelector("button[id='add-to-basket']");
    public static By basket = By.cssSelector("div[class='basket-container robot-header-iconContainer-cart']>a[href='https://www.gittigidiyor.com/sepetim']");
    public static By productPriceA = By.cssSelector("p[class='new-price']");
    public static By addProductButton = By.cssSelector("select[class='amount']");
    public static By addProductButton2 = By.cssSelector("select[class='amount']>:nth-child(2)");
    public static By amountProduct = By.cssSelector("div[class='gg-d-16 gg-m-14 detail-text']");
    public static By delete = By.cssSelector("a[title='Sil']>i[class='gg-icon gg-icon-bin-medium']");
    public static By basketControl = By.cssSelector("span[class='gg-m-24 gg-t-9 gg-d-9 gg-w-9 toaster-msg']");

}
