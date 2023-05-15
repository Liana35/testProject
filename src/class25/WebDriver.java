package class25;

public interface WebDriver {
   /* Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class  ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open browser in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Chrome");
    }

    @Override
    public void findElement() {
        System.out.println(" Finding elements in Chrome");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open browser in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Firefox");
    }

    @Override
    public void findElement() {
        System.out.println(" Finding elements in Firefox");
    }
}
