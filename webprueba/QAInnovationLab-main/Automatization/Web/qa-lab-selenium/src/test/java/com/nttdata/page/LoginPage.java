package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.xpath("//input[@id='email']");
    public static By passInput = By.xpath("//input[@id='password']");
    public static By loginButton = By.xpath("//button[@id='btn_submit']");

    public static By clikOfertas=By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/h2[1]/a[1]");

    public static By clikProducto=By.xpath("//body/div[@id='body-Ofertas']/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public static By clikItem=By.xpath("//body/div[@id='body-productos']/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/section[1]/div[1]/div[1]/div[3]/p[1]");

    public static By agreCarrito=By.xpath("//button[@id='btn_add_cart_full']");

}
