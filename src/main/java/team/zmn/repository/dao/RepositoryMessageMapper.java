package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.RepositoryMessage;

public interface RepositoryMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(RepositoryMessage record);

    RepositoryMessage selectByPrimaryKey(String id);

    List<RepositoryMessage> selectAll();

    int updateByPrimaryKey(RepositoryMessage record);
}