package basecucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomnew {
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	public WebElement getUsername() {
		
		return username;
	}
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="loginsubmit")
	private WebElement Submit;
	

	public WebElement getSubmit() {
		return Submit;
	}


	public pomnew(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
