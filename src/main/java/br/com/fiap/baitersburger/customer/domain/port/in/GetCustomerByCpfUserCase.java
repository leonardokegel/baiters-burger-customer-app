package br.com.fiap.baitersburger.customer.domain.port.in;

import br.com.fiap.baitersburger.customer.domain.model.Customer;

import java.util.Optional;

public interface GetCustomerByCpfUserCase {
    Optional<Customer> findByCpf(String cpf);
}
