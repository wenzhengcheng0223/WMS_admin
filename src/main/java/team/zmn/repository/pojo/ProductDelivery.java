package team.zmn.repository.pojo;

import java.io.Serializable;
import java.util.Date;

public class ProductDelivery implements Serializable {
    private String pDeliveryNo;

    private String pId;

    private String pName;

    private String pType;

    private Float pDeliveryPrice;

    private Float pDeliveryNumber;

    private Float pDeliveryTotal;

    private String userId;

    private String pDeliveryAddress;

    private String pPaymentMethod;

    private Date pDeliveryDate;

    private String pDeliveryRemarks;

    private static final long serialVersionUID = 1L;

    public String getpDeliveryNo() {
        return pDeliveryNo;
    }

    public void setpDeliveryNo(String pDeliveryNo) {
        this.pDeliveryNo = pDeliveryNo == null ? null : pDeliveryNo.trim();
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

    public Float getpDeliveryPrice() {
        return pDeliveryPrice;
    }

    public void setpDeliveryPrice(Float pDeliveryPrice) {
        this.pDeliveryPrice = pDeliveryPrice;
    }

    public Float getpDeliveryNumber() {
        return pDeliveryNumber;
    }

    public void setpDeliveryNumber(Float pDeliveryNumber) {
        this.pDeliveryNumber = pDeliveryNumber;
    }

    public Float getpDeliveryTotal() {
        return pDeliveryTotal;
    }

    public void setpDeliveryTotal(Float pDeliveryTotal) {
        this.pDeliveryTotal = pDeliveryTotal;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getpDeliveryAddress() {
        return pDeliveryAddress;
    }

    public void setpDeliveryAddress(String pDeliveryAddress) {
        this.pDeliveryAddress = pDeliveryAddress == null ? null : pDeliveryAddress.trim();
    }

    public String getpPaymentMethod() {
        return pPaymentMethod;
    }

    public void setpPaymentMethod(String pPaymentMethod) {
        this.pPaymentMethod = pPaymentMethod == null ? null : pPaymentMethod.trim();
    }

    public Date getpDeliveryDate() {
        return pDeliveryDate;
    }

    public void setpDeliveryDate(Date pDeliveryDate) {
        this.pDeliveryDate = pDeliveryDate;
    }

    public String getpDeliveryRemarks() {
        return pDeliveryRemarks;
    }

    public void setpDeliveryRemarks(String pDeliveryRemarks) {
        this.pDeliveryRemarks = pDeliveryRemarks == null ? null : pDeliveryRemarks.trim();
    }
}