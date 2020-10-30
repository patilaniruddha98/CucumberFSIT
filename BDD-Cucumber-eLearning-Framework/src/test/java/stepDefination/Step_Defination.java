package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defination {
		
	WebDriver driver;
	
		@Before
		public void before() {
			
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
	
	
	
		@Given("able to navigate on website")
		public void able_to_navigate_on_website() {
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		    
		}

		@When("click on sign in link")
		public void click_on_sign_in_link() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);  
		}
		@When("I  enter First Name as {string}")
		public void i_enter_first_name_as(String string) {
			driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys(string);
		}
		@When("I  enter Last Name as {string}")
		public void i_enter_last_name_as(String string) {
			driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys(string);
		}
		@When("I  enter email as {string}")
		public void i_enter_email_as(String string) {
			driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys(string);
		}
		@When("I enter username as {string}")
		public void i_enter_username_as(String string) {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
		}
		@When("I  enter password as {string}")
		public void i_enter_password_as(String string) {
			driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(string);
		}
		@When("I  enter confirm password as {string}")
		public void i_enter_confirm_password_as(String string) {
			driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(string);
		}
		@When("I  click on register button")
		public void i_click_on_register_button() throws InterruptedException {
			driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
			Thread.sleep(3000);
		}
		@When("I should see the the confirmation message")
		public void i_should_see_the_the_confirmation_message() {
		
	
			String actual=driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/p[1]")).getText();
			System.out.println(actual);
			
			
		    
		}
		@When("I click on the image on top right corner")
		public void i_click_on_the_image_on_top_right_corner() throws InterruptedException {
			driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/a[1]/img[1]")).click();
			Thread.sleep(4000);
		    
		}
		@When("I click on the homepage link")
		public void i_click_on_the_homepage_link() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Homepage')]")).click();
			Thread.sleep(2000);
		   
		}
		@When("I click on the Compose link")
		public void i_click_on_the_compose_link() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Compose')]")).click();
			Thread.sleep(4000);
		  
		}
		

			@When("I select naveen naveen \\(naveen) for send to")
			public void i_select_naveen_naveen_naveen_for_send_to() throws InterruptedException {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/"
	                    + "form[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")).sendKeys("naveen");

				Thread.sleep(8000);
				driver.findElement(By.xpath("//li[contains(text(),'naveen naveen (naveen)')]")).click();
				Thread.sleep(8000);
			}



			
		
		@When("I enter the subject as {string}")
		public void i_enter_the_subject_as(String string) {
			driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("Hi For Testing");
		}
		@When("I enter the message")
		public void i_enter_the_message() throws InterruptedException {
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body")).sendKeys("Hello Mr.Naveen,");
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.SPACE).build().perform();
			act.sendKeys(Keys.SPACE).build().perform();
			act.sendKeys(Keys.SPACE).build().perform();
			driver.findElement(By.xpath("/html/body")).sendKeys("This is for testing");
			act.sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("/html/body")).sendKeys("From");
			act.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("/html/body")).sendKeys("Naveen 1");
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			Thread.sleep(2000);
		}
		@When("I click on the send")
		public void i_click_on_the_send() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			
			driver.findElement(By.id("compose_message_compose")).click();
			
		}
		@Then("I should navigate to next page and able to see acknowledgement")
		public void i_should_navigate_to_next_page_and_able_to_see_acknowledgement() {
			String actual=driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]")).getText();
			
			System.out.println(actual);
			String expected="The message has been sent to naveen naveen (naveen)";
			Assert.assertEquals(expected,actual);
		   
		}




}
