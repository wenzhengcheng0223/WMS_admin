package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.ProductMessage;
import team.zmn.repository.pojo.ProductMessageDto;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductService;
import team.zmn.repository.service.serviceimpl.ProductServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 9:38
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService = new ProductServiceImpl();

    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll(){
        Result result = productService.selectAll();
        return result;
    }
    @ResponseBody
    @RequestMapping("/del")
    public Object del(ProductMessageDto dto){
        Map<String ,Object> map = new HashMap<>();
        int insert = productService.delete(dto);
        System.out.println(insert);
        if (insert == 1){
            map.put("result","success!");
        }else{
            map.put("result","fail!");
        }
        return map;
    }

}
