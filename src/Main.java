import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://cpstest.org/");
        WebElement btn = driver.findElement(By.id("start"));
        for(int i = 1;i<500;i++){
            btn.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  WebElement spanElement = driver.findElement(By.cssSelector("span.highlight[wordnr='0']"));
      //  WebElement input = driver.findElement(By.id("inputfield"));
      //  WebElement divElement = driver.findElement(By.id("words"));
        //List<WebElement> spanElements = divElement.findElements(By.tagName("span"));
        //int iterations = spanElements.size();
        //for (WebElement spanElemen : spanElements) {
 //           input.sendKeys(spanElemen.getText() + " ");
//
        //};




        //WebElement NxtBtn = driver.findElement(By.id("identifierNext"));
        //mailInput.sendKeys("raufilyai2@gmail.com");
        //NxtBtn.click();

        //WebElement passinput = driver.findElement();
        //WebElement nextbtn2 = driver.findElement();
        //passinput.sendKeys();
        //nextbtn2.click();






        }
    }