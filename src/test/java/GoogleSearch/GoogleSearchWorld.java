package GoogleSearch;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearchWorld {

@Test
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe"); //Проверка наличия драйвера
        WebDriver driver = new FirefoxDriver();

    //WebDriver driver = new ChromeDriver();//Инициализация драйвера
        driver.manage().window().maximize();

        driver.get("https://google.com");// Открытие сайта
        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys("");
        search.click();


        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("rei.com");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href='https://www.rei.com/']")).click();
        Thread.sleep(1000);
        if (driver.getTitle().contains("REI")) {
            System.out.println("Сайт отrрывается");
        } else {
            System.out.println("Ошибка-сайт не отрылся" + driver.getTitle());
        }

        //System.out.println("Title:" + driver.getTitle());
        driver.quit();

    }
}

