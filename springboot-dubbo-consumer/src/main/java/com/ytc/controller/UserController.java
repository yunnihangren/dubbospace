/**
 * Copyright (C), 2015-2021, 云上有限公司
 * FileName: UserController
 * Author:   木兮木
 * Date:     2021/4/14 0014 下午 14:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 木兮木
 * @create 2021/4/14 0014
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Reference(version = "1.0", timeout = 600000,check = false)
    private UserService userService;

   @RequestMapping("queryAll")
    public String queryAll(Model model){
       List <User> users = userService.queryUserList();
       model.addAttribute( "user",users );
       return  "showUser";

   }
   /**
    *  @描述功能:<  添加用户>
    *  @author:木兮木
    *  @Date: 2021/4/14 0014 下午 15:21
    *  @Param: [model]
    *  @Return: java.lang.String
    *
    *  快速添加返回值 refactor-->Extract--->Variable
    *   增强for循环   iter
    */
    @RequestMapping("toAddUser")
    public String toAddUser(){

        return  "addUser";

    }
    /**
     *  @描述功能:<  新增用户>
     *  @author:木兮木
     *  @Date: 2021/4/14 0014 下午 16:16
     *  @Param: []
     *  @Return: java.lang.String
     *
     *  快速添加返回值 refactor-->Extract--->Variable
     *   增强for循环   iter
     */

    @RequestMapping("addUser")
    public @ResponseBody  void addUser(User user){
         userService.addUser( user );

    }
    /**
     *  @描述功能:<  删除单个 >
     *  @author:木兮木
     *  @Date: 2021/4/14 0014 下午 17:14
     *  @Param: [id]
     *  @Return: java.lang.String
     *
     *  快速添加返回值 refactor-->Extract--->Variable
     *   增强for循环   iter
     */
    @RequestMapping("del")
    public  String  del(Integer id){
         userService.delete(id);
        return "redirect:queryAll";
    }


    @RequestMapping("toupdate")
    public  String  toupdate(Integer id,Model model){
     User user = userService.queryUserbyId(id);
     model.addAttribute( "user",user );
        return "update";
    }





    @RequestMapping("update")
    public @ResponseBody  void update(User user){
        userService.update(user);

    }
}