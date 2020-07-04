package team.zmn.repository.service;


import team.zmn.repository.pojo.ProductStock;
import team.zmn.repository.pojo.Result;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 11:22
 */

public interface ProductStockService {
    /**
     * 查询所有商品入库订单
     * @return
     */
    Result selectAll();

    int insert(ProductStock stock);

}
