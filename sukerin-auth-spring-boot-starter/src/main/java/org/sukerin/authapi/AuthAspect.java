package org.sukerin.authapi;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.sukerin.authapi.client.AuthorizeClient;

import javax.annotation.Resource;

/**
 * @author dr
 */
@Aspect
@Slf4j
public class AuthAspect {
    @Resource
    private AuthorizeClient authorizeClient;

    @Before("@annotation(org.sukerin.authapi.Authorize)")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Authorize annotation = methodSignature.getMethod().getAnnotation(Authorize.class);
        String[] values = annotation.value();
//        authorizeClient.queryRoleById(1);
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        log.info(String.valueOf(attributes));
    }
}
