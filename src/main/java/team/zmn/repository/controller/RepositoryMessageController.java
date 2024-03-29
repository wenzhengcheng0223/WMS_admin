package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.RepositoryMessageDto;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.pojo.UserDto;
import team.zmn.repository.service.RepositoryMessageService;
import team.zmn.repository.service.serviceimpl.RepositoryMessageServiceImpl;

import java.util.HashMap;
import java.util.Map;

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
    @ResponseBody
    @RequestMapping("/del")
    public Object del(RepositoryMessageDto dto){
        Map<String,Object> map = new HashMap<>();
        int insert = messageService.delete(dto);
        System.out.println(insert);
        if (insert == 1){
            map.put("result","success!");
        }else{
            map.put("result","fail!");
        }
        return map;
    }
}
