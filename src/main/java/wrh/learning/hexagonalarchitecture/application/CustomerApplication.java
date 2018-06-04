package wrh.learning.hexagonalarchitecture.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wrh.learning.hexagonalarchitecture.command.CreateCustomerCommand;
import wrh.learning.hexagonalarchitecture.domain.CustomerRepository;
import wrh.learning.hexagonalarchitecture.domain.model.Customer;

import java.util.Collection;
import java.util.UUID;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
@Component
public class CustomerApplication {

    private CustomerRepository repository;

    @Autowired
    public CustomerApplication(CustomerRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCustomerCommand command) {
        Customer customer = new Customer(UUID.randomUUID().toString(),
                command.getFirstName(),
                command.getLastName());
        repository.add(customer);
    }

    public Object fetch(String id) {
        return repository.get(id);
    }

    public void changeFirstName(String id, String firstName) {
        Customer customer = repository.get(id);
        assert customer != null;
        customer.changeFirstName(firstName);
        repository.update(customer);
    }

    public void remove(String id) {
        repository.remove(id);
    }

    public Collection<?> all() {
        return repository.all();
    }

}
