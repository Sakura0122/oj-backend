package com.yupi.oj.config;

import cn.hutool.core.collection.CollUtil;
import com.yupi.oj.aop.LoginInterceptor;
import com.yupi.oj.utils.JwtUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;

@Configuration
@EnableConfigurationProperties(AuthConfig.class)
public class MvcConfig implements WebMvcConfigurer {

    @Resource
    private JwtUtils jwtUtils;
    @Resource
    private AuthConfig authProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 1.添加拦截器
        LoginInterceptor loginInterceptor = new LoginInterceptor(jwtUtils);
        InterceptorRegistration registration = registry.addInterceptor(loginInterceptor);
        // 2.配置拦截路径
        List<String> includePaths = authProperties.getIncludePaths();
        if (CollUtil.isNotEmpty(includePaths)) {
            registration.addPathPatterns(includePaths);
        }
        // 3.配置放行路径
        List<String> excludePaths = authProperties.getExcludePaths();
        if (CollUtil.isNotEmpty(excludePaths)) {
            registration.excludePathPatterns(excludePaths);
        }
        registration.excludePathPatterns(
                "/error",
                "/favicon.ico",
                "/v2/**",
                "/v3/**",
                "/swagger-resources/**",
                "/webjars/**",
                "/doc.html"
        );

    }
}
