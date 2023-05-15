package class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] wedD={ new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver web:wedD ){
            web.openBrowser();;
            web.closeBrowser();
            web.maximizeWindow();
            web.findElement();
        }
    }
}
