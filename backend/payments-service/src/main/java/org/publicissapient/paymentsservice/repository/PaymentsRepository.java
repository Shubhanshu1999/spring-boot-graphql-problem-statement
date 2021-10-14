package org.publicissapient.paymentsservice.repository;

import org.publicissapient.paymentsservice.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<Payments, Integer> {

}
