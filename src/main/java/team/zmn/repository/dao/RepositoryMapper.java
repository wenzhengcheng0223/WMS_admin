package team.zmn.repository.dao;

import java.util.List;
import team.zmn.repository.pojo.Repository;

public interface RepositoryMapper {
    int deleteByPrimaryKey(String repositoryId);

    int insert(Repository record);

    Repository selectByPrimaryKey(String repositoryId);

    List<Repository> selectAll();

    int updateByPrimaryKey(Repository record);
}