package krish.MavenJava;

import org.openqa.selenium.By;

public class Main_Project extends Base_Class {

	public static void main(String[] args) throws InterruptedException {

		getBrowser("chrome");
		getUrl("https://www.firstcry.com/");

		driver.findElement(By.xpath("//span[@class='anch poplogin_main poplogin R12_61']")).click();

		userLogIn(driver.findElement(By.id("lemail")), "9003803831");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		// OTP received

		boolean otpField = driver.findElement(By.xpath("//input[@class='input-box R14_42 otp-input']")).isDisplayed();
		if (otpField = true) {
			Thread.sleep(15000);
			// Enter Otp Manually
			driver.findElement(By.id("verfiedbtn")).click();
		}

	}

}
