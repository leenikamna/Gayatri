package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.test_runner.Excelsheet;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_step {
	WebDriver driver;
	Shop_pagefactory shop;
	Excelsheet file;

	@Before
	public void launch_browser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		file= new Excelsheet();
		
		 
	}


	/////01
	@Given("user is on asianpaints homepage")
	public void user_is_on_asianpaints_homepage() throws InterruptedException {
		System.out.println("User is on Home Page");
		//driver.get("https://www.asianpaints.com/");
	}
	
	@When("user click on shop button")
	public void user_click_on_shop_button() throws InterruptedException {
		System.out.println("User click on shop");
		driver.findElement(By.xpath("//*[@data-target='#SHOP']")).click();
	}
	@When("click on wallStickers button")
	public void click_on_wallStickers_button() throws InterruptedException {
		System.out.println("User click on wallStickers button");
		driver.findElement(By.xpath("//*[@title='ap-shop-wall-stickers-thumbnail-asian-paints']")).click();
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,1000);");
		Thread.sleep(5000);
	}

	@Then("user navigate to wallStickers page")
	public void user_navigate_to_wallStickers_page() {
		System.out.println("user navigate to wallStickers page");
	}

	@Then("Display all wallStickers")
	public void display_all_wallStickers() {
		System.out.println("Display all wallStickers");
	}

	/////02
	@When("user click on size filter")
	public void user_click_on_size_filter() throws InterruptedException {
		System.out.println("user click on size filter");
		driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[1]/h4")).click();
		Thread.sleep(5000);    
	}

	@When("select required size option")
	public void select_required_size_option() throws InterruptedException {
		WebElement size = driver.findElement(By.xpath("//*[contains(@value, 'size/medium')]"));
		System.out.println("size");
		
		
		if (shop.getMedium().getText().equalsIgnoreCase(file.getData(0, 1, 0))) {
			shop.setMedium(null);
		}
		else if(shop.getLarge().getText().equalsIgnoreCase(file.getData(0, 1, 0))){
				shop.setLarge(null);
			}
			else if(shop.getXl().getText().equalsIgnoreCase(file.getData(0, 3, 0))){
					shop.setXl(null);
			}
		}
		
		//driver.findElement(By.xpath("//*[contains(@value, 'size/medium')]")).click();
		//Thread.sleep(5000); 
		//driver.findElement(By.xpath("//*[contains(@value, 'size/large')]")).click();
		//Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[contains(@value, 'size/large')]")).click();
	
	
	@Then("Display all wallpapers by choose size")
	public void display_all_wallpapers_by_choose_size() {
		System.out.println("Display all wallpapers by choose size");
	}
	@When("user click on price filter")
	public void user_click_on_price_filter() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[2]/h4")).click();
		System.out.println("user click on price filter");
		Thread.sleep(5000);
	}

	@When("select required price range")
	public void select_required_price_range() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(@value, 'price/uptors199')]")).click();
		System.out.println("selected required price range");
		Thread.sleep(5000);
	}

	@Then("Display all wallstickers in that price range")
	public void display_all_wallstickers_in_that_price_range() {


	}

	@When("user click on Discount filter")
	public void user_click_on_Discount_filter() throws InterruptedException {
		System.out.println("user click on Discount filter");
		driver.findElement(By.xpath("//*[@id=\"filterSectionWp\"]/div/div/div[3]/h4")).click();
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,4400);");
		Thread.sleep(5000);
	}

	@When("select required discount option")
	public void select_required_discount_option() {
		System.out.println("selected required discount option");
		WebElement Discount = driver.findElement(By.xpath("//*[contains(@value, 'Discount/20percentandabove')]"));
		System.out.println("size");
		
		
		if (shop.getDiscount20per().getText().equalsIgnoreCase(file.getData(0, 1, 2))) {
			shop.setDiscount20per(null);
		}
		else {
		if (shop.getDiscount80per().getText().equalsIgnoreCase(file.getData(0, 2, 2))) {
				shop.setDiscount80per(null);
		}
		}
		}
			

		//driver.findElement(By.xpath("//*[contains(@value, 'Discount/20percentandabove')]")).click();
		 
	

	@Then("Display all wallstickers by selected option")
	public void display_all_wallstickers_by_selected_option() {
		System.out.println("Display all wallstickers by selected option");

	}
	@When("user click on collection filter")
	public void user_click_on_collection_filter() {
		System.out.println("user click on collection filter");
	}

	@When("select required collection type")
	public void select_required_collection_type() {
		System.out.println("selected required collection type");
	}

	@Then("Display all collection option")
	public void display_all_collection_option() {
		System.out.println("Display all collection option");  
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@When("click on Do it yourself button")
	public void click_on_Do_it_yourself_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='ap-shop-ezy-CR8-thumbnail-asian-paints']")).click();  
		System.out.println("click on Do it yourself button");
		Thread.sleep(5000);
	}

	@Then("user navigate to Do it yourself page")
	public void user_navigate_to_Do_it_yourself_page() {
		System.out.println("user navigate to Do it yourself page");

	}

	@Then("Display all products")
	public void display_all_products() {
		System.out.println("Display all products");

	}

	@Given("user is on Do_it_yourself page")
	public void user_is_on_Do_it_yourself_page() {
		driver.get("https://www.asianpaints.com/online-shop/Do-it-yourself.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("user is on Do_it_yourself page");
	}

	@When("user click on product filter")
	public void user_click_on_product_filter() throws InterruptedException {
		System.out.println("user click on product filter");
		driver.findElement(By.xpath("//*[@class='accor-title']")).click();  
		Thread.sleep(5000);
	}

	@When("select required product option")
	public void select_required_product_option() {
		System.out.println("select required product option");

	}

	@Then("Display all product of selected option")
	public void display_all_product_of_selected_option() {
		System.out.println("Display all product of selected option");

	}
	@When("user click on color filter")
	public void user_click_on_color_filter() {
		System.out.println("Display all product of selected option");
	}

	@When("select required color option")
	public void select_required_color_option() {
		System.out.println("select required color option");
	}

	@Then("Display all products by selected color")
	public void display_all_products_by_selected_color() {
		System.out.println("Display all products by selected color");

	}

	@When("user click on surface filter")
	public void user_click_on_surface_filter() {
		System.out.println("user click on surface filter");

	}

	@When("select required surface option")
	public void select_required_surface_option() {
		System.out.println("select required surface option");

	}

	@Then("Display all product for selected surface")
	public void display_all_product_for_selected_surface() {

		System.out.println("Display all product for selected surface");
	}

	@Then("Display all products by selected size")
	public void display_all_products_by_selected_size() {
		System.out.println("Display all products by selected size");

	}

	@Then("Display all products in that price range")
	public void display_all_products_in_that_price_range() {
		System.out.println("Display all products in that price range");

	}
	@When("click on Home and personal Hygiene button")
	public void click_on_Home_and_personal_Hygiene_button() throws InterruptedException {
		System.out.println("click on Home and personal Hygiene button");
		driver.findElement(By.xpath("//*[@title='ap-shop-viroprotek-thumbnail-asian-paints']")).click();
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,4400);");
		Thread.sleep(5000);
	}

	@Then("user navigate to Home and personal Hygiene page")
	public void user_navigate_to_Home_and_personal_Hygiene_page() {
		System.out.println("user navigate to Home and personal Hygiene page");

	}

	@Given("user is on Home and personal Hygiene page")
	public void user_is_on_Home_and_personal_Hygiene_page() {
		System.out.println("user is on Home and personal Hygiene page");

	}

	@When("click on wallpapers button")
	public void click_on_wallpapers_button() throws InterruptedException {
		System.out.println("User click on wallpapers button");
		driver.findElement(By.xpath("//*[@title='ap-shop-wallpaper-thumbnail-asian-paints']")).click();
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window,scrollBy(0,1200);");
		Thread.sleep(5000);



	}


	@Then("user navigate to wallpaper page")
	public void user_navigate_to_wallpaper_page() throws InterruptedException {
		System.out.println("User is on wallpaper page");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div/div/div/a")).click();
		
			//driver.findElement(By.linkText("SEE MORE")).click();

	}

	@Then("Display all wallpapers")
	public void display_all_wallpapers() {
		System.out.println("All wallpapers are displayed");

	}
	@Given("user is on wallpaper page")
	public void user_is_on_wallpaper_page() {
		System.out.println("user is on wallpaper page");
	}

	@Then("Display all color wallpapers by option")
	public void display_all_color_wallpapers_by_option() {
		System.out.println("Display all color wallpapers by option");
	}

	@When("user click on Design style filter")
	public void user_click_on_Design_style_filter() {
		System.out.println("user click on Design style filter");
	}

	@When("select required design style")
	public void select_required_design_style() {
		System.out.println("select required design style");
	}

	@Then("Display all design style of wallpapers by option")
	public void display_all_design_style_of_wallpapers_by_option() {
		System.out.println("Display all design style of wallpapers by option");
	}

	@Then("Display all price ranges")
	public void display_all_price_ranges() {
		System.out.println("Display all price ranges");
	}
	@Given("user selected the desired product")
	public void user_selected_the_desired_product() throws InterruptedException {
		
		driver.get("https://www.asianpaints.com/online-shop/wall-stickers.html");
		Thread.sleep(5000);
		System.out.println("user selected the desired product");
		driver.findElement(By.xpath("//*[@class='loadLazyImage noLazy isVisible-img--scroll']")).click();

		Thread.sleep(5000);

	}

	@When("enter pincode")
	public void enter_pincode() throws InterruptedException {
		System.out.println("enter pincode");

		//driver.findElement(By.className("pincode")).sendKeys("433107");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='pincode']")).click();
		shop.pincode.getText();
		String.valueOf(file.getData(0,1,1));
	
		
	}

	@When("click on check button")
	public void click_on_check_button() throws InterruptedException {
		System.out.println("click on check button");
		driver.findElement(By.xpath("//*[@class='google-map-icon pincode-service-check']")).click();

		Thread.sleep(5000);
	}

	@Then("Display message showing service is available")
	public void display_message_showing_service_is_available() {

		System.out.println("Display message showing service is available");

	}


	@When("user select the number of quantity")
	public void user_select_the_number_of_quantity() throws InterruptedException {
		WebElement cnt_drp_down= driver.findElement(By.id("productInputQtyBox"));
		Select s1= new Select(cnt_drp_down);
		s1.selectByVisibleText("1");
		Thread.sleep(2000);
		s1.selectByValue("3");

		Thread.sleep(2000);
		s1.selectByIndex(4);
		System.out.println("user select the number of quantity");
	}

	@When("click on add to cart")
	public void click_on_add_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='global-button-white checkout-cart']")).click();
		System.out.println("click on add to cart");
		Thread.sleep(5000);
	}

	@Then("message showing product is added should display")
	public void message_showing_product_is_added_should_display() {


	}


	@Then("close")
	public void close() {


	}
}








