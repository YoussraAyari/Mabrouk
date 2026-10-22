package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDef {
	@Given("utilisateur est dans la page dacceuil")
	public void utilisateur_est_dans_la_page_dacceuil() throws Exception {
		Config.driver = new ChromeDriver () ;  
		Config.maximizeWindow();
		Config.driver.get(Utile.getProperty("HomeMabrouk"));
		
		
		
	  
	}
	@When("utilisateur survole sur le menu  {string} et cliquer sue le sous menu {string}")
	public void utilisateur_survole_sur_le_menu_et_cliquer_sue_le_sous_menu(String menutitle, String submenutitle) {
		HomePage page = new HomePage (); 
		page.mousehoverandclick(menutitle, submenutitle);
			   
	}
	@Then("utilisateuteur est dirigé vers la page {string}")
	public void utilisateuteur_est_dirigé_vers_la_page(String Verif) {
		HomePage page = new HomePage (); 
		page.vérification(Verif);
		Config.driver.quit();
	   
	}

}
