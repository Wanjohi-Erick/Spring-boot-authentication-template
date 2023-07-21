package com.walgotech.spring_auth_template.repositories;

import com.walgotech.spring_auth_template.models.ERole;
import com.walgotech.spring_auth_template.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}