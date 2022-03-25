Feature: GRUD test for create and delete company

  Scenario: create company
    Given openBrowserAndLogin
    When openCompanyPage
    And createCompany
    Then onCompaniesPageDisplayCompany

  Scenario: delete company
    When deleteCompany
    Then onCompaniesPageNotDisplayCompany

  Scenario: create company for other test
    Given openBrowserAndLogin
    When openCompanyPage
    And createCompany
    Then onCompaniesPageDisplayCompany