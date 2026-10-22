package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SelectProduct { 
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div[4]/main/div/div[4]/div/ul/li[2]/div/div[2]/div[4]/div[1]/h6/a")
	WebElement pdt ; 
	@FindBy(xpath="/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/h1")
	WebElement pdttext ; 
	
	
	
public SelectProduct() {
	PageFactory.initElements(Config.driver, this);
	
}
 public void ClickOnProduct(String produit) {
	 Actions action = new Actions (Config.driver) ; 
	 action.moveToElement(pdt).perform(); 
	 pdt.click();
	 
	 
	
	 
	 
	 }
 
 
 public void veriftext (String verif) {
	 Assert.assertEquals(pdttext.getText(), verif);
	 
 }
 
}
