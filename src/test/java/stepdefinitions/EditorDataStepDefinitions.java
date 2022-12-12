package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPages;
import pages.EditorDataPages;
import pages.HMCPages;

public class EditorDataStepDefinitions {

    AmazonPages amazonPages = new AmazonPages();
    HMCPages hmcPages = new HMCPages();
    EditorDataPages editorDataPages = new EditorDataPages();

    @Then("new butonuna tiklar")
    public void newButonunaTiklar() {
        editorDataPages.newButton.click();
    }

    @And("firstname olarak {string} yazar.")
    public void firstnameOlarakYazar(String arg0) {

    }

    @And("lastname olarak {string} yazar.")
    public void lastnameOlarakYazar(String arg0) {

    }

    @And("position olarak {string} yazar.")
    public void positionOlarakYazar(String arg0) {

    }

    @And("office olarak {string} yazar.")
    public void officeOlarakYazar(String arg0) {
        
    }

    @And("extension olarak {string} yazar.")
    public void extensionOlarakYazar(String arg0) {
        
    }

    @And("start olarak {string} yazar.")
    public void startOlarakYazar(String arg0) {
        
    }

    @And("salary olarak {string} yazar.")
    public void salaryOlarakYazar(String arg0) {
        
    }

    @And("Create tusuna basar.")
    public void createTusunaBasar() {
        
    }

    @When("Kullanici {string} ile arama yapar.")
    public void kullaniciIleAramaYapar(String arg0) {
        
    }

    @Then("isim bolumunde {string} oldugunu dogrular.")
    public void isimBolumundeOldugunuDogrular(String arg0) {
    }
}
