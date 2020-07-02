package team.zmn.repository.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


    @ResponseBody
    @RequestMapping("/selectAll")
    public void selectAll(){

    }
}
