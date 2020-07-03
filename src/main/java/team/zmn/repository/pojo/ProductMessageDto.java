package team.zmn.repository.pojo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 12:36
 */

public class ProductMessageDto {
    private String id;

    private String p_id;

    private String p_name;

    private String p_type;

    private Float p_balance1;

    private Float p_stock_price;

    private Float p_delivery_price;

    private String repository_id;

    private String repository_name;

    private String kinds;

    private String p_balance;

    private static final long serialVersionUID = 1L;

    public String getRepository_id() {
        return repository_id;
    }

    public void setRepository_id(String repository_id) {
        this.repository_id = repository_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public Float getP_balance1() {
        return p_balance1;
    }

    public void setP_balance1(Float p_balance1) {
        this.p_balance1 = p_balance1;
    }

    public Float getP_stock_price() {
        return p_stock_price;
    }

    public void setP_stock_price(Float p_stock_price) {
        this.p_stock_price = p_stock_price;
    }

    public Float getP_delivery_price() {
        return p_delivery_price;
    }

    public void setP_delivery_price(Float p_delivery_price) {
        this.p_delivery_price = p_delivery_price;
    }

    public String getRepository_name() {
        return repository_name;
    }

    public void setRepository_name(String repository_name) {
        this.repository_name = repository_name;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getP_balance() {
        return p_balance;
    }

    public void setP_balance(String p_balance) {
        this.p_balance = p_balance;
    }
}
