package br.com.fiap.baitersburger.customer.infrastructure.persistence.repository;

import br.com.fiap.baitersburger.customer.infrastructure.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
