package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.RepositoryMessage;
import team.zmn.repository.pojo.RepositoryMessageDto;

public interface RepositoryMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(RepositoryMessage record);

    RepositoryMessage selectByPrimaryKey(String id);

    List<RepositoryMessageDto> selectAll();

    int updateByPrimaryKey(RepositoryMessage record);
}