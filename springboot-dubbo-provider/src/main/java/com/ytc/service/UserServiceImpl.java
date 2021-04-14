/**
 * Copyright (C), 2015-2021, 云上有限公司
 * FileName: UserServiceImpl
 * Author:   木兮木
 * Date:     2021/4/14 0014 下午 14:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.UserMapper;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 木兮木
 * @create 2021/4/14 0014
 * @since 1.0.0
 */
@Service(version = "1.0", timeout = 600000)
@Component
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective( user );
    }

    @Override
    public User queryUserbyId(Integer id) {
       return userMapper.selectByPrimaryKey( id );
    }

    @Override
    public List <User> queryUserList() {
        List <User> users = userMapper.queryUserList();
        return users;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser( user );
    }

    @Override
    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey( id );
    }
}