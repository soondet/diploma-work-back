package kz.iitu.bussystem.repository.security;

import java.util.List;
import java.util.Optional;

import kz.iitu.bussystem.entity.security.ERole;
import kz.iitu.bussystem.entity.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

    @Query("SELECT DISTINCT r.name FROM Role r")
    List<String> findAllRoleNames();
}