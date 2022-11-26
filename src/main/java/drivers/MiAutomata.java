package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MiAutomata {

    public static WebDriver driver;

    public static MiAutomata iniciaConEstasOpciones() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--allow-running-insecure-content --disable-popup-blocking ");
        options.addArguments("--disable-infobars --test-type --disable-extensions --disable-translate");
        options.addArguments("--ignore-certificate-errors --incognito --disable-gpu --no-sandbox --disable-download-notification");

        driver = new ChromeDriver(options);
        return new MiAutomata();
    }


    public static MiAutomata firefox() {
        driver = new FirefoxDriver();
        return new MiAutomata();
    }

    public static MiAutomata internetExplorer() {
        driver = new InternetExplorerDriver();
        return new MiAutomata();
    }

    public static WebDriver en(String url) {
        driver.get(url);
        return driver;
    }
}
