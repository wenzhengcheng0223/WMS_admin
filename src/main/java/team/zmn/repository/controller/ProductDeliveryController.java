package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductDeliveryService;
import team.zmn.repository.service.serviceimpl.ProductDeliveryServiceImpl;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 10:03
 */
@Controller
@RequestMapping("productDelivery")
public class ProductDeliveryController {
    @Autowired
    private ProductDeliveryService productDelivery = new ProductDeliveryServiceImpl();

    @ResponseBody
    @RequestMapping("selectAll")
    public Result selectAll(){
        Result result = productDelivery.selectAll();
        return result;
    }
}
