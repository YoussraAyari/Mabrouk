package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectProduct;

public class SelectProductStepDef {
	@Given("utilisateur est accéder a la page Chemises & Blouses")
	public void utilisateur_est_accéder_a_la_page_chemises_blouses() throws Exception {
		Config.driver = new ChromeDriver () ;  
		Config.maximizeWindow();
		Config.driver.get(Utile.getProperty("ProductHome"));
		
	    
	}
	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String string) {
		SelectProduct produit = new SelectProduct ();
		produit.ClickOnProduct(string);
	
	   
	}
	@Then("utilisateur est dans la page produit {string}")
	public void utilisateur_est_dans_la_page_produit(String string) {
		SelectProduct produit = new SelectProduct ();
		produit.veriftext(string);
		Config.driver.quit();
	}
}
