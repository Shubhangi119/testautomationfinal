package com.QaInfotech.PageObjects;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AppTest{
	private WebElement searchbar;
	private WebElement logoimg;
	private WebElement imgpanel;
	private WebElement pausebtn;
	private WebElement playbtn;
	private WebElement blueicon;
	private WebElement cntctext;
	private WebElement cntctnum;
	private WebElement careernav;
	private WebElement pausescreen;
	private WebElement playscreen;
	private WebElement about;
	private WebElement service;
	private WebElement verticals;
	private WebElement contact;
	private WebElement news;
	private WebElement form;
	private WebElement slider;
	private WebElement searchlink;
	private WebElement jobmenu;
	private WebElement searchlinkun;
	private List<WebElement> tabList;

	public boolean verifyQaInfoTechWebPageLoaded() {
		 logoimg = 
				driver.findElement(By.cssSelector(".container_full .logo.onepage.logo_lg"));
		
		return logoimg.isDisplayed();
	}
	
	public boolean verifysearchbarloaded() {
		searchbar = driver.findElement(By.cssSelector(".top-search"));
		return searchbar.isDisplayed();
	}
	public boolean verifyimagepanelloaded() {
		imgpanel = driver.findElement(By.cssSelector(".ls-gpuhack"));
		return imgpanel.isDisplayed();
		
	}
	public boolean verifypausebuttonloaded() {
		pausebtn =driver.findElement(By.cssSelector(".ls-bottom-nav-wrapper .ls-nav-stop"));
		return pausebtn.isDisplayed();
	}
	public boolean verifyplaybuttonloaded() {
		playbtn =driver.findElement(By.cssSelector(".ls-bottom-nav-wrapper  .ls-nav-start "));
		return playbtn.isDisplayed();
	}
	public boolean verifybluenotepadiconloaded()
	{
		blueicon =driver.findElement(By.cssSelector(".rfq_inner .rfq_img"));
		return blueicon.isDisplayed();
		
	}
	public boolean careerpagenav()
	{
		careernav=driver.findElement(By.cssSelector(".execphpwidget .title>h1"));
		String cheading=careernav.getText();
		if(cheading.equals("Careers"))
			
		return true;
		else return false;
	}
	public boolean verifyPauseScreenLoop() {
		pausescreen=driver.findElement(By.cssSelector(".ls-bottom-nav-wrapper .ls-nav-stop-active"));
		return pausescreen.isDisplayed();
	}
	public boolean scrollaboutnav() {
		about=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>li"));
		String s=about.getAttribute("class");
		
		if(s.equals("active")) {
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return true;
		
		}
		else 
			return false;
		 
	}
	
	public boolean checkenquiryformverify() {
		form = driver.findElement(By.cssSelector("#wpcf7-f1349-o1"));
		return form.isDisplayed();
		
	}
	public boolean checkjobmenulist(){
		jobmenu=driver.findElement(By.cssSelector(".menu-careers-container"));
		return jobmenu.isDisplayed();
		
	}
	public boolean checksliderimage() {
		slider = driver.findElement(By.cssSelector("#knowledge"));
		return slider.isDisplayed();
	}
	
	public boolean checkunavailink() {
		searchlinkun=driver.findElement(By.cssSelector("#post-0"));
		return searchlinkun.isDisplayed();
	}
	public boolean checkavailink() {
		searchlink=driver.findElement(By.cssSelector("#contents-2"));
		return searchlink.isDisplayed();
	}
	public boolean scrollverticalnav()
	{   
		verticals=driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(3)"));
		String b=verticals.getAttribute("class");
		if(b.equals("active")) {
			return true;
		}
		else
			return false;
	}
	
	public boolean verifyscrollcontactnav() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		contact = driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(7)"));
		String c=contact.getAttribute("class");
		if(c.equals("active")) {
			return true;
		}
		else
			return false;
	}
	
	public boolean scrollnewsnav() {
		news = driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(6)"));
				String d=news.getAttribute("class");
				if(d.equals("active")) {
					return true;
				}
				else 
					return false;
	}
	public boolean verifyscrollservicenav() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		service = driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(2)"));
		String a=service.getAttribute("class");
		if(a.equals("active")) {
			return true;
		}
		else
			return false;
		
	}
	public boolean verifyscrollteamnav() {
		service = driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(5)"));
		String a=service.getAttribute("class");
		if(a.equals("active")) {
			return true;
		}
		else
			return false;
		
	}
	public boolean verifyscrollknav(){
		service = driver.findElement(By.cssSelector(".menu_main .nav-collapse>ul>:nth-child(4)"));
		String a=service.getAttribute("class");
		if(a.equals("active")) {
			return true;
		}
		else
			return false;
		
	}
	
	public int verifySevenMenuBar() {
		tabList = driver.findElements(By.cssSelector(".nav-collapse li"));
		 return tabList.size();
			  
		}
	
	public boolean verifycontactdetailsontop() {
		cntctext = driver.findElement(By.cssSelector("#header .right>span:nth-child(2)"));
		String Sales= cntctext.getText();
		 cntctnum=driver.findElement(By.cssSelector("#header .right>span:nth-child(3)"));
        String number=cntctnum.getText();
        
	if(("Sales Enquiry:".equals(Sales)) && ("+1 469-759-7848, +91- 9560000079".equals(number)))
	 
		return true;
	
	else return false;
}
	public boolean verifyplayscreenloaded() {
		playscreen = driver.findElement(By.cssSelector(".ls-bottom-nav-wrapper  .ls-nav-start-active"));
		return playscreen.isDisplayed();
	}
	
	
}
