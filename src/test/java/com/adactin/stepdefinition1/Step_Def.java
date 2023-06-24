package com.adactin.stepdefinition1;

import org.openqa.selenium.WebDriver;
import com.adactin.runner1.Runner_Class;

import basecucumber.BaseClasson;
import basecucumber.pomnew;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends BaseClasson {
	public static WebDriver driver = Runner_Class.driver;
	public static pomnew l;	  

	@Given("user can able to launch the url")
	public void user_can_able_to_launch_the_url() {
		l=new pomnew(driver);
	   geturl("https://www.facebook.com/login/");
	}

	@When("user can enter the username")
	public void user_can_enter_the_username() {
	 Input(l.getUsername(), "123445");
	}

	@When("usr can enter the password")
	public void usr_can_enter_the_password() {
		Input(l.getPassword(), "prem123");
	}

	@Then("user can click the login button")
	public void user_can_click_the_login_button() {
	click(l.getSubmit());
	}

}
