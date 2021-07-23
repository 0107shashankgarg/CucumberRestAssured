package steps;

public class TestLayerEnd2EndTest {
/*
    private static final String USER_ID = "49ee17cd-cd6c-4261-adfd-c3b40655fd35";
    private final String BaseUrl = "https://bookstore.toolsqa.com";
    private static String token;
    private static Response response;
    private static String bookId;
    private static IRestResponse<Token> tokenResponse;
    private static IRestResponse<Books> booksResponse;
    private static IRestResponse<UserAccount> userAccountResponse;
    private static Books book;
    private EndPoints endPoints;



    @Given("I am an authorized user")
    public void iAmAnAuthorizedUser() {
endPoints = new EndPoints(BaseUrl);
               endPoints.authenticateUser(new AuthorizationRequest("shashank-test","Test@@123"));
    }

    @Given("A list of books are available")
    public void listOfBooksAreAvailable() {

       booksResponse =  endPoints.getBooks();
        assertThat(booksResponse.isSuccessful()).isTrue();
        bookId=  booksResponse.getBody().books.stream( )
                .filter(b -> b.isbn.equals("9781449325862"))
                .findFirst( ).get( ).isbn;


    }

    @When("I add a book to my reading list")
    public void addBookInList() {

        userAccountResponse = endPoints.addBook(new AddBooksRequest(USER_ID , new ISBN(bookId)));

    }

    @Then("The book is added")
    public void bookIsAdded() {
        assertThat(booksResponse.isSuccessful()).isTrue();;
    }

    @When("I remove a book from my reading list")
    public void removeBookFromList() {
        response = endPoints.removeBook(new RemoveBookRequest(USER_ID, bookId));
        System.out.println("I remove a book from my reading list" + response.getStatusCode());
    }

    @Then("The book is removed")
    public void bookIsRemoved() {

        userAccountResponse=  endPoints.getUserAccount(USER_ID);
assertThat(userAccountResponse.isSuccessful()).isTrue();
        assertThat(userAccountResponse.getBody().books).hasSize(0);

    }

    @Then("I remove a book existing from my reading list")
    public void removeExistingBookFromList() {
        response = endPoints.removeBook(new RemoveBookRequest(USER_ID, "9781449325862"));
        System.out.println("I remove a book from my reading list" + response.getStatusCode());
    }*/
}
