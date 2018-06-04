package wrh.learning.hexagonalarchitecture.domain;

import wrh.learning.hexagonalarchitecture.domain.model.Customer;

import java.util.Collection;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
public interface CustomerRepository {

    Customer get(String id);

    void add(Customer customer);

    void update(Customer customer);

    void remove(String id);

    Collection<Customer> all();

}
