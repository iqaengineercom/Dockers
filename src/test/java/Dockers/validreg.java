package Dockers;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class validreg {



    @Test
    public void auth() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //Проверка наличия драйвера
        WebDriver driver = new ChromeDriver();//Инициализация драйвер
        driver.manage().window().maximize();
        driver.get("https://www.dockers.com/US/en_US/login");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"emailModal\"]/div/div")));
        WebElement close = driver.findElement(By.xpath("//*[@id=\"emailModal\"]/div/div/div[1]/button"));
        close.click();

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pwd"));
        WebElement buttonreq = driver.findElement(By.xpath("//button[@class='btn btn-block btn-tertiary btn-join']"));

        email.sendKeys("tester8@tester.com");
        password.sendKeys("adminMm1");
        buttonreq.click();
        WebElement alertsucc = driver.findElement(By.xpath("//div[@class='alert alert-info']"));
        if (alertsucc.isDisplayed()) {
            System.out.println("Test" + " " + alertsucc.getText());
            driver.quit();
        } else {
            System.out.println("Нет сообщения" + " " + driver.getTitle());
            driver.quit();
        }
    }
}





