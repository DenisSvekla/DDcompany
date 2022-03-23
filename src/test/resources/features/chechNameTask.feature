Feature: checking for limit values name task field test and popup

  Background:
    Given openTasks
    And createTasks


  Scenario Outline: checking for limit values name task (min value, max)
    Given openTasksForEdit
    When nameTask"<nametask>"
    Then nameTask is "<visibletask>"
    And onTaskPage Successful Message is Displayed
    Examples:
      | nametask                            | visibletask                         |
      | Rar                                 | Rar                                 |
      | checking for limit values name task | checking for limit values name task |

