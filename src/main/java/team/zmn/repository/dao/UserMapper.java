package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.User;
import team.zmn.repository.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String user);

    int insert(User record);

    User selectByPrimaryKey(String user);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}