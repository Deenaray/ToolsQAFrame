package demoQAPackege;

import demoQAPackege.DriverCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyTypedefs {
    DriverCode driverCode=new DriverCode();
    @Given("Click on Elements")
    public void clickOnElements() throws InterruptedException {
        driverCode.openUrl();
        
    }

    @And("click on Download and upload file")
    public void clickOnDownloadAndUploadFile() {
        driverCode.downloadandUpload();
        
    }

    @Then("click upload")
    public void clickUpload() throws InterruptedException {
        driverCode.upLoadFile();
    }

    @Given("Click on dynamic element")
    public void clickOnDynamicElement() throws InterruptedException {
        driverCode.dynamicElement();
        
    }

    @And("click on color change button")
    public void clickOnColorChangeButton() {
       driverCode.colorChange();
    }

    @Then("click on third element")
    public void clickOnThirdElement() throws InterruptedException {
        driverCode.visibleAfterButton();
    }

    @Given("Fill all the fields which required")
    public void fillAllTheFieldsWhichRequired() throws InterruptedException {
        driverCode.forms();
    }
}
