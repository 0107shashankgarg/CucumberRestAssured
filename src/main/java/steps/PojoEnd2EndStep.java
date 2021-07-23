package steps;

public class PojoEnd2EndStep {

   /*private static final String USER_ID = "49ee17cd-cd6c-4261-adfd-c3b40655fd35";
    private static final String USERNAME = "shashank-test";


    private static final String PASSWORD = "Test@@123";
    private static final String BASE_URL = "https://bookstore.toolsqa.com";

    private static String token;
    private static Response response;
    private static String jsonString;
    private static String bookId;

    private static Token tokenResponse;
    private static Book book;

    @Given("I am an authorized user")
    public void iAmAnAuthorizedUser() {


        AuthorizationRequest authRequest = new AuthorizationRequest("TOOLSQA-Test","Test@@123");

        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("Content-Type", "application/json")
                .body(authRequest).log().all()
                .when( ).post("/Account/v1/GenerateToken");
       // String jsonString = response.asString( );
        tokenResponse = response.getBody().as(Token.class);

        System.out.println(tokenResponse.token);




    }

    @Given("A list of books are available")
    public void listOfBooksAreAvailable() {

        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("accept", "application/json")
                .get("/BookStore/v1/Books");
        Books books = response.getBody().as(Books.class);
        book = books.books.stream( )
                .filter(b -> b.isbn.equals("9781449325862"))
                .findFirst( ).get();
        bookId = book.isbn;
        System.out.println(bookId );

    }

    @When("I add a book to my reading list")
    public void addBookInList() {



        AddBooksRequest addBooksRequest = new AddBooksRequest(USER_ID , new ISBN(bookId));

        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=")
                .body(addBooksRequest).log().all().post("/BookStore/v1/Books");
            System.out.println(response.getStatusCode( ));
    }

    @Then("The book is added")
    public void bookIsAdded() {
        assertThat(response.getStatusCode()).isEqualTo(201);
    }
    @When("I remove a book from my reading list")
    public void removeBookFromList() {
        RemoveBookRequest removeBookRequest = new RemoveBookRequest(USER_ID, bookId);
        RestAssured.baseURI = BASE_URL;
        RestAssured.given( )
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=")
                .body(removeBookRequest)
                .delete("/BookStore/v1/Book");
        System.out.println(response.getStatusCode());
    }

    @Then("The book is removed")
    public void bookIsRemoved() {
        assertThat(response.getStatusCode()).isEqualTo(201);
        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=")
                .get("/Account/v1/User/" + USER_ID);
        assertThat(response.getStatusCode()).isEqualTo(200);
        String jsonString = response.asString();
        List<Map<String, String>> books =  JsonPath.from(jsonString).get("books");
        assertThat(books).hasSize(0);





}*/

}
