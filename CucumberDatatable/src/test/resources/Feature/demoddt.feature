@tag
Feature: Verify SignIn Page
  I want to use this template for my feature file

  @tag1
  Scenario: Sign In page
    Given Open the application in Chrome
    And Navigate to https://petstore.octoperf.com/
    And Verify the Title of WebPage
    And Checked the pages load succesfully
    Then Click enter the store link
    And Check the sign In page appears
    Then User click on username and Password
    |s123|s123|