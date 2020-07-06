package org.sukerin.sukerinapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sukerin.authapi.Authorize;
import org.sukerin.authapi.client.AuthorizeClient;

import javax.annotation.Resource;

/**
 * @author dr
 */
@RestController
public class TestController {
    @Resource
    private AuthorizeClient authorizeClient;

    @Authorize
    @GetMapping("/role/{id}")
    public Object test(@PathVariable Integer id){
        return authorizeClient.queryRoleById(id);

    }
}
