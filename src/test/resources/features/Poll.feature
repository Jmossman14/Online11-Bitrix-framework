
Feature: Poll feature
  Agile story (User story # 4): User should be able to login in order to access the Poll feature and be able to access all
  of the functionalities

  Background: As a user i should be able to login with valid credentials
    Given User inputs valid credentials
    Then User should be able to login
    Then User should click on Poll

    @Scenario1
  Scenario: User should be able to click on upload files
    Then User should click on Upload Files
   # And User should be able to click on Upload Files and images
   # And User should be able to click on Select Document
   # And User should be able to click on Download from External Drive
   # And User should be able to click on Desktop applications


  @Scenario2
  Scenario: User should be able to add users
    Then User should click on Add More
    Then User should click on EmailUsers
    Then User should click on Employees and Departments and select an Email
    Then User should click on Recent

  @Scenario3
  Scenario: User should be able to attach link by clicking on the link icon
    Then User should click on Link icon
    Then User should fill in Text Box with Test
    Then User should fill in Link Box with Sample URL
    And User should click on Save button

  @Scenario4
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL
    Then User should click on Video icon
    And User should insert a URL and click Save

  @Scenario5
  Scenario: User should be able to create a quote by clicking on the Comma icon.
    Given User should click on the Comma Icon and insert Test text
# need to fix the insert text box

  @Scenario6
  Scenario: User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Then User should click on Add mention icon
    And User should click Employees and Departments
    And User should select a contact from Employees and Departments

    @Scenario7
  Scenario: User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
      Then User should click on Visual Editor
      And User should confirm the editor text bar is displayed on top of the message box

   @Scenario8
  Scenario: User should be able to click on the Topic icon to see the poll Topic text box displays on top of the message box.
        Then User should be able to click on the Topic icon
        And User should confirm the poll Topic text box is displayed on top of the message box
  @Scenario9
  Scenario: User should be able to click on "Record Video" tab to record a video and attach it with the message.
    Then User should be able to click on Record Video
    #And User should be able to attach a message with the video

  @WIP
  Scenario: User should be able to Add questions and multiple answers; user can provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
    And User should be able to Add questions and multiple answers
    And user can provide multiple choice to attendees by selecting the Allow multiple choice checkbox