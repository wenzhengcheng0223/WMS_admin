package team.zmn.repository.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.zmn.repository.dao.RepositoryMessageMapper;
import team.zmn.repository.pojo.RepositoryMessageDto;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.service.RepositoryMessageService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 11:59
 */
@Service
public class RepositoryMessageServiceImpl implements RepositoryMessageService {
    @Autowired
    private RepositoryMessageMapper messageMapper;
    @Override
    public Result selectAll() {
        List<RepositoryMessageDto> list = messageMapper.selectAll();
        for (int i = 0;i<list.size();i++){
            List<Float> floats = messageMapper.selectBalance(list.get(i).getP_id(),list.get(i).getRepository_id());
            float count = 0f;
            for (int j = 0;j < floats.size();j++){
                count+=floats.get(j);
            }
            list.get(i).setP_balance(count);
            for (int j = list.size()-1; j>i;j--){
                if (list.get(i).getP_id().equals(list.get(j).getP_id())&&list.get(i).getRepository_id().equals(list.get(j).getRepository_id())){
                    list.remove(j);
                }
            }

        }

        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }
}
