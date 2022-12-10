package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPages;
import utilities.ConfigReader;

import java.text.CompactNumberFormat;

public class HMCStepDefinitions {

    HMCPages hmcPages = new HMCPages();

    @Given("Kullanici Login linkine tiklar.")
    public void kullanici_login_linkine_tiklar() {
        hmcPages.mainpageLoginn.click();
    }
    @Then("Kullanici adi olarak {string} girer.")
    public void kullanici_adi_olarak_girer(String hmcValidUsername) {
        hmcPages.hmcUsername.sendKeys(ConfigReader.getProperty(hmcValidUsername));

    }
    @Then("Kullanici sifre olarak {string} girer.")
    public void kullanici_sifre_olarak_girer(String hmcValidPassword) {
        hmcPages.hmcPassword.sendKeys(ConfigReader.getProperty(hmcValidPassword));

    }
    @Then("Kullanici Login butonuna basar.")
    public void kullanici_login_butonuna_basar() {
        hmcPages.hmcLoginButton2.click();

    }
    @Then("Kullanici basarili giris yapildigini test eder.")
    public void kullanici_basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPages.hmcPositiveLogin.isDisplayed());

    }

}
