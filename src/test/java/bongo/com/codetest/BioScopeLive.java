package bongo.com.codetest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


		//Opening The Free Content Website

public class BioScopeLive extends DriverSetUp {
	public static String baseUrl= "https://www.bioscopelive.com/en/";
	
	@Test
	public static void BongoCodeTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		//Home Page Title Verify
		String actualTitle = "Bioscope | Stream Live TV Bangla Movies Natoks Music Videos Songs";
		String siteTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, siteTitle);
		System.out.println("Home Page Title Print: "+siteTitle);
		
		
		//Open Movie Tab
		driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
		String text1 = driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).getText();
		System.out.println("Movies Tab Name: "+text1);
		Thread.sleep(10000);	
		
		
	
		//Movie Content Page Title Verify
		String contentpageTitle = "Bioscope | Stream Live TV Bangla Movies Natoks Music Videos Songs";
		String verifycontentpageTitle = driver.getTitle();
		Assert.assertEquals(contentpageTitle, verifycontentpageTitle);
		System.out.println("Movie Content Page Title Print: "+verifycontentpageTitle);
		
		
		//Open The Content & Play
		driver.findElement(By.xpath("//div[@class='video-thumb slick-slide slick-active']//h5[@title='Musafir'][normalize-space()='Musafir']")).click();
		Thread.sleep(10000);	
		
		//Movie Title Verify
		String text2 = driver.findElement(By.xpath("//h4[normalize-space()='Musafir']")).getText();
		String actualmovieTitle = "Musafir";
		Assert.assertEquals(actualmovieTitle, text2);
		System.out.println("Movie Title: "+text2);
		Thread.sleep(10000);
	}
}
	
	
