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
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }
}
