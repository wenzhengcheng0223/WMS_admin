package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.RepositoryMessageService;
import team.zmn.repository.service.serviceimpl.RepositoryMessageServiceImpl;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 12:00
 */
@Controller
@RequestMapping("/repositoryMessage")
public class RepositoryMessageController {
    @Autowired
    private RepositoryMessageService messageService = new RepositoryMessageServiceImpl();

    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll(){
        Result result = messageService.selectAll();

        return result;
    }
}
