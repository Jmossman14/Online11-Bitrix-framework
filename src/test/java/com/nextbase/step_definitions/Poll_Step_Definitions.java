package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class Poll_Step_Definitions {

    // Background

    @Given("User inputs valid credentials")
    public void user_inputs_valid_credentials() {
        LoginPage loginPage=new LoginPage();
        driver.getDriver().get("http://login2.nextbasecrm.com/");
        loginPage.userNameBox.sendKeys("hr45@cybertekschool.com"+Keys.ENTER);
        loginPage.passwordBox.sendKeys("UserUser"+Keys.ENTER);
    }



    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        String actualTitle= driver.getDriver().getTitle();
        String expectedTitle="Portal";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @And("User should click on Poll")
    public void userShouldClickOnPoll() throws InterruptedException {
        WebElement PollButton = driver.getDriver().findElement(By.id("feed-add-post-form-tab-vote"));
        PollButton.click();
        Thread.sleep(5000);
    }

    //Scenario 1


    @Then("User should click on Upload Files")
    public void userShouldClickOnUploadFiles() {
        WebElement uploadFileButton = driver.getDriver().findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileButton.click();



    }


  /*  @And("User should be able to click on Upload Files")
    public void userShouldBeAbleToClickOnUploadFilesAndImages() {

        WebElement filesAndImagesButton = driver.getDriver().findElement(By.xpath("//input[@class = 'diskuf-fileUploader wd-test-file-light-inp']"));
        filesAndImagesButton.click();
    }

    @And("User should be able to click on Select Document")
    public void userShouldBeAbleToClickOnSelectDocument() {
        WebElement SelectDocButton =  driver.getDriver().findElement(By.xpath("//"));
        SelectDocButton.click();
    }

    @And("User should be able to click on Download from External Drive")
    public void userShouldBeAbleToClickOnDownloadFromExternalDrive() {
    }

    @And("User should be able to click on Desktop applications")
    public void userShouldBeAbleToClickOnDesktopApplications() {
    }

*/

  // Scenario 2

    @Then("User should click on Add More")
    public void userShouldClickOnAddMore() throws InterruptedException {
        WebElement AddUsersButton = driver.getDriver().findElement(By.id("bx-destination-tag"));
        AddUsersButton.click();
        Thread.sleep(5000);

    }


    @Then("User should click on EmailUsers")
    public void userShouldClickOnEmailUsers() {
        WebElement EmailUsers = driver.getDriver().findElement(By.xpath("//a[.='E-mail users']"));
        EmailUsers.click();
    }

    @Then("User should click on Employees and Departments and select an Email")
    public void userShouldClickOnEmployeesAndDepartmentsAndSelectAnEmail() throws InterruptedException {
        WebElement EmployeesAndDepartment = driver.getDriver().findElement(By.xpath("//a[.='Employees and departments']"));
        EmployeesAndDepartment.click();
        Thread.sleep(3000);

        WebElement exampleEmail = driver.getDriver().findElement(By.xpath("//div[.='helpdesk33@cybertekschool.com']"));
        exampleEmail.click();


    }


    @Then("User should click on Recent")
    public void userShouldClickOnRecent() throws InterruptedException {
        WebElement Recent = driver.getDriver().findElement(By.xpath("//a[.='Recent']"));
        Recent.click();
        Thread.sleep(3000);

        WebElement AllEmployees = driver.getDriver().findElement(By.xpath("//div[@class= 'bx-finder-box-item-t7-name']"));
        AllEmployees.click();
        Thread.sleep(2000);
        AllEmployees.click();


    }



    //Scenario 3

    @Then("User should click on Link icon")
    public void userShouldClickOnLinkIcon() throws InterruptedException {

    WebElement LinkIcon = driver.getDriver().findElement(By.xpath("//span[@class = 'bxhtmled-top-bar-btn bxhtmled-button-link']"));
    LinkIcon.click();
    Thread.sleep(2000);

    }


    @Then("User should fill in Text Box with Test")
    public void userShouldFillInTextBoxWithTest() {
        WebElement TextBox = driver.getDriver().findElement(By.id("linkidPostFormLHE_blogPostForm-text"));
        TextBox.click();
        TextBox.sendKeys("Test");


    }


    @Then("User should fill in Link Box with Sample URL")
    public void userShouldFillInLinkBoxWithSampleURL() {
        WebElement LinkBox = driver.getDriver().findElement(By.id("linkidPostFormLHE_blogPostForm-href"));
        LinkBox.click();
        LinkBox.sendKeys("www.test.com");

    }

    @And("User should click on Save button")
    public void userShouldClickOnSaveButton() {
        WebElement SaveButton = driver.getDriver().findElement(By.xpath("//input[@id='undefined']"));
        SaveButton.click();
    }

    //Scenario 4:
    @Then("User should click on Video icon")
    public void userShouldClickOnVideoIcon() {
        WebElement VideoIcon = driver.getDriver().findElement(By.xpath("//span[@class = 'bxhtmled-top-bar-btn bxhtmled-button-video']"));
        VideoIcon.click();
    }


    @And("User should insert a URL and click Save")
    public void userShouldInsertAURLAndClickSave() throws InterruptedException {
        WebElement URLBox = driver.getDriver().findElement(By.id("video_idPostFormLHE_blogPostForm-source"));
        URLBox.click();
        URLBox.sendKeys("https://www.youtube.com/watch?v=6xLxF8Rh6Rs");
        Thread.sleep(2000);

        WebElement saveButton = driver.getDriver().findElement(By.xpath("//input[@class='adm-btn-save']"));
        saveButton.click();


    }


    //Scenario 5
    @Given("User should click on the Comma Icon and insert Test text")
    public void userShouldClickOnTheCommaIconAndInsertTestText() throws InterruptedException {
        WebElement CommaIcon = driver.getDriver().findElement(By. xpath("//span[@class = 'bxhtmled-top-bar-btn bxhtmled-button-quote']"));
        CommaIcon.click();
        Thread.sleep(2000);

     /*     NEED TO FIX TEXT BOX
      WebElement textBox  = driver.getDriver().findElement(By.cssSelector("html body blockquote.bxhtmled-quote"));
       // textBox.click();
        textBox.sendKeys("Test");

      */


    }



    //Scenario 6:

    @Then("User should click on Add mention icon")
    public void userShouldClickOnAddMentionIcon() {
        WebElement AddMentionIcon = driver.getDriver().findElement(By.id("bx-b-mention-blogPostForm"));
        AddMentionIcon.click();

    }



    @And("User should click Employees and Departments")
    public void userShouldClickEmployeesAndDepartments() throws InterruptedException {
        Thread.sleep(3000);
        WebElement EmployeesAndDepartments = driver.getDriver().findElement(By.xpath("//a[.='Employees and departments']"));
        EmployeesAndDepartments.click();



    }


    @And("User should select a contact from Employees and Departments")
    public void userShouldSelectAContactFromEmployeesAndDepartments() throws InterruptedException {

        Thread.sleep(2000);
        WebElement exampleEmail = driver.getDriver().findElement(By.xpath("//div[.='helpdesk33@cybertekschool.com']"));
        exampleEmail.click();

    }

    //Scenario 7:

    @Then("User should click on Visual Editor")
    public void userShouldClickOnVisualEditor() {

        WebElement VisualEditorButton = driver.getDriver().findElement(By.id("lhe_button_editor_blogPostForm"));
        VisualEditorButton.click();

    }

    @And("User should confirm the editor text bar is displayed on top of the message box")
    public void userShouldConfirmTheEditorTextBarIsDisplayedOnTopOfTheMessageBox() {

        WebElement textBar = driver.getDriver().findElement(By.id("bx-html-editor-tlbr-idPostFormLHE_blogPostForm"));

        Assert.assertTrue(textBar.isDisplayed());


    }

    //Scenario 8:

    @Then("User should be able to click on the Topic icon")
    public void userShouldBeAbleToClickOnTheTopicIcon() {
        WebElement TopicIcon = driver.getDriver().findElement(By.id("lhe_button_title_blogPostForm"));
        TopicIcon.click();
    }

    @And("User should confirm the poll Topic text box is displayed on top of the message box")
    public void userShouldConfirmThePollTopicTextBoxIsDisplayedOnTopOfTheMessageBox() throws InterruptedException {
        WebElement textBox = driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-title']"));
        Assert.assertTrue(textBox.isDisplayed());

        /*textBox.click();
        Thread.sleep(1000);
        textBox.sendKeys("test");

         */

    }


    //Scenario 9:
    @Then("User should be able to click on Record Video")
    public void userShouldBeAbleToClickOnRecordVideo() {

        WebElement RecordVideo = driver.getDriver().findElement(By.xpath("//span[.='Record Video']"));
        RecordVideo.click();
    }


   /* MY COMPUTER WILL NOT ALLOW TO RECORD VIDEO
    @And("User should be able to attach a message with the video")
    public void userShouldBeAbleToAttachAMessageWithTheVideo() {

    }

    */

//Scenario 10:
    @And("User should be able to Add questions and multiple answers")
    public void userShouldBeAbleToAddQuestionsAndMultipleAnswers() throws InterruptedException {
        WebElement AddQuestion1 = driver.getDriver().findElement(By.id("question_0"));
        AddQuestion1.click();
        AddQuestion1.sendKeys("Test Question 1");
        Thread.sleep(1000);

        WebElement Answer1 = driver.getDriver().findElement(By.id("answer_0__0_"));
        Answer1.click();
        Answer1.sendKeys("Test Answer 1");
        Thread.sleep(2000);

        WebElement Answer2 = driver.getDriver().findElement(By.id("answer_0__1_"));
        Answer2.click();
        Answer2.sendKeys("Test Answer 2");
        Thread.sleep(2000);




    }

    @And("user can provide multiple choice to attendees by selecting the Allow multiple choice checkbox")
    public void userCanProvideMultipleChoiceToAttendeesBySelectingTheAllowMultipleChoiceCheckbox() {
        WebElement MultipleChoice = driver.getDriver().findElement(By.xpath("//input[@id='multi_0']"));
        MultipleChoice.click();


    }
}
