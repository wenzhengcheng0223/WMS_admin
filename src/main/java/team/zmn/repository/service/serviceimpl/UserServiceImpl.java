package team.zmn.repository.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.zmn.repository.dao.UserMapper;
import team.zmn.repository.pojo.Result;
import team.zmn.repository.pojo.User;
import team.zmn.repository.pojo.UserDto;
import team.zmn.repository.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 14:20
 */
@Service
public class UserServiceImpl implements UserService {
    private Result result = new Result();

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result selectAll() {
        List<UserDto> list = userMapper.selectAll();
        result.setCode(0);
        result.setMsg("success");
        result.setData(list);
        return result;
    }

    @Override
    public int delete(UserDto user) {

        int i = userMapper.deleteByPrimaryKey(user.getUser_id());
        return i;
    }

}

