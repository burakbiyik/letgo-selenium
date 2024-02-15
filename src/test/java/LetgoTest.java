import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetgoTest {

    @Test
    public void TestCase1VerileriBirlesikGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("samsunggalaxys6");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase2VeriBoslukGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys(" ");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase4TurkceVeriGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("Televizyon");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase5OzelKarakterGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("*");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase7VeriLinkGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("https://github.com/");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase9BoslukluVeriGirme(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("samsung galaxy s6");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
    @Test
    public void TestCase10SecilenKategorideOlmayanVeriyiArama(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver tarayici = new ChromeDriver();
        String testUrl = "https://www.letgo.com/es-us/c/cars";
        tarayici.get(testUrl);
        WebDriverWait tarayiciBeklemeSuresi = new WebDriverWait(tarayici,9);
        tarayici.manage().window().maximize();
        WebElement element = tarayiciBeklemeSuresi.until(ExpectedConditions.elementToBeClickable(tarayici.findElement(By.name("search"))));
        element.click();
        WebElement aramaCubugu = tarayici.findElement(By.name("search"));
        aramaCubugu.sendKeys("samsung");
        tarayici.findElement(By.name("search")).sendKeys(Keys.ENTER);
        System.out.println("Test başarılı.");
    }
}

