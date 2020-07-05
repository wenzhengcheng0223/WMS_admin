package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.ProductDelivery;
import team.zmn.repository.pojo.ProductStock;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductDeliveryService;
import team.zmn.repository.service.serviceimpl.ProductDeliveryServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 10:03
 */
@Controller
@RequestMapping("/productDelivery")
public class ProductDeliveryController {
    @Autowired
    private ProductDeliveryService productDelivery = new ProductDeliveryServiceImpl();

    @ResponseBody
    @RequestMapping("/selectAll")
    public Result selectAll(){
        Result result = productDelivery.selectAll();
        return result;
    }

    @ResponseBody
    @RequestMapping("/delivery")
    public Object delivery(ProductDelivery delivery){
        Map<String ,Object> map = new HashMap<>();
        int insert = productDelivery.insert(delivery);
        System.out.println(insert);
        if (insert == 1){
            map.put("result","success!");
        }else{
            map.put("result","fail!");
        }
        return map;

    }

    @ResponseBody
    @RequestMapping("/del")
    public Object del(ProductDelivery delivery){
        Map<String ,Object> map = new HashMap<>();
        int insert = productDelivery.delete(delivery);
        System.out.println(insert);
        if (insert == 1){
            map.put("result","success!");
        }else{
            map.put("result","fail!");
        }
        return map;
    }
}
