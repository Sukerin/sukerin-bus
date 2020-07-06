package org.sukerin.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sukerin.auth.service.RoleService;
import org.sukerin.sukerin.common.RoleWrapper;

import javax.annotation.Resource;

/**
 * @author dr
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private RoleService roleService;

    @GetMapping("/role/{id}")
    public RoleWrapper queryRoleById(@PathVariable Integer id){
        RoleWrapper roleWrapper=new RoleWrapper();
        roleWrapper.setRole(roleService.getById(id));
        return roleWrapper;
    }
}
