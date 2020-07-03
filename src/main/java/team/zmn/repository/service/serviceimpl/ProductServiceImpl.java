package team.zmn.repository.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import team.zmn.repository.dao.ProductMessageMapper;
import team.zmn.repository.pojo.ProductMessage;
import team.zmn.repository.pojo.ProductMessageDto;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 9:40
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMessageMapper product;
    private Result result = new Result();


    @Override
    public Result selectAll() {
        List<ProductMessageDto> list = product.selectAll();
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }
}
