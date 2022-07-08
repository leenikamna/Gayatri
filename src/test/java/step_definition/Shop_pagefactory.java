package step_definition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Shop_pagefactory {
	WebDriver driver;
	 public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	 
	@FindBy(xpath="//*[@data-target='#SHOP']")
	 @CacheLookup
	 WebElement SHOP;
	 

	 @FindBy(xpath="//*[@title='ap-shop-wall-stickers-thumbnail-asian-paints']")
	 @CacheLookup
	 WebElement wallStickers;
	 
	 @FindBy(xpath="//*//*[@id=\\\"filterSectionWp\\\"]/div/div/div[1]/h4")
	 @CacheLookup
	 WebElement sizefilter;
	 
	 @FindBy(xpath="//*[contains(@value, 'size/medium')]")
	 @CacheLookup
	 WebElement medium;
	
	 public WebElement getMedium() {
		return medium;
	}
	public void setMedium(WebElement medium) {
		this.medium = medium;
	}
	
	@FindBy(xpath="//*[contains(@value, 'size/large')]")
	 @CacheLookup
	 WebElement large;
	public WebElement getLarge() {
		return large;
	}
	public void setLarge(WebElement large) {
		this.large = large;
	}
	@FindBy(xpath="//*[contains(@value, 'size/xl')]")
	 @CacheLookup
	 WebElement xl;

	public WebElement getXl() {
		return xl;
	}
	public void setXl(WebElement xl) {
		this.xl = xl;
	}


	@FindBy(xpath="//*[@id=\\\"filterSectionWp\\\"]/div/div/div[3]/h4")
	 @CacheLookup
	 WebElement Discountfilter;
	@FindBy(xpath="//*[contains(@value, 'Discount/20percentandabove')]")
	 @CacheLookup
	 WebElement Discount20per;
	
	 
	 public WebElement getDiscount20per() {
		return Discount20per;
	}
	public void setDiscount20per(WebElement discount20per) {
		Discount20per = discount20per;
	}
	@FindBy(xpath=" //*[contains(@value, 'Discount/80percentandabove')]")
	 @CacheLookup
	 WebElement Discount80per;
	
	
	public WebElement getDiscount80per() {
		return Discount80per;
	}
	public void setDiscount80per(WebElement discount80per) {
		Discount80per = discount80per;
	}


	@FindBy(xpath="//*[@title='ap-shop-ezy-CR8-thumbnail-asian-paints']")
	 @CacheLookup
	 WebElement Doityourselfbutton;
	 @FindBy(xpath="//*[@class='accor-title']")
	 @CacheLookup
	 WebElement productfilter;
	
	 @FindBy(xpath="//*[@title='ap-shop-viroprotek-thumbnail-asian-paints']")
	 @CacheLookup
	 WebElement HomeandpersonalHygienebutton;
	 
	 @FindBy(xpath="//*[@title='ap-shop-wallpaper-thumbnail-asian-paints']")
	 @CacheLookup
	 WebElement Wallpapers;
	 
	 @FindBy(xpath="//*[@class='loadLazyImage noLazy isVisible-img--scroll']")
	 @CacheLookup
	 WebElement selectproduct;
	 
	 @FindBy(xpath="//*[@class='pincode']")
	 @CacheLookup
	 WebElement pincode;
	 
	 public WebElement getPincode() {
		return pincode;
	}
	public void setPincode(WebElement pincode) {
		this.pincode = pincode;
	}


	@FindBy(xpath="//*[@class='google-map-icon pincode-service-check']")
	 @CacheLookup
	 WebElement pincodecheck;
	
	 @FindBy(xpath="//*[@class='global-button-white checkout-cart']")
	 @CacheLookup
	 WebElement addtocart;
	
	 
	 
	 
	 
	 
	 
	 
	public WebElement getProductfilter() {
		return productfilter;
	}
	public void setProductfilter(WebElement productfilter) {
		this.productfilter = productfilter;
	}
	public WebElement getHomeandpersonalHygienebutton() {
		return HomeandpersonalHygienebutton;
	}
	public void setHomeandpersonalHygienebutton(WebElement homeandpersonalHygienebutton) {
		HomeandpersonalHygienebutton = homeandpersonalHygienebutton;
	}
	public WebElement getWallpapers() {
		return Wallpapers;
	}
	public void setWallpapers(WebElement wallpapers) {
		Wallpapers = wallpapers;
	}
	public WebElement getSelectproduct() {
		return selectproduct;
	}
	public void setSelectproduct(WebElement selectproduct) {
		this.selectproduct = selectproduct;
	}
	public WebElement getPincodecheck() {
		return pincodecheck;
	}
	public void setPincodecheck(WebElement pincodecheck) {
		this.pincodecheck = pincodecheck;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}
	public WebElement getSizefilter() {
		return sizefilter;
	}
	public void setSizefilter(WebElement sizefilter) {
		this.sizefilter = sizefilter;
	}
	public WebElement getDiscountfilter() {
		return Discountfilter;
	}
	public void setDiscountfilter(WebElement discountfilter) {
		Discountfilter = discountfilter;
	}
	public WebElement getDoityourselfbutton() {
		return Doityourselfbutton;
	}
	public void setDoityourselfbutton(WebElement doityourselfbutton) {
		Doityourselfbutton = doityourselfbutton;
	}
	public WebElement getSHOP() {
		return SHOP;
	}
	public void setSHOP(WebElement sHOP) {
		SHOP = sHOP;
	}
	public WebElement getWallStickers() {
		return wallStickers;
	}
	public void setWallStickers(WebElement wallStickers) {
		this.wallStickers = wallStickers;
	}
	
	
	
	
	


	 
}
