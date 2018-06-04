package wrh.learning.hexagonalarchitecture.infrastructure;

import org.springframework.stereotype.Component;
import wrh.learning.hexagonalarchitecture.domain.CustomerRepository;
import wrh.learning.hexagonalarchitecture.domain.model.Customer;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
@Component
public class InMemoryCustomerRepository implements CustomerRepository {

    Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    @Override
    public Customer get(String id) {
        return customerMap.get(id);
    }

    @Override
    public void add(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void update(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void remove(String id) {
        customerMap.remove(id);
    }

    @Override
    public Collection<Customer> all() {
        return Collections.unmodifiableCollection(customerMap.values());
    }

}
