package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {


    @Given("The application is up")
    public void applicationIsUp() {
        System.out.println("The application is up");


    }

    @Given("Data tables are used")
    public void data_tables_are_used(DataTable dataTable) {

        System.out.println(dataTable);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }


    @Given("The application is up with parma {string} and {string}")
    public void applicationIsUpWithParam(String parma1, String parma2) {
        System.out.println("The application is up fir param : " + parma1);
        System.out.println("The application is up fir param : " + parma2);


    }

    @When("User LogOut from the Application")
    public void logout() {
        System.out.println("User LogOut from the Application");


    }

    @Then("Message displayed LogOut Successfully")
    public void message_displayed_log_out_successfully() {
        System.out.println("Message displayed LogOut Successfully");

    }
}
