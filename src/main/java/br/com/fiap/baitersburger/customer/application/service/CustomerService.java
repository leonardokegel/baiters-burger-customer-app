package br.com.fiap.baitersburger.customer.application.service;

import br.com.fiap.baitersburger.customer.domain.model.Customer;
import br.com.fiap.baitersburger.customer.domain.port.in.GetCustomerByCpfUserCase;
import br.com.fiap.baitersburger.customer.domain.port.in.InsertCustomerUseCase;
import br.com.fiap.baitersburger.customer.domain.port.out.CustomerRepositoryPort;

import java.util.Optional;

public class CustomerService implements InsertCustomerUseCase, GetCustomerByCpfUserCase {

    private final CustomerRepositoryPort customerRepositoryPort;

    public CustomerService(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public void insert(Customer customer) {
        customerRepositoryPort.insert(customer);
    }

    @Override
    public Optional<Customer> findByCpf(String cpf) {
        return customerRepositoryPort.findByCpf(cpf);
    }
}
