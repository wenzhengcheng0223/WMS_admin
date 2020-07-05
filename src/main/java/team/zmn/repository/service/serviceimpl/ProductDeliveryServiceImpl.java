package team.zmn.repository.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.zmn.repository.dao.ProductDeliveryMapper;
import team.zmn.repository.pojo.ProductDelivery;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.ProductDeliveryService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 10:01
 */
@Service
public class ProductDeliveryServiceImpl implements ProductDeliveryService {

    @Autowired
    private ProductDeliveryMapper deliveryMapper;
    private Result result = new Result();
    List<ProductDelivery> list;
    @Override
    public Result selectAll() {
       list = deliveryMapper.selectAll();
        for (ProductDelivery delivery : list){
            System.out.println(delivery.getpDeliveryDate());
        }
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }

    @Override
    public int insert(ProductDelivery delivery) {
        int insert = deliveryMapper.insert(delivery);
        return insert;

    }

    @Override
    public int delete(ProductDelivery delivery) {
        int i = deliveryMapper.deleteByPrimaryKey(delivery.getpDeliveryNo());
        return i;

    }

}
