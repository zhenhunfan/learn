package com.funtl.oauth2.server.config.service;

import com.funtl.oauth2.server.domain.TbPermission;
import com.funtl.oauth2.server.domain.TbUser;
import com.funtl.oauth2.server.service.TbPermissionService;
import com.funtl.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private TbUserService userService;

    @Autowired
    private TbPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        TbUser user = userService.getByUserName(username);

        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();

        if(user!=null){
            List<TbPermission> tbPermissions = permissionService.selectByUserId(user.getId());

            tbPermissions.forEach(tbPermission -> {
                grantedAuthorities.add(new SimpleGrantedAuthority(tbPermission.getEnname()));
            });
        }

        return new User(user.getUsername(),user.getPassword(),grantedAuthorities);
    }
}
