package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
    public void firstnameOlarakYazar(String firstname) {
        editorDataPages.firstname.sendKeys(firstname);
    }

    @And("lastname olarak {string} yazar.")
    public void lastnameOlarakYazar(String lastname) {
        editorDataPages.lastname.sendKeys(lastname);
    }

    @And("position olarak {string} yazar.")
    public void positionOlarakYazar(String position) {
        editorDataPages.position.sendKeys(position);
    }

    @And("office olarak {string} yazar.")
    public void officeOlarakYazar(String office) {
        editorDataPages.office.sendKeys(office);
    }

    @And("extension olarak {string} yazar.")
    public void extensionOlarakYazar(String extension) {
        editorDataPages.extension.sendKeys(extension);
    }

    @And("start olarak {string} yazar.")
    public void startOlarakYazar(String start) {
        editorDataPages.start.sendKeys(start);
    }

    @And("salary olarak {string} yazar.")
    public void salaryOlarakYazar(String salary) {
        editorDataPages.salary.sendKeys(salary);
    }

    @And("Create tusuna basar.")
    public void createTusunaBasar() {
        editorDataPages.createButton.click();
    }

    @When("Kullanici {string} ile arama yapar.")
    public void kullaniciIleAramaYapar(String firstname) {
        editorDataPages.searchBox.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular.")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        String rslt = editorDataPages.result.getText();
        Assert.assertTrue(rslt.contains(firstname));
    }
}
