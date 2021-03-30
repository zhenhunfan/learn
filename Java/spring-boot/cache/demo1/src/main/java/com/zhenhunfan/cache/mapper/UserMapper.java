package com.zhenhunfan.cache.mapper;

import com.zhenhunfan.cache.bean.User;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
@Mapper
public interface UserMapper {

    @Select("select * from bt_user where user_id = #{id}")
    public User getUser(Integer id);

    @Delete("delete from bt_user where user_id = #{id}")
    public int deleteUser(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "user_id")
    @Insert("insert into bt_user(username) values(#{userName})")
    public int insertUser(User user);

    @Update("update bt_user set username=#{userName} where user_id=#{user_id}")
    public int updateUser(User user);
}
