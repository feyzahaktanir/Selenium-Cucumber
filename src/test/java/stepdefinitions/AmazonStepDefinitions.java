package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class AmazonStepDefinitions {
    @Given("Kullanici Amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://www.amazon.com");
         throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanici iPhone icin arama yapar.")
    public void kullanici_i_phone_icin_arama_yapar() {

         throw new io.cucumber.java.PendingException();
    }
    @Then("Kullanici sonuclarin iPhone icerdigini test eder.")
    public void kullanici_sonuclarin_i_phone_icerdigini_test_eder() {

         throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanici tea pot icin arama yapar.")
    public void kullanici_tea_pot_icin_arama_yapar() {

         throw new io.cucumber.java.PendingException();
    }
    @Then("Kullanici sonuclarin tea pot icerdigini test eder.")
    public void kullanici_sonuclarin_tea_pot_icerdigini_test_eder() {

         throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanici flower icin arama yapar.")
    public void kullanici_flower_icin_arama_yapar() {

        throw new io.cucumber.java.PendingException();
    }
    @Then("Kullanici sonuclarin flower icerdigini test eder.")
    public void kullanici_sonuclarin_flower_icerdigini_test_eder() {

        throw new io.cucumber.java.PendingException();
    }

}
