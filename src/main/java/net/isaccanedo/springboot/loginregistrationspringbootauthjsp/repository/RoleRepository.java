package net.isaccanedo.springboot.loginregistrationspringbootauthjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.isaccanedo.springboot.loginregistrationspringbootauthjsp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
