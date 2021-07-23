package steps;

import apiEngine.IRestResponse;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.requests.AddBooksRequest;
import pojos.requests.ISBN;
import pojos.requests.RemoveBookRequest;
import pojos.response.Book;
import pojos.response.Books;
import pojos.response.UserAccount;

import static org.assertj.core.api.Assertions.assertThat;

public class BooksSteps extends BaseStep {
    private static final String USER_ID = "49ee17cd-cd6c-4261-adfd-c3b40655fd35";
    private static Response response;
    private static String bookId;
    private static IRestResponse<Books> booksResponse;
    private static IRestResponse<UserAccount> userAccountResponse;

    public BooksSteps(TestContext testContext) {
        super(testContext);
    }

    @Given("A list of books are available")
    public void listOfBooksAreAvailable() {

        booksResponse = getEndPoints( ).getBooks( );
        assertThat(booksResponse.isSuccessful( )).isTrue( );
        Book book = booksResponse.getBody( ).books.get(0);
        getScenarioContext( ).setContext(Context.BOOK, book);
    }

    @When("I add a book to my reading list")
    public void addBookInList() {
        userAccountResponse = getEndPoints( ).addBook(new AddBooksRequest((String) getScenarioContext( ).getContext(Context.USER_ID),
                new ISBN(((Book) getScenarioContext( ).getContext(Context.BOOK)).isbn)));
        getScenarioContext( ).setContext(Context.USER_ACCOUNT_RESPONSE, userAccountResponse);

    }


    @When("I remove a book from my reading list")
    public void removeBookFromList() {

        response = getEndPoints( ).removeBook(new RemoveBookRequest((String) getScenarioContext( ).getContext(Context.USER_ID),
                ((Book) getScenarioContext( ).getContext(Context.BOOK)).isbn));
        getScenarioContext( ).setContext(Context.BOOK_REMOVE_RESPONSE, response);
    }


    @Then("I remove a book existing from my reading list")
    public void removeExistingBookFromList() {
        response = getEndPoints( ).removeBook(new RemoveBookRequest(USER_ID, "9781449325862"));
        System.out.println("I remove a book from my reading list" + response.getStatusCode( ));
    }
}
