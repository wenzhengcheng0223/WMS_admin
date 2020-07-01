package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.ProductDelivery;

public interface ProductDeliveryMapper {
    int deleteByPrimaryKey(String pDeliveryNo);

    int insert(ProductDelivery record);

    ProductDelivery selectByPrimaryKey(String pDeliveryNo);

    List<ProductDelivery> selectAll();

    int updateByPrimaryKey(ProductDelivery record);
}