package team.zmn.repository.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 17:47
 */

@RequestMapping("/home")
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
