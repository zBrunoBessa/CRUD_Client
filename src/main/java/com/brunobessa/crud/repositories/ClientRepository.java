package com.brunobessa.crud.repositories;

import com.brunobessa.crud.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
