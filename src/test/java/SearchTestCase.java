import org.junit.Test;

public class SearchTestCase extends TestCase{

    @Test
    public void SearchTest() throws InterruptedException{
        homePage();
        log.info("Anasayfa açıldı.");
        goToLogin();
        log.info("Üye giriş sayfası açıldı.");
        login();
        log.info("Üye Girişi yapıldı.");
        homePage2();
        search();
        log.info("Bilgisayar kelimesi aratıldı.");
        secondPage();
        log.info("2.sayfa açıldı.");
        selectRandomProduct();
        addToProduct();
        deleteBasketProduct();
        exit();
    }


}
