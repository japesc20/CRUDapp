package com.CRUDapp.FullstackBackend.repository;

import com.CRUDapp.FullstackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {

}
