package com.fullstack.FullStackCrudOperation.JpaRepository;

import com.fullstack.FullStackCrudOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
