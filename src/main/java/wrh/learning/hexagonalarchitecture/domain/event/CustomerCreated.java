package wrh.learning.hexagonalarchitecture.domain.event;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
public class CustomerCreated {

    private String id;

    private String firstName;

    private String lastName;

    public CustomerCreated(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
