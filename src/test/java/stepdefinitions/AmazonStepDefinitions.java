package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPages amazonPages = new AmazonPages();

    @Given("Kullanici Amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonURL"));
    }

    //Statik veri içerir. -----------------------------------------------------------
    @Given("Kullanici iPhone icin arama yapar.")
    public void kullanici_i_phone_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("iPhone" + Keys.ENTER);
    }
    @Then("Kullanici sonuclarin iPhone icerdigini test eder.")
    public void kullanici_sonuclarin_i_phone_icerdigini_test_eder() {
        String resultTR = amazonPages.resultText.getText();

        Assert.assertTrue(resultTR.contains("iPhone"));
    }
    @Given("Kullanici tea pot icin arama yapar.")
    public void kullanici_tea_pot_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("tea pot" + Keys.ENTER);
    }
    @Then("Kullanici sonuclarin tea pot icerdigini test eder.")
    public void kullanici_sonuclarin_tea_pot_icerdigini_test_eder() {
        String resultTR = amazonPages.resultText.getText();

        Assert.assertTrue(resultTR.contains("tea pot"));
    }
    @Given("Kullanici flower icin arama yapar.")
    public void kullanici_flower_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("flower" + Keys.ENTER);
    }
    @Then("Kullanici sonuclarin flower icerdigini test eder.")
    public void kullanici_sonuclarin_flower_icerdigini_test_eder() {
        String resultTR = amazonPages.resultText.getText();

        Assert.assertTrue(resultTR.contains("flower"));
    }




    //Dinamik veri içerir -----------------------------------------------------------
    @Given("Kullanici {string} icin arama yapar.")
    public void kullanici_icin_arama_yapar(String searchWord) {
        amazonPages.searchBox.sendKeys(searchWord + Keys.ENTER);
    }
    @Then("Kullanici sonuclarin {string} icerdigini test eder.")
    public void kullanici_sonuclarin_icerdigini_test_eder(String searchWord) {
        String resultTR = amazonPages.resultText.getText();
        Assert.assertTrue(resultTR.contains(searchWord));
    }

}
