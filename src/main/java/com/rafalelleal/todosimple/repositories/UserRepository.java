package com.rafalelleal.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafalelleal.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
