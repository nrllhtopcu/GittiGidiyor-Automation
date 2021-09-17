import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class TestCase extends BasePage {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void homePage(){

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";

        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }

    public void goToLogin() throws InterruptedException {

        clickToElement(WebElementConstants.loginButton);
        Thread.sleep(2000);
        clickToElement(WebElementConstants.login1);

    }

    public void login() throws InterruptedException {

        Thread.sleep(2000);
        findElement(WebElementConstants.userName).sendKeys("nrllh67@outlook.com");
        Thread.sleep(2000);
        findElement(WebElementConstants.password).sendKeys("Nt5995094");
        clickToElement(WebElementConstants.login2);


        /*Login sayfasında kullanıcı adı ve parola alanlarına doğru inputlar girilip, giriş yap butonuna
        tıklanmasıyla sayfada yenileme gerçekleşiyor,anasayfaya geçiş yapılamıyor. Test otomasyon
        yazılımının site tarafından engellendiğini tahmin edip, çözümler aradım ancak problemi çözemedim.
        Süreci manuel test ettiğimde sayfaya yönlendirme olmaktadır. Bu yüzden hesaba giriş kontrolü yapamadım.
        Aşağıda yorum satırına aldığım kod hesap kontrol işlemi yapmaktadır.*/

        /* String loginControl = findElement(WebElementConstants.accountName).getText();
        String loginControl2 = "nurullahtopcu428119";

        Assert.assertEquals(loginControl, loginControl2); */



    }

    public void homePage2() throws InterruptedException{

        Thread.sleep(2000);
        clickToElement(WebElementConstants.homePage);

    }


    public void search(){

            findElement(WebElementConstants.searchWord).sendKeys("Bilgisayar");
            clickToElement(WebElementConstants.searchButton);

    }

    public void secondPage() throws InterruptedException {

        jse.executeScript("window.scrollBy(0,9000)");
        clickToElement(WebElementConstants.secondPageButton);
        Thread.sleep(2000);


        String URL = driver.getCurrentUrl();

        Assert.assertEquals(URL, "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2" );

    }

    public void selectRandomProduct() throws InterruptedException{

        jse.executeScript("window.scrollBy(0,800)");
        clickToElement(WebElementConstants.productDetailButton);
        Thread.sleep(2000);
        log.info("Ürün detay sayfası açıldı.");
        String price = findElement(WebElementConstants.productPriceB).getText();
        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        clickToElement(WebElementConstants.addToBasket);
        log.info("Ürün sepete eklendi.");
        Thread.sleep(2000);
        clickToElement(WebElementConstants.basket);
        log.info("Sepetim sayfası açıldı.");

        String price2 = findElement(WebElementConstants.productPriceA).getText();

        Assert.assertEquals(price,price2);

        log.info("Ürün fiyatları eşit.");

        /*List<WebElement> allProducts = driver.findElements(WebElementConstants.srandomProduct);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();*/
    }

    public void addToProduct() throws InterruptedException {

        clickToElement(WebElementConstants.addProductButton);
        Thread.sleep(2000);
        clickToElement(WebElementConstants.addProductButton2);
        Thread.sleep(2000);
        String amount = findElement(WebElementConstants.amountProduct).getText();
        String amount2 = "Ürün Toplamı (2 Adet)";
        Thread.sleep(2000);

        Assert.assertEquals(amount, amount2);
        log.info("Sepetinizde 2 adet ürün vardır.");

    }

    public void deleteBasketProduct() throws InterruptedException {

        Thread.sleep(2000);
        clickToElement(WebElementConstants.delete);
        Thread.sleep(5000);

        String basket = findElement(WebElementConstants.basketControl).getText();
        String basket2 = "Ürün Sepetten Silindi";
        Thread.sleep(2000);

        Assert.assertEquals(basket, basket2);
        log.info("Sepetinizde ürün bulunmamaktadır.");

    }

    public void exit()
    {
        driver.quit();
    }

}


