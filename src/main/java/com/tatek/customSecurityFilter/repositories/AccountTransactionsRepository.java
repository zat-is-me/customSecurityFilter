package com.tatek.customSecurityFilter.repositories;

import com.tatek.customSecurityFilter.entities.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions,Long> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);

}
