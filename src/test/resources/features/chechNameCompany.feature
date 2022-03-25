Feature: checking for limit values name task field test and popup

  Background:
    Given openBrowserAndLogin

  Scenario Outline: checking for limit values name Company (min value, max)
    When open company and change name Company "<namecompany>"
    Then nameCompany is "<visiblecompany>"
    And onTaskPage Successful Message is Displayed
    Examples:
      | namecompany                         | visiblecompany                      |
      | Rar                                 | Rar                                 |
      | checking for limit values name task | checking for limit values name task |

