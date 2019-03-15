package com.kuiniu.springbootdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kuiniu.springbootdubboapi.api.UserService;
import com.kuiniu.springbootdubboapi.model.User;
import com.kuiniu.springbootdubboapi.vo.resultVo.PageModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @className: UserController
 * @date：2019/3/15 0015 10:01
 * @author: baojize
 * @accountfor：服务消费方controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务。
    //如果用xml配置方式，需要将@Reference换成@Autowired。
    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("/findOneById")
    public User findOneById(Integer id) {
        User oneById = userService.findOneById(id);
        if (oneById == null) {
            System.out.println("id不存在");
        }
        return oneById;
    }
    @ResponseBody
    @RequestMapping("/saveOne")
    public int saveOne(){
        User user = new User();
        int i = userService.insertOne(user);
        return i;
    }
}
