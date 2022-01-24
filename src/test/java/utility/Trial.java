package utility;



public class Trial
{
	public static void main(String[] args)
	{		  
		//BrowserLaunch
		 
		     Object [] input=new Object[2];
		              input[0]="Chrome";
		              input[1]= "G:\\Automation Support\\chromedriver.exe";		
		           SeleniumOperations.browserLaunch(input);
		
		  //openApplication
		           Object [] input1=new Object[1];
		              input1[0]="https://www.flipkart.com/";
		              SeleniumOperations.openApplication(input1);
		  
		  
		  		         //clickOnCancle
				           Object [] input2=new Object[1];
				           input2[0]="//*[@class='_2KpZ6l _2doB4z']";
				           SeleniumOperations.clickOnElement(input2);
				  		           
				  		       //moveToElement
						           Object [] input3=new Object[1];
						           input3[0]="//*[@class='_28p97w']";
						           SeleniumOperations.moveOnElement(input3);
						  		           
						  		       //clickOn My profile
								           Object [] input4=new Object[1];
								         input4[0]="//*[text()='My Profile']";
								         SeleniumOperations.clickOnElement(input4);      
						  		           
						  		           
	}

}
