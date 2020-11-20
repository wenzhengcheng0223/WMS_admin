package team.zmn.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import team.zmn.repository.pojo.RepositoryMessage;
import team.zmn.repository.pojo.RepositoryMessageDto;

public interface RepositoryMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(RepositoryMessage record);

    RepositoryMessage selectByPrimaryKey(String id);

    List<RepositoryMessageDto> selectAll();

    int updateByPrimaryKey(RepositoryMessage record);

    List<Float> selectBalance(@Param("p_id") String p_id,@Param("repository_id") String repository_id);
}