package br.com.fiap.baitersburger.customer.infrastructure.persistence.adapter;

import br.com.fiap.baitersburger.customer.domain.model.Customer;
import br.com.fiap.baitersburger.customer.domain.port.out.CustomerRepositoryPort;
import br.com.fiap.baitersburger.customer.infrastructure.mapper.CustomerEntityMapper;
import br.com.fiap.baitersburger.customer.infrastructure.persistence.repository.CustomerJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerJpaRepository customerJpaRepository;
    private final CustomerEntityMapper customerEntityMapper;

    public CustomerRepositoryAdapter(CustomerJpaRepository customerJpaRepository, CustomerEntityMapper customerEntityMapper) {
        this.customerJpaRepository = customerJpaRepository;
        this.customerEntityMapper = customerEntityMapper;
    }

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerJpaRepository.save(customerEntity);
    }
}
