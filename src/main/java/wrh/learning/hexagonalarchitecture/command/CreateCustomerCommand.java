package wrh.learning.hexagonalarchitecture.command;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
public class CreateCustomerCommand {

    private String firstName;

    private String lastName;

    public CreateCustomerCommand(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
