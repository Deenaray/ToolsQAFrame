package demoQAPackege;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverCode {
    static WebDriver driver;

    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEENARAY\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
//        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");
    }

    public void downloadandUpload() {
//        JavascriptExecutor javascriptExecutor=((JavascriptExecutor) driver);
//        javascriptExecutor.executeScript("window.scrollBy(500,0)", "");
        driver.findElement(By.id("downloadButton")).click();
    }

    public void upLoadFile() throws InterruptedException {
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\DEENARAY\\Documents\\Abstractnote.txt");
        // Thread.sleep(2000);
    }

    public void dynamicElement() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
        javascriptExecutor.executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("item-8")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,-300)", "");
        Thread.sleep(3000);
        driver.findElement(By.id("enableAfter")).click();
    }
   public void colorChange()
    {   JavascriptExecutor javascriptExecutor=((JavascriptExecutor) driver);
        javascriptExecutor.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.id("colorChange")).click();
    }
    public void visibleAfterButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("visibleAfter")).click();
        Thread.sleep(2000);
    }
    public void forms() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
        javascriptExecutor.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")).click();
        driver.findElement(By.id("firstName")).sendKeys("Deepika");
        driver.findElement(By.id("lastName")).sendKeys("N");
        driver.findElement(By.id("userEmail")).sendKeys("myname@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
        javascriptExecutor.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select select=new Select((driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))));
        select.selectByVisibleText("May");
        Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
        select1.selectByValue("1998");
        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]")).click();
       // driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("English");
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\DEENARAY\\Documents\\Abstractnote.txt");
        Thread.sleep(2000);
        //driver.findElement(By.id("//*[@id=\"currentAddress\"]")).sendKeys("DTP , Bangalore");
    }
    }



