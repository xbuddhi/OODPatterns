package Command;

public class AddCusomerCommand implements Command {
    private CustomerService service;

    public void AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
    
}
