package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.server.mapper.TbUserMapper;
import com.funtl.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUserName(String username) {
        Example example = new Example(TbUser.class);

        example.createCriteria().andEqualTo("username",username);

        return tbUserMapper.selectOneByExample(example);
    }
}
