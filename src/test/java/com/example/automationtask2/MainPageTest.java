package com.example.automationtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainPageTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mantov2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("mantov");

        driver.findElement(By.name("password")).sendKeys("topSecret");

        WebElement txtComments = driver.findElement(By.name("comments"));
        txtComments.clear();
        txtComments.sendKeys("Hi, please give me the job! ((:");

        driver.findElement(By.xpath("//input[@value='cb1']")).click();

        driver.findElement(By.xpath("//input[@value='rd3']")).click();

        WebElement ddlElement = driver.findElement(By.name("dropdown"));
        Select select = new Select(ddlElement);
        select.selectByValue("dd5");


    }
}
