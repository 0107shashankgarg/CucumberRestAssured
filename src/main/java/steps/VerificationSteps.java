package steps;

import apiEngine.IRestResponse;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.response.Book;
import pojos.response.UserAccount;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class VerificationSteps extends BaseStep {

    public VerificationSteps(TestContext testContext) {
        super(testContext);
    }

    @Then("The book is added")
    public void bookIsAdded() {
        Book book = (Book) getScenarioContext( ).getContext(Context.BOOK);
        String userId = (String) getScenarioContext( ).getContext(Context.USER_ID);
        IRestResponse<UserAccount> userAccountResponse = (IRestResponse<UserAccount>) getScenarioContext( ).getContext(Context.USER_ACCOUNT_RESPONSE);
        assertThat(userAccountResponse.isSuccessful( )).isTrue( );
        //  assertThat(userAccountResponse.getBody().userId).isEqualTo(userId);
        assertThat(book.isbn).isEqualTo(userAccountResponse.getBody( ).books.get(0).isbn);


    }


    @Then("The book is removed")
    public void bookIsRemoved() {
        String userId = (String) getScenarioContext( ).getContext(Context.USER_ID);
        Response response = (Response) getScenarioContext( ).getContext(Context.BOOK_REMOVE_RESPONSE);
        assertThat(response.statusCode( )).isEqualTo(204);
        IRestResponse<UserAccount> userAccountResponse = getEndPoints( ).getUserAccount(userId);
        assertThat(userAccountResponse.isSuccessful( )).isTrue( );
        assertThat(userAccountResponse.getBody( ).books).hasSize(0);
    }

}