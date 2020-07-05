package team.zmn.repository.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.zmn.repository.dao.ProductStockMapper;
import team.zmn.repository.pojo.ProductStock;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductStockService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 11:22
 */
@Service
public class ProductStockServiceImpl implements ProductStockService {
    @Autowired
    private ProductStockMapper mapper;

    @Override
    public Result selectAll() {
        Result result = new Result();
        List<ProductStock> list = mapper.selectAll();
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }

    @Override
    public int insert(ProductStock stock) {
        int inser = mapper.insert(stock);
        return inser;
    }

    @Override
    public int delete(ProductStock stock) {
        int i = mapper.deleteByPrimaryKey(stock.getpStockNo());
        return i;
    }


}
