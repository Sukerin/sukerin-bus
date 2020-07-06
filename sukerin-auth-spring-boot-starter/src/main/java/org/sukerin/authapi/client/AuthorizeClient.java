package org.sukerin.authapi.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.sukerin.sukerin.common.RoleWrapper;


/**
 * @author dr
 */
public interface AuthorizeClient {
    @GetMapping("/auth/role/{id}")
    RoleWrapper queryRoleById(@PathVariable Integer id);

}
