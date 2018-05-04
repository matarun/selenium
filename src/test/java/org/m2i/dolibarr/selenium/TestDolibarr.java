package org.m2i.dolibarr.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDolibarr {
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setup() {
		   driver.get("http://demo.testlogiciel.pro/dolibarr");
		   driver.findElement(By.id("username")).sendKeys("jsmith");
		   driver.findElement(By.id("password")).sendKeys("hp");
		   driver.findElement(By.className("button")).click();
	}
	
	
	@After
	public void teardown() {
		   driver.findElement(By.cssSelector("img.login")).click();
		   driver.close();	
		
	}
	@Test
	
	public void testconnexion () {
		//On instancie le driver
	   Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
	
	   
	   
	   
	}


@Test
public void testconnexion2 () {
	
	//On instancie le driver
       driver.findElement(By.cssSelector ("div.mainmenu.companies")).click() ;
	   driver.findElement(By.linkText("Nouveau tiers")).click();
	   driver.findElement(By.name("nom")).sendKeys("benoit");
	   driver.findElement(By.name("firstname")).sendKeys("philippe");
	   new Select(driver.findElement(By.name("civilite_id"))).selectByVisibleText("Monsieur");
	   new Select(driver.findElement(By.name("client"))).selectByVisibleText("Prospect");
	   new Select(driver.findElement(By.name("fournisseur"))).selectByVisibleText("Non");
	   driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
	 
	   
	   
	   
	   
	   
	  
	   
	
}

}
