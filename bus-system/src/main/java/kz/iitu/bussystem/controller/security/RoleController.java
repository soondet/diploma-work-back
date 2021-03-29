package kz.iitu.bussystem.controller.security;

import kz.iitu.bussystem.entity.security.Role;
import kz.iitu.bussystem.repository.security.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @GetMapping("/names")
    public List<String> getRoleNames() {
        return roleRepository.findAllRoleNames();
    }


}
