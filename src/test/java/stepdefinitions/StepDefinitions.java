package stepdefinitions;

import implementations.Implementations.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;

import static implementations.Implementations.*;

public class StepDefinitions {
    @Given("^User enter the desired capabilities$")
    public void desiredCapabilities(){
        desiredCapability();
    }
    @Given("^User taps on Access'ibility button$")
    public void tapAccessibility(){
        tapAccessibilityButton();
    }
    @When("^User taps on Accessibility node querying$")
    public void tapFirstElement(){
        tapFirstElements();
    }
    @Then("^User turn on the Do taxes radio button$")
    public void radioButton(){
        tapRadioButton();
    }
    @Given("^User clicks on views button$")
    public void selectView(){
        clickView();
    }
    @When("^User clicks on Expandable Lists button$")
    public void selectExpandableList(){
        clickExpandableList();
    }
    @Then("^User click and holds on Custom Adapter$")
    public void clickAndHoldOption(){
        clickAndHold();
    }
    @Given("^User clicks on view button$")
    public void selectViewAgain(){
        clickViewAgain();
    }
    @When("User clicks on auto-complete button")
    public void selectAutoComplete(){
        clickAutoComplete();
    }
    @And("^User click on screen-top button$")
        public void selectScreenTop(){
        clickScreenTop();
    }
    @Then("^User searches for the third option that is United states$")
    public void searchFromDropDown(){
        searchDropDown();
    }
    @Given("^User click on views button$")
    public void selectViewButton(){
        clickView();
    }
    @When("^User click on auto-complete button$")
    public void selectAutoCompleteButton(){
        clickAutoComplete();
    }
    @And("^User clicks on multiple-items$")
    public void selectMultipleItems(){
        clickMultipleItems();
    }
    @Then("^User selects multiple value from the auto-complete dropdown$")
    public void selectMultipleFromDropdown(){
        addTextInMultiple();
    }
    @When("^User scrolls the page to the last$")
    public void scrollPage(){
        scrollViewPage();
    }
    @Given("^User is on the Scrollable page$")
    public void scrollPageHorizontally(){
        scrollHorizontally();
    }
    @Then("^User prints the data of tab20 of Scrollable page$")
    public void printText(){
        getTextOfScrollable();
    }
    @Given("^User handles the toast message inside the colorbox window$")
    public void toastMessage(){
        handlesToastMessages();
    }
    @Given("^User is on the view page of Api demo app$")
    public void onViewPage(){
        clickView();
    }
    @When("^User searched for date widgets$")
    public void searchDateWidgets(){
        clickDateWidgets();
    }
    @And("^User selects inline option$")
    public void selectInlineOption(){
        clickInline();
    }
    @Then("^User swipes the minutes from 15 to 45$")
    public void swipePageLeft(){
        swipeLeft();
    }

    @Given("^User is on the views page of Api demo app$")
    public void openView(){
        clickView();
    }
    @When("^Uses chooses option drag and drop$")
    public void dragAndDropOption(){
        selectDragDrop();
    }
    @Then("^User performs the drag and drop functionality$")
    public void dragAndDrop(){
        performDragDrop();
    }
}

