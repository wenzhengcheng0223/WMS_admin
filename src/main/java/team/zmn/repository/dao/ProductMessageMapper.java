package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.ProductMessage;
import team.zmn.repository.pojo.ProductMessageDto;

public interface ProductMessageMapper {
    int deleteByPrimaryKey(String pId);

    int insert(ProductMessage record);

    ProductMessage selectByPrimaryKey(String pId);

    List<ProductMessageDto> selectAll();

    int updateByPrimaryKey(ProductMessage record);
}