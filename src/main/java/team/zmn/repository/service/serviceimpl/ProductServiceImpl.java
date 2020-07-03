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



    /**
     * 查询所有仓库的所有商品信息
     * @return
     */

    @Override
    public Result selectAll() {
        List<ProductMessageDto> list = product.selectAll();
        for (int i = 0;i<list.size();i++){
            //对同仓库同商品进行汇总处理
            List<Float> floats = product.selectBalance(list.get(i).getP_id(),list.get(i).getRepository_id());
            System.out.println(floats.size());
            float count = 0f;
            for (int j = 0;j<floats.size();j++){
                System.out.println(j);
                count+=floats.get(j);
            }
            list.get(i).setP_balance(String.valueOf(count));
            for (int j = list.size()-1;j>i;j--){
                if (list.get(i).getP_id().equals(list.get(j).getP_id())&&list.get(i).getRepository_id().equals(list.get(j).getRepository_id())){
                    list.remove(j);
                }
            }
        }
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }
}
