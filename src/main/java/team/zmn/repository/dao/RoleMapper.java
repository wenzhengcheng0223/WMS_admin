package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    Role selectByPrimaryKey(String roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}