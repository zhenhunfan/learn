package com.zhenhunfan.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/res1").hasRole("role1")
                .antMatchers("/res2").hasRole("role2");

        //开启自动配置的登录功能
        //1、/login来到登录页，如果没有权限就重定向到登录页
        //2、重定向到/login?error表示登录失败
        //3、更多详细规则
        http.formLogin();

        //开启自动配置的注销功能
        //1、相当于访问/logout 用户注销、清空session
        //2、注销成功会默认返回/login?logout
        http.logout();

        //开启记住我功能
        //
        http.rememberMe();
    }

    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("zhangsan").password(new BCryptPasswordEncoder().encode("123")).roles("role1")
                .and()
                .passwordEncoder(new BCryptPasswordEncoder()).withUser("lisi").password(new BCryptPasswordEncoder().encode("123")).roles("role2");

    }
}
