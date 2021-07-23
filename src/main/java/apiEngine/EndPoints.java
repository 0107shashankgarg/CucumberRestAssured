package apiEngine;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import pojos.requests.AddBooksRequest;
import pojos.requests.AuthorizationRequest;
import pojos.requests.RemoveBookRequest;
import pojos.response.Books;
import pojos.response.UserAccount;

public class EndPoints {

    private final RequestSpecification request;

    public EndPoints(String baseURL) {
        RestAssured.baseURI = baseURL;
        request = RestAssured.given( ).header("Content-Type", "application/json");
    }

    public void authenticateUser(AuthorizationRequest authRequest) {
        Response response = request.body(authRequest).post(Route.generateToken( ));
        if ( response.statusCode( ) != HttpStatus.SC_OK )
            throw new RuntimeException("Authentication Failed. Content of failed Response: " + response + " , Status Code : " + response
                    .statusCode( ));
        request.header("Authorization", "Basic c2hhc2hhbmstdGVzdDpUZXN0QEAxMjM=");
    }

    public IRestResponse getBooks() {
        Response response = request.get(Route.books( ));
        return new RestResponse(Books.class, response);
    }

    public IRestResponse addBook(AddBooksRequest addBooksRequest) {
        Response response = request
                .body(addBooksRequest).post(Route.books( ));
        return new RestResponse(UserAccount.class, response);
    }

    public Response removeBook(RemoveBookRequest removeBookRequest) {

        Response response = request
                .body(removeBookRequest)
                .delete(Route.book( ));
        return response;
    }

    public IRestResponse getUserAccount(String userId) {


        Response response = request
                .get(Route.userAccount(userId));
        return new RestResponse(UserAccount.class, response);
    }


}
