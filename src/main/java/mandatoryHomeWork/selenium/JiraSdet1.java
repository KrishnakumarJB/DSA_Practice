package mandatoryHomeWork.selenium;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class JiraSdet1 {


	ChromeDriver driver;

	@BeforeMethod
	public void setUpBrowser(){
		driver = new ChromeDriver();
		driver.get("https://krishnakumarj.atlassian.net/browse/SDET-1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void test() throws InterruptedException {
		String[] members = {  "Asif", "Nawin", "Jothesh", "Pradeep", "Anish"};
		Random randomNum = new Random();
		int ranGen = randomNum.nextInt(members.length);
		String name = members[ranGen];
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("krishnakumarj1993@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Wantedguy@0404");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("(//span[text()='Projects'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='View all projects'])")).click();
		driver.findElement(By.id("keyword")).sendKeys("invalid");
		driver.findElement(By.xpath("//h4[text()='No projects were found that match your search']"));
		driver.findElement(By.xpath(
				"//div[@id='ak-main-content']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("keyword")).sendKeys("automation");
		String youDontHave = driver.findElement(By.xpath("//img[@role='presentation']/following-sibling::h4[1]")).getText();
		System.out.println(youDontHave);
			driver.findElement(By.id("keyword")).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[contains(text(),'Automation')]")).click();
		String numType = driver.findElement(By.xpath(
				"(//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span"))
				.getText();
		System.out.println("Numtype: " + numType);
		((JavascriptExecutor) driver).executeScript("window.open()");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.navigate().to("https://pradeep1331.atlassian.net/jira/software/projects/PT/boards/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
		driver.findElement(By.id("createGlobalItem")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[text()='Task']")).click();
		driver.findElement(By.id("summary-field")).sendKeys("Test Summary");
		WebElement ele = driver.findElement(By.id("assignee-field-label"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.xpath("//label[@id='assignee-field-label']/following::div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='" + name + "']")).click();
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String numType2 = driver.findElement(By.xpath(
				"(//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span"))
				.getText();
		System.out.println("Num type2: "+numType2);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
		driver.findElement(By.id("createGlobalItem")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']"))
				.click();
		driver.findElement(By.xpath("//div[text()='Bug']")).click();

		driver.findElement(By.id("summary-field")).sendKeys("Test BUG");
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele1 = driver.findElement(By.xpath("(//span[text()='Test BUG'])"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Test BUG'])")).click();
		driver.findElement(By.xpath("(//span[text()='To Do'])")).click();
		driver.findElement(By.xpath("(//span[text()='Done'])")).click();
		driver.findElement(By.xpath(
				"//div[@id='jira-issue-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]"))
				.click();
		String BugCount = driver.findElement(By.xpath(
				"((//h2[@data-test-id='platform-board-kit.common.ui.column-header.editable-title.column-title.column-title'])/div[2]/div/span/span)[2]"))
				.getText();
		System.out.println(BugCount);
		driver.close();

	}
}