Feature: Job Search

  As a user I want to verify Job Search Result


  Scenario Outline: User should do Job Search successfully
    Given : I am on Home Page
    When I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And click on 'Find Jobs' button
#    Then I see the Results

    Examples:

    |jobTitle |   location  | distance | salaryMin | salaryMax |  salaryType  | jobType |
    |Tester   | Harrow, Greater London     | 10 miles | 30000     |  500000   |  Per annum   | Permanent |
    |Artist   | London     | 7 miles  | 40000     |  50000    |  Per annum   | Permanent |
    |Lecturer | Oxfordshire      | 2 miles  | 40000     |  70000    | Per annum    | Permanent |
    |Peoples Partner | Kent | 15 miles | 30000     |  50000    | Per annum    | Permanent |
    |Receptionist    | Hammersmith, Greater London  | 10 miles |  30000 | 500000 | Per annum  | Permanent |
    |Teacher         | Wembley, Greater London      | 5 miles  | 20000  | 30000  | Per annum  | Permanent |



