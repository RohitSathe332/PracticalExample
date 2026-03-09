package AllMainClasses;

import java.time.Duration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametrizationWithParallelTesting {

	    @Parameters({"browser"})
	    @Test
	    public void launchBrowser(String browser) {

	        System.out.println("Browser: " + browser +
	                " | Thread ID: " + Thread.currentThread().getId());

	        if (browser.equalsIgnoreCase("chrome")) {
	            System.out.println("Launching Chrome");
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            System.out.println("Launching Firefox");
	        } else if (browser.equalsIgnoreCase("edge")) {
	            System.out.println("Launching Edge");
	        }
	    }
	}



