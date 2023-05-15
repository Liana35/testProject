package Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String m);
}
interface TakesScreenshot{
void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements  RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open webdriver in Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close webdriver in Chrome");
    }

    @Override
    public String getTitle(String m) {

        return ("Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot in Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
}
class Firefox implements  RemoteWebDriver{



    @Override
    public void open() {
        System.out.println("Open webdriver in Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close webdriver in Firefox");
    }

    @Override
    public String getTitle(String m) {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot in Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open webdriver in SafariDriver");
    }

    @Override
    public void close() {
        System.out.println("Close webdriver in SafariDriver");
    }

    @Override
    public String getTitle(String m) {

        return "SafariDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot in SafariDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to SafariDriver");
    }
}

