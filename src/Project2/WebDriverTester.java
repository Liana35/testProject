package Project2;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver []webdrivers= {new ChromeDriver(), new SafariDriver(), new Firefox()};
        for(RemoteWebDriver w:webdrivers ) {
            w.open();
            w.close();
            w.getTitle("M");
            w.getScreenshot();
            w.navigate();


        }
    }
}
