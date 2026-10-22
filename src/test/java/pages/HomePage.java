package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[5]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li/a/span")
	List<WebElement> menus ; 
	@FindBy(xpath="/html/body/div[5]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li[2]/div/ul/li/a/span")
	List<WebElement> submenus; 
	@FindBy(xpath="/html/body/div[5]/div[3]/div[2]/div[2]/div/h1")
	WebElement Verif ; 
	

	 public HomePage () {
		 PageFactory.initElements(Config.driver, this);

}
	 public void mousehoverandclick (String menutitle, String submenutitle) {
		 Actions action = new Actions (Config.driver) ; 
		 Config.wait(5);
		
	
		 try {
			 for(WebElement menu:menus) {
				 if(menu.getText().contains(menutitle)) {
					 action.moveToElement(menu).perform();
					 for(WebElement submenu:submenus) {
						 if(submenu.getText().contains(submenutitle)) {
							
						   submenu.click();
						 }
					 }
				 } 
			 }
}catch (Exception e) {
	
}
		// TODO: handle exception
	

}
	 public void vérification (String text) {
		 Assert.assertEquals(Verif.getText(), text);
		 
		 
	 }
		 
}