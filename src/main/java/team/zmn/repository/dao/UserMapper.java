package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.User;
import team.zmn.repository.pojo.UserDto;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User selectByPrimaryKey(String userId);

    List<UserDto> selectAll();

    int updateByPrimaryKey(User record);
}