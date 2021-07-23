Feature: E2E teest for toolsQA Book Store API
  Description: cover happy flow
  Swagger: https://bookstore.toolsqa.com/swagger/index.html


  Background: User generates token for Authorisation
    Given I am an authorized user
    Then I remove a book existing from my reading list

  Scenario: the Authorized user can Add and Remove a book.
    Given A list of books are available
    When I add a book to my reading list
    Then The book is added
    When I remove a book from my reading list
    Then The book is removed