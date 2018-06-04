package wrh.learning.hexagonalarchitecture.domain.model;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
public class Customer {

    private String id;

    private String firstName;

    private String lastName;

    protected Customer() {

    }

    public Customer(String id, String firstName, String lastName) {
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

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

}
