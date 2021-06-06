package com.marketcharting.loginservice.repository;

import com.marketcharting.loginservice.model.ERole;
import com.marketcharting.loginservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
