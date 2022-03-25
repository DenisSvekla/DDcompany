Feature: test for loading file

  Background:
    Given openBrowserAndLogin

  Scenario: loadingFile
    Given openProfile
    When selectFileinFormAndClickSaveButton
    And
