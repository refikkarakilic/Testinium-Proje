package com.refik.seleniumproje.constant;

import org.openqa.selenium.By;

public class Constant {

    public static String LINK = "https://www.gittigidiyor.com/";
    public static final By HESAPUSTUNEGEL = By.xpath("//*[contains(@class, 'gekhq4-4')]");
    public static final By KONTROL = By.xpath("//img[@alt='GittiGidiyor']");
    public static final By LOGIN_BUTTON = By.xpath("//span[contains(text(), 'Giriş Yap')]");
    public static final By LOGIN_EMAIL = By.id("L-UserNameField");
    public static final By LOGIN_PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_CLICK = By.id("gg-login-enter");
    public static final By ARAMA = By.xpath("//*[contains(@data-cy,'header-search-input')]");
    public static final By ARAMABUTONU = By.xpath("//*[contains(@data-cy,'search-find-button')]");
    public static final By URUN = By.xpath("//*[@id='item-info-block-641413768']/div/div[1]/div[1]/h3/span");
    public static final By ARAMASAYFA = By.xpath("//ul[@class='clearfix']/li/a[text()='2']");
    public static final By URUNMIKTARI = By.xpath("//div[contains(@class,'gg-input-select')]/select[@class='amount']");
    public static final By URUNMIKTARI2 = By.xpath("//div/select/option[@value='2']");
    public static final By COOKIE_KAPAT = By.xpath("//*[contains(@class,'policy-alert-close')]");
    public static final By SEPET = By.id("add-to-basket");
    public static final By URUNDEGERI1 = By.id("sp-price-highPrice");
    public static final By URUNDEGERI2 = By.className("new-price");
    public static final By SEPETE = By.cssSelector(".gg-ui-btn-default.padding-none");
    public static final By SEPETICON = By.className("robot-header-iconContainer-cart");
    public static final By SİL = By.cssSelector(".btn-delete.hidden-m");

}
