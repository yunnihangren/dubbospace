/**
 * Copyright (C), 2015-2021, 云上有限公司
 * FileName: FileController
 * Author:   木兮木
 * Date:     2021/4/14 0014 下午 15:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 木兮木
 * @create 2021/4/14 0014
 * @since 1.0.0
 */
@Controller
public class FileController {


    @RequestMapping("upload")
    public @ResponseBody Map <String,String> upload(MultipartFile img,HttpServletRequest request){
        String fileUpload = FileUtil.FileUpload( img , request );
        Map <String,String> map = new HashMap<>( 25 );
        map.put( "img",fileUpload );

        return  map;

    }



}