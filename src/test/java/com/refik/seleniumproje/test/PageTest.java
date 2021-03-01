package com.refik.seleniumproje.test;

import com.refik.seleniumproje.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PageTest extends BaseTest {

    String urunFiyat;

    @Test()
    public void runPage (){

        //Ana sayfanın açıldığı kontrol edilir
        boolean visibilityStatus = pageModel.GetMainPageVisibility();
        Assert.assertTrue("Ana sayfa acilamadi.",visibilityStatus );

        // Hesabımın üstüne gelir
        pageModel.hoverElement();

        //Giriş yap tıklanır
        pageModel.loginClick();

        //Email ve şifre bilgilerini giriyoruz
        pageModel.enterEmail("refikkarakilic@stu.aydin.edu.tr");
        pageModel.enterPassword("refik123..");

        // Giriş yap tuşuna basılır
        pageModel.clickLoginEnter();

        //Arama alanına bilgisayar yazılır
        pageModel.searchEnterText("bilgisayar");

        //Arama icona tıklanır
        pageModel.searchClick();

        // Cookie kapatılır
        pageModel.clickCookieClose();

        //2. sayfa açılır
        pageModel.searchPageNo();

        //2.ürüne tıkla
        pageModel.clickProduct();

        //Sepete eklenir
        urunFiyat = pageModel.getTextPage();
        pageModel.clickrecophone();

        //Sepete gidilir
        pageModel.goBasket();

        //Sayfadaki fiyatıyla sepet fiyatı karşılaştırılır
        String onBasket = pageModel.getTextBasket();
        Assert.assertEquals(onBasket, urunFiyat);

        //Sepetteki ürün 2 olarak girilir ve kontrol edilir
        pageModel.chartIncreaseQuantityClick();

        //Sepetten sil
        pageModel.clickDelete();

    }


}
