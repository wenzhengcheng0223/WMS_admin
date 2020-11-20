package team.zmn.repository.pojo;

import java.io.Serializable;

public class ProductMessage implements Serializable {
    private String pId;

    private String pName;

    private String pType;

    private Float pBalance1;

    private Float pStockPrice;

    private Float pDeliveryPrice;

    private String repositoryId;

    private String repositoryName;

    private static final long serialVersionUID = 1L;

    public Float getpBalance1() {
        return pBalance1;
    }

    public void setpBalance1(Float pBalance1) {
        this.pBalance1 = pBalance1;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public Float getpBalance() {
        return pBalance1;
    }

    public void setpBalance(Float pBalance) {
        this.pBalance1 = pBalance;
    }

    public Float getpStockPrice() {
        return pStockPrice;
    }

    public void setpStockPrice(Float pStockPrice) {
        this.pStockPrice = pStockPrice;
    }

    public Float getpDeliveryPrice() {
        return pDeliveryPrice;
    }

    public void setpDeliveryPrice(Float pDeliveryPrice) {
        this.pDeliveryPrice = pDeliveryPrice;
    }

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
}