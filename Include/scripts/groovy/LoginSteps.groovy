import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



















public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println "I'm inside given"
	}

	@When ("user enters <username> and <password>")
	public void user_enters_username_and_password() {
		println "I'm inside when"
	}
	@And("Clicks ob login button")
	public void clicks_on_login_button() {
		println "I'm inside and"
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		println "I'm inside then"
	}
}
