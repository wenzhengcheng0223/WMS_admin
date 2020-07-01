package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.ProductStock;

public interface ProductStockMapper {
    int deleteByPrimaryKey(String pStockNo);

    int insert(ProductStock record);

    ProductStock selectByPrimaryKey(String pStockNo);

    List<ProductStock> selectAll();

    int updateByPrimaryKey(ProductStock record);
}