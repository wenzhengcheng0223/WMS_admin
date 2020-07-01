package team.zmn.repository.pojo;

import java.io.Serializable;

public class RepositoryMessage implements Serializable {
    private String id;

    private String repositoryId;

    private String pId;

    private Float pBalance;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId == null ? null : repositoryId.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Float getpBalance() {
        return pBalance;
    }

    public void setpBalance(Float pBalance) {
        this.pBalance = pBalance;
    }
}