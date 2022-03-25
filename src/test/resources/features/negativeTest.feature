Feature: two negative test

  Scenario:
    Given openBrowserAndLogin
    When openCompanyPage
    And in field OGRN enter incorrect value
    Then get an informational error message

