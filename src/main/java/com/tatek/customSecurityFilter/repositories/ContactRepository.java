package com.tatek.customSecurityFilter.repositories;

import com.tatek.customSecurityFilter.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
