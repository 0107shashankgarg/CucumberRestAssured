/*

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BasicEnd2EndStep {


    private static final String USER_ID = "49ee17cd-cd6c-4261-adfd-c3b40655fd35";
    private static final String USERNAME = "shashank-test";


    private static final String PASSWORD = "Test@@123";
    private static final String BASE_URL = "https://bookstore.toolsqa.com";

    private static String token;
    private static Response response;
    private static String jsonString;
    private static String bookId;

    @Given("I am an authorized user")
    public void iAmAnAuthorizedUser() {
        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("Content-Type", "application/json")
                .body("{ \"userName\":\"" + USERNAME + "\", \"password\":\"" + PASSWORD + "\"}")
                .when( ).post("/Account/v1/GenerateToken");
        String jsonString = response.asString( );
        token = JsonPath.from(jsonString).get("token").toString( );
        System.out.println(token);

    }

    @Given("A list of books are available")
    public void listOfBooksAreAvailable() {
        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("accept", "application/json")
                .get("/BookStore/v1/Books");
        String jsonString = response.asString( );
        List<Map<String, String>> books = JsonPath.from(jsonString).get("books");

        Map<String, String> book = books.stream( )
                .filter(b -> b.get("isbn").equals("9781449325862"))
                .findFirst( ).get();
        bookId = book.get("isbn");
        System.out.println(bookId );

    }

    @When("I add a book to my reading list")
    public void addBookInList() {



*/
/*      RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");

        response = request.body("{ \"userId\": \"" + USER_ID + "\", " +
                "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}")
                .post("/BookStore/v1/Books");*//*



        RestAssured.baseURI = BASE_URL;
        response = RestAssured.given( )
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=")
                .body("{ \"userId\": \"" + USER_ID + "\", " +
                        "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}").post("/BookStore/v1/Books");
        System.out.println(response.getStatusCode( ));
    }

        @Then("The book is added")
        public void bookIsAdded() {
            assertThat(response.getStatusCode()).isEqualTo(201);
        }
    @When("I remove a book from my reading list")
    public void removeBookFromList() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.given( )
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=")
                .body("{ \"isbn\": \"" + bookId + "\", " + "\"userId\":\"" +USER_ID +"\"}")
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




    }

    }




*/
