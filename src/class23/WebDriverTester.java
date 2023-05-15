package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webdriver= new Safari(); // up casting
        // Safari safari=new WebDriver(); down casting
        webdriver.startBrowser();
        webdriver.openURL();
        webdriver.testLoginPage();
        webdriver.closeBrowser();


        // an Array of parent class can hold object of all the child classes
        WebDriver[] browsers={ new Chrome(), new Safari(), new FireFox()};
        for(WebDriver browser: browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }



    }
}
