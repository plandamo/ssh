package com.main.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liujinshan
 * @ClassName: LoginController
 * @Description:
 * @date 2018/4/10 15:59
 */
@Controller
public class LoginController {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String login()
    {
        return "index";
    }
}
