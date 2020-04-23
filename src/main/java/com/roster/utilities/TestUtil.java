package com.roster.utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.roster.testbase.Base;

public class TestUtil extends Base {
	
	public static String img_path;
	
	public static void captureScreenShot() throws AWTException{
		// Take screenshot and store as a file format             
		// File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		//try {
		// now copy the  screenshot to desired location using copyFile method
		 
		//FileHandler.copy(src, new File("D:/selenium/"+System.currentTimeMillis()+".png"));                       
		
		  //   } catch (IOException e)
		 
		    //   {
		    //     System.out.println(e.getMessage());
		    //  }
		
		 		System.out.println("In method capture screenShot");
		BufferedImage image;
		try {
			image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			//ImageIO.write(image, "png", new File("D:\\Selenium\\Scrnshots\\"+System.currentTimeMillis()+".png"));
			 long cur_time = System.currentTimeMillis();
			 ImageIO.write(image, "png", new File("D:\\Selenium\\Scrnshots\\"+cur_time+".png"));
			  img_path = "D:\\Selenium\\Scrnshots\\"+cur_time+".png";
			
		 } catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } 

		  }
	
	

}
