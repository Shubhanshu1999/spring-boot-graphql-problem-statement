package org.publicissapient.accountsservice.repository;

import org.publicissapient.accountsservice.enitity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

}
