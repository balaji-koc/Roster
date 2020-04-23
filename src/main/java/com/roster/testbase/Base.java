package com.roster.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//import com.roster.utilities.EventListeners;
import com.roster.utilities.WebEventListener;

public class Base {

    public static WebDriver driver; 
    public static Properties prop;
    public static EventFiringWebDriver event_driver;
    public static Logger logger = LogManager.getLogger();

    public Base()
    {
    	prop = new Properties();
    	try {
			// InputStream fr=new FileReader("/Roster/src/main/java/com/roster/config/config.properties");
    		InputStream fr = Base.class.getClassLoader().getResourceAsStream("com/roster/config/config.properties");
    		if (fr == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
			 prop.load(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e)
         {
			e.printStackTrace();
         }
    	logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

    	
    }//end of constructor
    
    public static void intalize() throws InterruptedException
    {
    	 String brow = prop.getProperty("browser");
    	 System.out.println("Browser is: "+brow);
    	 
    	
    	 System.setProperty("webdriver.chrome.driver", "F:\\Roster\\Roster\\Chromedriver.exe");
    	
    	 driver = new ChromeDriver();
    	 //break;
    	 //}// end of switch
    	 
    	 event_driver= new EventFiringWebDriver(driver);
    	 WebEventListener handler = new WebEventListener();
    	 event_driver.register(handler);
    	 driver=event_driver; 
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.SECONDS);
    	 driver.get(prop.getProperty("url"));
    	 Thread.sleep(6000);
    	   	    	 
    }// end of inatilize method
}
