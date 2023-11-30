package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }


    public void esperaElemento(By by){
        //esperar hasta que el elemento exista
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public void cliOferta() {
        esperaElemento(LoginPage.clikOfertas);
        WebElement cliOfert= driver.findElement(LoginPage.clikOfertas);
        cliOfert.click();
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
    }

    public void cliProducto() {
        //esperaElemento(LoginPage.clikProducto);
        WebElement cliProduc=driver.findElement(LoginPage.clikProducto);
        cliProduc.click();
        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }
    }

    public void cliItem() {
        WebElement ele = driver.findElement(By.xpath("//body/div[@id='body-productos']/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/section[1]/div[1]/div[1]/div[3]/p[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);


        /*WebElement cliIte=driver.findElement(LoginPage.clikItem);
        cliIte.click();
        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }*/
    }


    public void agreCarro() {
        WebElement agreCar=driver.findElement(LoginPage.agreCarrito);
        agreCar.click();
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

    }
}
