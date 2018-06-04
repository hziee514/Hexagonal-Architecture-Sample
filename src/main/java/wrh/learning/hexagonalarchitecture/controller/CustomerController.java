package wrh.learning.hexagonalarchitecture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wrh.learning.hexagonalarchitecture.application.CustomerApplication;
import wrh.learning.hexagonalarchitecture.command.CreateCustomerCommand;

/**
 * @author bruce.wu
 * @date 2018/6/4
 */
@RestController
public class CustomerController {

    private CustomerApplication application;

    @Autowired
    public CustomerController(CustomerApplication application) {
        this.application = application;
    }

    @PostMapping("/customer")
    public ResponseEntity<Object> create(@RequestParam String firstName,
                                         @RequestParam String lastName) {
        application.create(new CreateCustomerCommand(firstName, lastName));
        return ResponseEntity.ok(null);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Object> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(application.fetch(id));
    }

    @PatchMapping("/customer/{id}")
    public ResponseEntity<Object> changeFirstName(@PathVariable("id") String id,
                                                  @RequestParam String firstName) {
        application.changeFirstName(id, firstName);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Object> remove(@PathVariable("id") String id) {
        application.remove(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/customers")
    public ResponseEntity<Object> all() {
        return ResponseEntity.ok(application.all());
    }

}
