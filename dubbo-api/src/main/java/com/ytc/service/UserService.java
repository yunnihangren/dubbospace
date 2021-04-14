/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserService
 * Author:   zyl
 * Date:     2021/4/13 9:57
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/4/13
 * @since 1.0.0
 */
public interface UserService {

    List<User> queryUserList();

    void addUser(User user);

   void  delete(Integer id);

    User queryUserbyId(Integer id);

    void update(User user);
}
