package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	
	@Given("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String bname, String exe) throws Throwable 
	{
		Object [] input=new Object[2];
        input[0]=bname;
        input[1]=exe;		
        SeleniumOperations.browserLaunch(input);

	}

	@Given("^user open url as \"([^\"]*)\"$")
	public void user_open_url_as(String url) throws Throwable
	{
		 Object [] input1=new Object[1];
         input1[0]=url;
         SeleniumOperations.openApplication(input1);


	}

	@When("^user click on Cancle button$")
	public void user_click_on_Cancle_button() throws Throwable 
	{
		 Object [] input2=new Object[1];
         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
         SeleniumOperations.clickOnElement(input2);

	}

	@When("^user move on Login DropDown$")
	public void user_move_on_Login_DropDown() throws Throwable 
	{
		 Object [] input3=new Object[1];
         input3[0]="//*[@class='_28p97w']";
         SeleniumOperations.moveOnElement(input3);

	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable 
	{
		Object [] input4=new Object[1];
        input4[0]="//*[text()='My Profile']";
        SeleniumOperations.clickOnElement(input4);   

	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable 
	{
		Thread.sleep(5000);
		Object [] input5=new Object[2];
        input5[0]="(//*[@autocomplete='off'])[2]";
        input5[1]=uname;	
        SeleniumOperations.sendKeysInTextField(input5);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pass) throws Throwable
	{
		Object [] input6=new Object[2];
        input6[0]="//*[@type='password']";
        input6[1]=pass;
        SeleniumOperations.sendKeysInTextField(input6);

	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
	{
		Object [] input7=new Object[1];
        input7[0]="(//*[@type='submit'])[2]";
        SeleniumOperations.clickOnElement(input7);  

	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
	{


	}



}
