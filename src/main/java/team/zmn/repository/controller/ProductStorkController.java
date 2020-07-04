package team.zmn.repository.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.ProductStock;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductStockService;
import team.zmn.repository.service.serviceimpl.ProductStockServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 11:23
 */
@RequestMapping("/productStock")
@Controller
public class ProductStorkController {

    @Autowired
    private ProductStockService stockService = new ProductStockServiceImpl();

    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll(){
        Result result = stockService.selectAll();
        return result;

    }

    @ResponseBody
    @RequestMapping("/add")
    public Object add(ProductStock stock){
        Map<String ,Object> map = new HashMap<>();
        int insert = stockService.insert(stock);
        System.out.println(insert);
        if (insert == 1){
            map.put("result","success!");
        }else{
            map.put("result","fail!");
        }
        return map;

    }
}
