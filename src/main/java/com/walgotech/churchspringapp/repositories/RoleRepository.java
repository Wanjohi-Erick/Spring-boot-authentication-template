package com.walgotech.churchspringapp.repositories;

import com.walgotech.churchspringapp.models.ERole;
import com.walgotech.churchspringapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}