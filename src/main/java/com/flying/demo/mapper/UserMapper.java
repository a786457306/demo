package com.flying.demo.mapper;

import com.flying.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserMapper
 *
 * @author Flying
 * @date: 2017/11/24 12:51
 */
public interface UserMapper {
    public void newUser(@Param("user") User user) throws Exception;

    public void update(@Param("user") User user) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<User> listAll() throws Exception;

    public User queryById(@Param("id") int id) throws Exception;

    public int countByUserNameAndPassword(@Param("userName") String userName,
                                          @Param("password") String password) throws Exception;

}
