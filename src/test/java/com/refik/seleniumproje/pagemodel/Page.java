package com.refik.seleniumproje.pagemodel;

import com.refik.seleniumproje.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.refik.seleniumproje.constant.Constant.*;

public class Page extends BasePage {

    public Page(WebDriver driver) {
        super(driver);
    }

    public void chartIncreaseQuantityClick() {
        click(URUNMIKTARI);
        click(URUNMIKTARI2);
    }

    public void clickProduct() {
        click(URUN);
    }

    public void loginClick()
    {
        click(LOGIN_BUTTON);
    }

    public void hoverElement(){
        hoverElement(HESAPUSTUNEGEL);
    }

    public boolean GetMainPageVisibility(){
        return isVisible(KONTROL);
    }

    public void enterEmail(String email){
        sendKeys(LOGIN_EMAIL,email);
    }

    public void enterPassword(String password){
        sendKeys(LOGIN_PASSWORD,password);
    }

    public void clickLoginEnter(){
        click(LOGIN_CLICK);
    }

    public void searchEnterText(String searchText){
        sendKeys(ARAMA,searchText);
    }

    public void searchClick(){
        click(ARAMABUTONU);
    }

    public void searchPageNo(){
        click(ARAMASAYFA);
    }

    public void clickCookieClose() {
        click(COOKIE_KAPAT);
    }

    public void clickrecophone(){
        click(SEPET);
    }

    public String getTextPage(){
        return getText(URUNDEGERI1);
    }

    public void goBasket(){
        hoverElement(SEPETICON);
        click(SEPETE);
    }

    public void clickDelete(){
        click(SİL);
    }
    
    public String getTextBasket(){
        return getText(URUNDEGERI2);
    }

}
