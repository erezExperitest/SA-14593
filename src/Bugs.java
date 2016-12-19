import com.experitest.client.Client;
import com.google.code.tempusfugit.concurrency.ConcurrentTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 */
@RunWith(ConcurrentTestRunner.class)

public class Bugs {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\erez.akri.experitest\\workspace\\project31";
    Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        //client.setClientDebugStatus(true);
        client.setProjectBaseDirectory(projectBaseDirectory);
//        client.setReporter("xml", "reports", "test" + Thread.currentThread().getId());

    }

    @Test
    public void iOSTest1(){
        long iteration=0;
//        client.waitForDevice("@os='ios'", 30000);
        client.setDevice("ios_app:iPhone");
        long startTimeMs = System.currentTimeMillis();

        while (calcElapsedTimeInHours(System.currentTimeMillis(),startTimeMs)<4) {

            if (client.install("com.experitest.ExperiBank", true, false)) {
                // If statement
            }
            client.launch("com.experitest.ExperiBank", true, true);
            if (client.waitForElement("NATIVE", "placeholder=Username", 0, 120000)) {
                // If statement
            }
            client.elementSendText("NATIVE", "placeholder=Username", 0, "company");
            if (client.waitForElement("NATIVE", "placeholder=Password", 0, 10000)) {
                // If statement
            }
            client.elementSendText("NATIVE", "placeholder=Password", 0, "company");
            client.sendText("{ENTER}");
            client.click("NATIVE", "accessibilityLabel=makePaymentButton", 0, 1);
            if (client.waitForElement("NATIVE", "accessibilityLabel=countryButton", 0, 10000)) {
                // If statement
            }
            client.click("TEXT", "Select", 0, 1);
            client.elementListSelect("", "text=Tanzania", 0, false);
            client.click("NATIVE", "xpath=//*[@accessibilityLabel='Tanzania']", 0, 1);
            if (client.waitForElement("NATIVE", "accessibilityLabel=cancelButton", 0, 120000)) {
                // If statement
            }
            client.click("TEXT", "Cancel", 0, 1);
            if (client.waitForElement("TEXT", "Logout", 0, 10000)) {
                // If statement
            }
            client.click("NATIVE", "accessibilityLabel=logoutButton", 0, 1);
            client.launch("safari:http://www.wikipedia.org", true, false);
            if (client.waitForElement("WEB", "id=searchInput", 0, 120000)) {
                // If statement
            }
            client.elementSendText("WEB", "id=searchInput", 0, "expert");
            //client.click("WEB", "name=go", 0, 1);
            client.click("WEB", "xpath=//*[@nodeName='I' and ./parent::*[@nodeName='BUTTON']]", 0, 1);

            iteration++;
            System.out.println(Thread.currentThread().getName() +" "+ client.getDeviceProperty("device.name") + " Iteration No. " + iteration + " ; Elapsed time is: " + calcElapsedTimeInHours(System.currentTimeMillis(),startTimeMs) );
            System.out.println(Thread.currentThread().getName() + "used memory" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

        }
    }

    @Test
    public void iOSTest2(){
        long iteration=0;
//        client.waitForDevice("@os='ios'", 30000);
        client.setDevice("ios_app:Ipad 10_2");
        long startTimeMs = System.currentTimeMillis();

        while (calcElapsedTimeInHours(System.currentTimeMillis(),startTimeMs)<4) {

            if (client.install("com.experitest.ExperiBank", true, false)) {
                // If statement
            }
            client.launch("com.experitest.ExperiBank", true, true);
            if (client.waitForElement("NATIVE", "placeholder=Username", 0, 120000)) {
                // If statement
            }
            client.elementSendText("NATIVE", "placeholder=Username", 0, "company");
            if (client.waitForElement("NATIVE", "placeholder=Password", 0, 10000)) {
                // If statement
            }
            client.elementSendText("NATIVE", "placeholder=Password", 0, "company");
            client.sendText("{ENTER}");
            client.click("NATIVE", "accessibilityLabel=makePaymentButton", 0, 1);
            if (client.waitForElement("NATIVE", "accessibilityLabel=countryButton", 0, 10000)) {
                // If statement
            }
            client.click("TEXT", "Select", 0, 1);
            client.elementListSelect("", "text=Tanzania", 0, false);
            client.click("NATIVE", "xpath=//*[@accessibilityLabel='Tanzania']", 0, 1);
            if (client.waitForElement("NATIVE", "accessibilityLabel=cancelButton", 0, 120000)) {
                // If statement
            }
            client.click("TEXT", "Cancel", 0, 1);
            if (client.waitForElement("TEXT", "Logout", 0, 10000)) {
                // If statement
            }
            client.click("NATIVE", "accessibilityLabel=logoutButton", 0, 1);
            client.launch("safari:http://www.wikipedia.org", true, false);
            if (client.waitForElement("WEB", "id=searchInput", 0, 120000)) {
                // If statement
            }
            client.elementSendText("WEB", "id=searchInput", 0, "expert");
            //client.click("WEB", "name=go", 0, 1);
            client.click("WEB", "xpath=//*[@nodeName='I' and ./parent::*[@nodeName='BUTTON']]", 0, 1);

            iteration++;
            System.out.println(Thread.currentThread().getName() +" "+ client.getDeviceProperty("device.name") + " Iteration No. " + iteration + " ; Elapsed time is: " + calcElapsedTimeInHours(System.currentTimeMillis(),startTimeMs) );
            System.out.println(Thread.currentThread().getName() + "used memory" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

        }
    }

    @Ignore
    public void androidTest1() {

        long iteration = 0;
//        client.waitForDevice("@os='android'", 30000);
        client.setDevice("adb:SM-T813");
        long startTimeMs = System.currentTimeMillis();

        while (calcElapsedTimeInHours(System.currentTimeMillis(), startTimeMs) < 4) {
            if (client.install("com.experitest.ExperiBank/.LoginActivity", true, false)) {
                // If statement
            }
            client.launch("com.experitest.ExperiBank/.LoginActivity", true, false);
            client.sendText("company");
            client.elementSendText("NATIVE", "hint=Password", 0, "company");
            client.click("NATIVE", "text=Login", 0, 1);
            if (client.waitForElement("NATIVE", "partial_text=Make Payment", 0, 30000)) {
                // If statement
            }
            client.click("NATIVE", "text=Make Payment", 0, 1);
            client.click("NATIVE", "text=Select", 0, 1);
            client.elementListSelect("", "text=Mexico", 0, false);
            client.click("NATIVE", "text=Mexico", 0, 1);
            if (client.waitForElement("NATIVE", "partial_text=Cancel", 0, 60000)) {
                // If statement
            }
            client.click("TEXT", "Cancel", 0, 1);
            client.click("TEXT", "Logout", 0, 1);
            client.launch("chrome:http://www.wikipedia.org", true, false);
            if (client.waitForElement("WEB", "id=searchInput", 0, 120000)) {
                // If statement
            }
            client.click("WEB", "id=searchInput", 0, 1);
            client.elementSendText("WEB", "id=searchInput", 0, "expert");
            client.sendText("{ENTER}");
            client.swipe("Down", 206, 1225);

            iteration++;
            System.out.println(Thread.currentThread().getName() +" "+ client.getDeviceProperty("device.name") + " Iteration No. " + iteration + " ; Elapsed time is: " + calcElapsedTimeInHours(System.currentTimeMillis(), startTimeMs));
            System.out.println(Thread.currentThread().getName() + "used memory" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        }
    }



    @Test
    public void androidTest2() {

//        client.waitForDevice("@os='android'", 30000);
        client.setDevice("adb:SM-G920F");
        long startTimeMs = System.currentTimeMillis();
        long iteration=0;

        while (calcElapsedTimeInHours(System.currentTimeMillis(), startTimeMs) < 4) {
            if (client.install("com.experitest.ExperiBank/.LoginActivity", true, false)) {
                // If statement
            }
            client.launch("com.experitest.ExperiBank/.LoginActivity", true, false);
            client.sendText("company");
            client.elementSendText("NATIVE", "hint=Password", 0, "company");
            client.click("NATIVE", "text=Login", 0, 1);
            if (client.waitForElement("NATIVE", "partial_text=Make Payment", 0, 30000)) {
                // If statement
            }
            client.click("NATIVE", "text=Make Payment", 0, 1);
            client.click("NATIVE", "text=Select", 0, 1);
            client.elementListSelect("", "text=Mexico", 0, false);
            client.click("NATIVE", "text=Mexico", 0, 1);
            if (client.waitForElement("NATIVE", "partial_text=Cancel", 0, 60000)) {
                // If statement
            }
            client.click("TEXT", "Cancel", 0, 1);
            client.click("TEXT", "Logout", 0, 1);
            client.launch("chrome:http://www.wikipedia.org", true, false);
            if (client.waitForElement("WEB", "id=searchInput", 0, 120000)) {
                // If statement
            }
            client.click("WEB", "id=searchInput", 0, 1);
            client.elementSendText("WEB", "id=searchInput", 0, "expert");
            client.sendText("{ENTER}");
            client.swipe("Down", 206, 1225);

            iteration++;
            System.out.println(Thread.currentThread().getName() +" "+ client.getDeviceProperty("device.name") + " Iteration No. " + iteration + " ; Elapsed time is: " + calcElapsedTimeInHours(System.currentTimeMillis(), startTimeMs));
            System.out.println(Thread.currentThread().getName() + "used memory" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        }
    }



    float calcElapsedTimeInHours(long currentTime, long startTime){
//        return (currentTime-startTime)/1000/60/60;
        long timeMs = currentTime-startTime;
        float timeSec = timeMs/1000;
        float timeMin = timeSec/60;
        float timeHr = timeMin/60;
        return timeHr;
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
//        client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
