package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import appLogic.Constants;
import driverLogic.TestBase;

public class InternationalPassport extends TestBase {
	
	
	
	@Test
    public void DnipropetrovskInternationalPassportTest() {
        // ------------------- Тестовые данные -------------------//
        String service = Constants.Settings.Identity.InternationalPassport;
        String region = Constants.Settings.Region.Dnipropetrovska;
        String havePassport = "ні, буду отримувати перший раз";
        String biometrical = "ні";
        String phone = "0931234567";
        String email = "test@gmail.com";
        String area = "Дніпропетровськ (Центральний), вул. Поля, 1";
        String status = "Заявка подана";
        
        
        
       
        // --------------------- Тест-кейс----------------------//
//        mainPage.typeInSearchField(service);
//        app.pause(5000);
//        mainPage.clickService(service);
        mainPage.goToService();
        Assert.assertEquals(selectAreaPage.serviceName.getText(), service);
        selectAreaPage.selectRegion(region);
        authorizationPage.privatBankAuthorization();
        Assert.assertEquals(internationalPassportPage.serviceName.getText(), service);
        internationalPassportPage
                   .selectHavePassport(havePassport)
                   .selectBiometrical(biometrical)
                   .typeInPhoneField(phone)
                   .typeInEmailField(email)
                   .selectArea(area)
                   .selectDay()
                   .selectTime()
                   .clickConfirmButton()
                   .verifyServiceSuccessCreated()
                   .saveReferenceNumber(); 
        mainPage.goToStatus();
        statusPage.inputReferenceNumberForInternationalPassport()
                  .clickViewStatusButton()
                  .verifyStatus(status);
                
        
        
    }
}
