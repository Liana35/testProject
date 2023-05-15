package class23;

public class WebDriver {
    public void startBrowser() {
        System.out.println("starting the browser");
    }

    public void openURL() {
        System.out.println("opening URL");
    }

    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}
  class Chrome extends WebDriver{

        @Override
        public void startBrowser() {
            System.out.println("Starting Google Chrome");
        }

        @Override
        public void openURL() {
            System.out.println("Opening URL in Google Chrome");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing login in Google Chrome");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing browser in Google Chrome");
        }
    }

    class Safari extends WebDriver {
        @Override
        public void startBrowser() {
            System.out.println("Opening the Safari Browser");
        }

        @Override
        public void openURL() {
            System.out.println("Opening URL in Safari");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing login in Safari");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing browser in Safari");
        }
    }

        class FireFox extends WebDriver{
            @Override
            public void startBrowser() {
                System.out.println("Starting FireFox");
            }

            @Override
            public void openURL() {
                System.out.println("Opening URL in  FireFox");
            }

            @Override
            public void testLoginPage() {
                System.out.println("Testing login in Firefox");
            }

            @Override
            public void closeBrowser() {
                System.out.println("closing browser in Firefox");
            }
        }

