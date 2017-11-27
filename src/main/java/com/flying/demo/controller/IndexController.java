package com.flying.demo.controller;

import com.flying.demo.entity.User;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * IndexController
 *
 * @author Flying
 * @date: 2017/11/24 15:06
 */

@Controller
@RequestMapping(value = "")
public class IndexController {

//    @Resource
//    private UserService userService;
    /**
     * 去登录页
     *
     * @return
     */
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String toIndex(){
        return "login";
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "login" , method = RequestMethod.POST)
    public String login(User user, Model model){
        try{
            if (user.getUserName().equals("admin") &&
                    user.getPassword().equals("123456")){
                model.addAttribute("userName", user.getUserName());
                return "index";
            } else {
                return "login";
            }

        } catch (Exception e){
            return "login";
        }
    }

   // @RequestMapping(value = "toList", method = RequestMethod.GET)
   //  public JSON toList(){
    // }
}
