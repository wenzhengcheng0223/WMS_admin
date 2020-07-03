package team.zmn.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductStockService;
import team.zmn.repository.service.serviceimpl.ProductStockServiceImpl;

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
}
