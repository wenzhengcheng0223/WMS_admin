package team.zmn.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import team.zmn.repository.pojo.ProductMessage;
import team.zmn.repository.pojo.ProductMessageDto;

public interface ProductMessageMapper {
    int deleteByPrimaryKey(String pId);

    int insert(ProductMessage record);

    ProductMessage selectByPrimaryKey(String pId);

    List<ProductMessageDto> selectAll();

    int updateByPrimaryKey(ProductMessage record);

    List<Float> selectBalance(@Param("p_id") String p_id,@Param("repository_id") String repository_id);
}