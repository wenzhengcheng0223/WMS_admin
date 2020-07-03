package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.pojo.User;
import team.zmn.repository.service.UserService;
import team.zmn.repository.service.serviceimpl.UserServiceImpl;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * @version: 1.0
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 14:17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll(){
        Result result = userService.selectAll();
        return result;
    }
}
