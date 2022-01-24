package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
          public static WebDriver driver=null;
	
		  //browserLaunch
	      public static void browserLaunch(Object[]inputParameters)
	      {
	    	  
	    	         String strBrowserName=(String) inputParameters[0];
	    	         String webDriverExePath=(String) inputParameters[1];
	    	         
	    	         
	    	  if(strBrowserName.equalsIgnoreCase("Chrome"))
	    	  {    		  
	    		  System.setProperty("webdriver.chrome.driver", webDriverExePath);
	    		   driver=new ChromeDriver();	    		  
	    		  driver.manage().window().maximize();
	    	  }
	    	  else if(strBrowserName.equalsIgnoreCase("fireFox"))
	    	  {
	    		  System.setProperty("webdriver.gecko.driver", webDriverExePath);
	    		  driver=new FirefoxDriver();  
	    		  driver.manage().window().maximize();
	    	  }    	  
	      }
	
	      
	      //openApplication
	      public static void openApplication(Object[]inputParameters)
	      {
	    	  String strUrl=(String) inputParameters[0];
	    	  driver.get(strUrl);
	    	  
	      }
	      
	      //clickOnElement
	      public static void clickOnElement(Object[]inputParameters)
	      {
	    	  String xpath=(String) inputParameters[0];
	    	 
	    	  driver.findElement(By.xpath(xpath)).click();
	    	  
	      }
	      
	      //moveOnElement
	      public static void moveOnElement(Object[]inputParameters)
	      {
	    	  String xpath=(String) inputParameters[0];    	 
	        	  Actions act=new Actions(driver);
	    	  
	    	  WebElement element=driver.findElement(By.xpath(xpath));    	  
	    	     act.moveToElement(element).build().perform();    	  
	      }
	      
	      //enteringTextinTextField	      
	      public static void sendKeysInTextField(Object[]inputParameters)
	      {
	    	  
	    	         String xpath=(String) inputParameters[0];
	    	         String text=(String) inputParameters[1];
	    	         
	    	         WebElement element=driver.findElement(By.xpath(xpath));    	         
	    	                    element.clear();
	    	                    element.sendKeys(text);    	         
	      }
	
	         
	
	
	
	
	
}
