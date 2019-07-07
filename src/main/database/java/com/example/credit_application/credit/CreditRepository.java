package com.example.credit_application.credit;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {

        Credit findById(int id);

        @Override
        List<Credit> findAll();
}
