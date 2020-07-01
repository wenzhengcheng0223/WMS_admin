package team.zmn.repository.pojo;

import java.io.Serializable;

public class Repository implements Serializable {
    private String repositoryId;

    private String repositoryName;

    private String kinds;

    private static final long serialVersionUID = 1L;

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId == null ? null : repositoryId.trim();
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName == null ? null : repositoryName.trim();
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds == null ? null : kinds.trim();
    }
}