package team.zmn.repository.pojo;

import java.io.Serializable;
import java.util.Date;

public class ProductStock implements Serializable {
    private String pStockNo;

    private String pId;

    private String pName;

    private String pType;

    private Float pStockPrice;

    private Float pStockNumber;

    private Float pStockTotal;

    private String pSupplier;

    private String userId;

    private String pStockDate;

    private String pRemarks;

    private static final long serialVersionUID = 1L;

    public String getpStockNo() {
        return pStockNo;
    }

    public void setpStockNo(String pStockNo) {
        this.pStockNo = pStockNo == null ? null : pStockNo.trim();
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

    public Float getpStockPrice() {
        return pStockPrice;
    }

    public void setpStockPrice(Float pStockPrice) {
        this.pStockPrice = pStockPrice;
    }

    public Float getpStockNumber() {
        return pStockNumber;
    }

    public void setpStockNumber(Float pStockNumber) {
        this.pStockNumber = pStockNumber;
    }

    public Float getpStockTotal() {
        return pStockTotal;
    }

    public void setpStockTotal(Float pStockTotal) {
        this.pStockTotal = pStockTotal;
    }

    public String getpSupplier() {
        return pSupplier;
    }

    public void setpSupplier(String pSupplier) {
        this.pSupplier = pSupplier == null ? null : pSupplier.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getpStockDate() {
        return pStockDate;
    }

    public void setpStockDate(String pStockDate) {
        this.pStockDate = pStockDate;
    }

    public String getpRemarks() {
        return pRemarks;
    }

    public void setpRemarks(String pRemarks) {
        this.pRemarks = pRemarks == null ? null : pRemarks.trim();
    }
}