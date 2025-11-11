package br.com.fiap.baitersburger.customer.domain.port.out;

import br.com.fiap.baitersburger.customer.domain.model.Customer;

public interface CustomerRepositoryPort {

    void insert(Customer customer);

}
