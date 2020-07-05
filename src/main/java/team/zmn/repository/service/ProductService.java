package team.zmn.repository.service;

import team.zmn.repository.pojo.ProductMessage;
import team.zmn.repository.pojo.ProductMessageDto;
import team.zmn.repository.pojo.Result;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 16:20
 */

public interface ProductService {
    /**
     * 查询所有商品信息以及仓库现有库存量
     * @return Result
     */
    Result selectAll();

    int delete(ProductMessageDto dto);
}
